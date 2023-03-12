package com.sagar.inheritance.static1;



class A{

    public static void fun(){
        System.out.println("fun() method of class A");
    }

    void hello(){
        System.out.println("hello() method of cLASS A");
    }
}



class B extends  A{


    public static void fun(){
        System.out.println("fun() method of class B");
    }


    void hello(){
        System.out.println("hello() method of cLASS B");
    }
}



public class Test {



    public static void main(String[] args) {
        A a=new B();
        a.fun();


        a.hello();

        B b=new B();
        b.fun();
        b.hello();


        A a1 = new A();
        a1.hello();
        a1.fun();


    }
}
