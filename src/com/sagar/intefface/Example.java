package com.sagar.intefface;



class ClassA{
    void doSomething()
    {
        //code here

        //code here
        System.out.println("I am in class A doSomething method");
    }
}


interface  Interface1{
    default void doSomething()
    {

        //code here
        System.out.println("I am in Interface1 doSomething method");
    }
}

class ClassB extends ClassA implements Interface1 {
    @Override
    public void doSomething() {
        Interface1.super.doSomething();
    }
}
public class Example {
}
