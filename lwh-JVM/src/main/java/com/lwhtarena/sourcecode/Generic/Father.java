package com.lwhtarena.sourcecode.Generic;

/**
 * @Author:liwenhao
 * @Description:<p>泛型父类</p>
 * <p>
 *     保留 --泛型子类
 *       1）全部保留
 *       2）部分保留
 *
 *     不保留 --按需实现
 *       1）具体类型
 *       2）没有类型，擦除 Object
 *
 * 泛型父类，子类为富二代
 *    1、保留父类泛型 -->子类为泛型
 *    2、不保留父类泛型 -->子类按需实现
 *
 * 属性 及方法 类型 -->随位置而定
 *    1)、子类重写方法的类型 -->随父类而定
 *        子类新增方法的类型 -->随子类而定
 *    2)、子类中使用父类的属性 -->随父类而定
 *        子类中使用自己的属性 -->随子类而定
 * </p>
 *
 * @Date 17:34 2017/5/28
 */
public abstract class Father<T1,T2> {
    T1 age;
    public abstract void test(T2 name);

}


//保留  -->泛型子类
//1)、全部保留
class C1<A,B,T1,T2> extends Father<T1,T2>{
    A sex;
    public void test(T2 name) {
        //this.age ---T1
        T1 age = this.age;
    }
    public void test2(A a){

    }
}

//2)、部分保留
class C2<T2,A,B> extends Father<Integer,T2>{

    public void test(T2 name) {
      //this.age ---Integer
        Integer age = this.age;
    }
}

//不保留  -->按需实现
//1)、具体类型
class C3<A,B> extends Father<Integer,String>{

    public void test(String name) {
        //this.age --->Integer
        Integer age = this.age;
    }
}

//2)、没有类型 擦除 Object
class C4<A,B> extends Father{

    public void test(Object name) {
        //this.age----object
        Object age = this.age;
    }
}