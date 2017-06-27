package com.lwhtarena.sourcecode;

import java.io.IOException;
import java.io.InputStream;

/**
 * 类加载器
 */
public class ClassLoadTest {
    public static void main(String[] args) {

        /**
         * 加载与自己在同一路径下的class文件
         */

        ClassLoader myloader =new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {

                try {
                    String fileName =name.substring(name.lastIndexOf(".")+1);
                    InputStream is =null;
                    is =getClass().getResourceAsStream(fileName);
                    if(is ==null){
                        return super.loadClass(name);
                    }
                    byte[] b =new byte[is.available()];
                    is.read(b);
                    return defineClass(name,b,0,b.length);
                } catch (IOException e) {
                    throw new ClassNotFoundException(name);
                }

            }
        };
        Class clazz =null;
        Object obj =null;

        try {
            clazz =myloader.loadClass("com.lwhtarena.sourcecode.ClassLoadTest");
            obj =clazz.newInstance();
            System.out.println(clazz);
            System.out.println(obj instanceof com.lwhtarena.sourcecode.ClassLoadTest);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
