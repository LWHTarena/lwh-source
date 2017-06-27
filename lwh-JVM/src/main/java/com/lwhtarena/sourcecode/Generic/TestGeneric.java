package com.lwhtarena.sourcecode.Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:liwenhao
 * @Description:<p></p>
 * @Date ${TIME} ${DATE}
 *
 */
public class TestGeneric {

//    public static void printPersionInfo(List<Person> persions){
//        for (Person p:persions){
//            System.out.println(p);
//        }
//    }

    public static void printPersonInfo(List<? extends Person> persons){
        for(Person p:persons){
            System.out.println(p);
        }
    }

    public static void printObjectInfo(List<?> persons){
        for(Object o:persons){
            System.out.println(o);
        }
    }

    public static void main(String[] args) {

        List<Student> students =new ArrayList<Student>();
        students.add(new Student("bb",12,"angular"));
        printPersonInfo(students);
        printObjectInfo(students);

        List<Person> personList =new ArrayList<Person>();
        personList.add(new Person("aa",12));
        printPersonInfo(personList);
        printObjectInfo(personList);

    }
}
