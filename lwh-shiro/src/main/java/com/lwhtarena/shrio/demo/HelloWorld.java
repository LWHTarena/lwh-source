package com.lwhtarena.shrio.demo;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.util.Factory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author:liwenhao
 * @Description:<p>shiro 的demo</p>
 * @Date 22:30 2017/6/1
 */
public class HelloWorld {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String[] args) {

        Factory<SecurityManager> factory =new IniSecurityManagerFactory("classpath:shiro.ini");
        SecurityManager securityManager =factory.getInstance();

        //获取当前的subject，调用setSecurityManager()
        SecurityUtils.setSecurityManager(securityManager);

    }

}
