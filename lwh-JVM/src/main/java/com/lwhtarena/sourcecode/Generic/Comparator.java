package com.lwhtarena.sourcecode.Generic;

/**
 * @Author:liwenhao
 * @Description:<p>泛型接口  与 泛型类  同理</p>
 * @Date 18:05 2017/5/28
 */
public interface Comparator<T> {
    //全局常量
    public static final int MAX_VALUE=100;
    //公共抽象方法
    public abstract void test(T t);
}


//实现
class InterC1<A> implements Comparator{

    public void test(Object t) {

    }
}
class InterC2<A> implements Comparator<Integer>{

    public void test(Integer t) {
        // TODO Auto-generated method stub

    }
}
class InterC3<T,A> implements Comparator<T>{

    public void test(T t) {

    }
}
