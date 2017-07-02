package com.lwhtarena.sourcecode.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: liwh
 * @Date: 2017/7/2 1:59
 * Description:
 */
public class TestMain {
    public static void main(String[] args) {

        /***********************
         *  传统
         ***********************/
        Helloworld helloworld =new Helloworld();
        helloworld.setName("liwenhao");
        helloworld.sayHello();

        /**************************
         * 1、创建spring的ioc容器（ApplicationContext即是容器【接口】）
         * 2、从ioc容器中获取Bean实例
         **************************/
        ApplicationContext ctx =new ClassPathXmlApplicationContext("applicationContext.xml");
        Helloworld hello = (Helloworld) ctx.getBean("hello");
        hello.sayHello();

//        Helloworld obj =ctx.getBean(Helloworld.class);
//        obj.sayHello();

//        Car car =ctx.getBean(Car.class);
        Car car = (Car) ctx.getBean("car");
        System.out.println(car.toString());

        Car car2 = (Car) ctx.getBean("car2");
        System.out.println(car2.toString());

        Person person = (Person) ctx.getBean("person");
        System.out.println(person.toString());

        Person person2 = (Person) ctx.getBean("person2");
        System.out.println(person2.toString());

        Person person3 = (Person) ctx.getBean("person3");
        System.out.println(person3.toString());


    }
}
