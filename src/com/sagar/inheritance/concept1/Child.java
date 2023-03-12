package com.sagar.inheritance.concept1;



abstract class Parent{
    public Parent()
    {
        System.out.println("Parent class");
    }
}
public class Child extends Parent{


    public Child(){
        System.out.println("Child class");
    }

    public static void main(String[] args) {

        Parent p=new Child();

    }
}
