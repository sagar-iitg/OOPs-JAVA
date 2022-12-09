package com.sagar.inheritance.pkg1;




interface A{

     default void fun(){
        System.out.println("Interface A fun() method");
    }
}


interface B{

    default void fun(){
        System.out.println("Interface B fun() method");
    }
}

// Helper class
class C {

    // Main driver method
    public void fun()
    {

        // Print statement when m1() of classD is called
        System.out.println("Class C fun() method");
    }
}

public class Test extends C implements A, B{


    public static void main(String[] args) {
        Test obj=new Test();
        obj.fun();
    }
}
