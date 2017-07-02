package com.lwhtarena.sourcecode.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: liwh
 * @Date: 2017/7/2 14:48
 * Description:
 */
public class TestBeans {
    public static void main(String[] args) {
        ApplicationContext ctx =new ClassPathXmlApplicationContext("applicationContext.xml");

        DataSource dataSource =ctx.getBean(DataSource.class);
        System.out.println(dataSource.getProperties());

        Person person4 = (Person) ctx.getBean("person4");
        System.out.println(person4.toString());

        Person person5 = (Person) ctx.getBean("person5");
        System.out.println(person5.toString());
    }
}
