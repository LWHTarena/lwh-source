package com.lwhtarena.sourcecode.Generic;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;

/**
 * @Author:liwenhao
 * @Description:<p></p>
 * @Date 17:17 2017/5/28
 */
public class Method {

    public static <T> void test(T t){
        System.out.println(t);
    }

    public static <T extends List> void test(T t){
        System.out.println(t);
        t.add("aaa");
    }

    public static <T extends Closeable> void test(T... a){
        for(T tem:a){
            try {
                if(null!=tem){
                    tem.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

    }
}
