package com.lwhtarena.sourcecode.spring.beans;


/**
 * @Author: liwh
 * @Date: 2017/7/2 1:55
 * Description:
 */
public class Helloworld {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("hello: "+ name);
    }
}
