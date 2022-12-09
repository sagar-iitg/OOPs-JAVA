package com.sagar.inheritance;


interface One{



    int x=1;

     void fun1();

}
interface Two{



    int x=2;
    int y=2;

      void fun2();

}
public class Example1 implements One,Two{



    public void fun1(){
        System.out.println("fun1 method");

    }
    public void fun2(){
        System.out.println("fun2 method");

    }
    public static void main(String[] args) {

        Example1 e=new Example1();
        e.fun1();
        e.fun2();
        System.out.println(One.x);
        System.out.println(e.y);
     //   System.out.println(e.);

        //e.x;

    }

}
