package com.navis.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String args[]){

        // 1. reference and instance are same
        Living l = new Living();
        Animal a = new Animal();
        Plant p = new Plant();
        Dog d = new Dog();

        //2.
        Living l1 = new Animal();
        l1 = new Plant();
        Living l2 = new Plant();
        Living l3 = new Dog();

        //3.
       // Animal a1 = new Living();  // failed

        //4.
        Living lar[] = new Animal[2];

        //5.
        //ArrayList<Living> al = new ArrayList<Animal>();   // can't have different types on each side

        List<Animal> al = new ArrayList<Animal>();
        al.add(new Dog());      // list allows subtypes in it i.e Dos in Animal
        al.add(new Animal());
        //al.add(Plant());
        //al.add(Living());
        System.out.println(al);
        method(al);
        //method2(al);

       // ArrayList<String> strList = new ArrayList<>();
       // method2(strList);
       // method3(al);

    }


    static void method(List<? extends Living> list){            // extends creates read-only list
        System.out.println(list.get(1) + " from method()");
       // list.add(new Dog());
    }

    static void method2(List<?> list){

    }

    static void method3(List<? super Dog> list){        // it does not creates read-only list
        list.add(new Dog());
    }

}
