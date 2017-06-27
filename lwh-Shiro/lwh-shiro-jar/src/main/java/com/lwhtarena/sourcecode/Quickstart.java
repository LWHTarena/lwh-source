package com.lwhtarena.sourcecode;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: liwh
 * @Date: 2017/6/27 22:59
 * Description:shiro启用
 */
public class Quickstart {

    private static final transient Logger log = LoggerFactory.getLogger(Quickstart.class);

    public static void main(String[] args) {

        Factory factory = new IniSecurityManagerFactory("classpath:shiro.ini");
        SecurityManager securityManager = (SecurityManager) factory.getInstance();

        SecurityUtils.setSecurityManager(securityManager);

        /*******************
         * 获取当前的subject
         *******************/
        Subject currentUser =SecurityUtils.getSubject();

        /**************************
         * 获取session
         **************************/
        Session session =currentUser.getSession();
        session.setAttribute("someKey","aValue");
        String value = (String) session.getAttribute("someKey");
        if(value.equals("aValue")){
            log.info("当前value"+value);
        }

        /****************************************
         * 测试当前的用户是否已经被认证,即是否已经登陆
         * 调subject的isAuthenticated()
         ***************************************/
        if(!currentUser.isAuthenticated()){
            /******************************************
             * 把用户和密码封装为UsernamePasswordToken对象
             ******************************************/
            UsernamePasswordToken token = new UsernamePasswordToken("lonestarr", "vespa");
            /************
             * 记住我
             ************/
            token.setRememberMe(true);
            try {
                currentUser.login(token);
            }catch (UnknownAccountException uae){
                log.info("没有用户名的用户:"+token.getPrincipal());
            }catch (IncorrectCredentialsException ice){
                log.info("帐户密码不正确！");
            }catch (LockedAccountException lae){
                log.info("用户名帐户已锁定。请与您的管理员联系以解锁它");
            }catch (AuthenticationException ae){
                log.info("");
            }
        }

        log.info("User [" + currentUser.getPrincipal() + "] logged in successfully.");


        /*********************
         * 测试角色权限
         *********************/
        if (currentUser.hasRole("schwartz")) {
            log.info("May the Schwartz be with you!");
        } else {
            log.info("Hello, mere mortal.");
        }

        /***********************************
         * 测试类型化的权限（不是实例级别）
         ***********************************/
        if (currentUser.isPermitted("lightsaber:weild")) {
            log.info("You may use a lightsaber ring.  Use it wisely.");
        } else {
            log.info("Sorry, lightsaber rings are for schwartz masters only.");
        }

        /***********************************
         * 一个（非常强大的）实例级权限：
         ***********************************/
        if (currentUser.isPermitted("winnebago:drive:eagle5")) {
            log.info("你被允许开车车牌Winnebago（ID）的eagle5。这是钥匙-玩得开心！");
        } else {
            log.info("对不起，你不允许驾驶的eagle5的温尼贝戈！");
        }

        /********************
         * 退出登陆
         ********************/
        currentUser.logout();

        System.exit(0);
    }
}
