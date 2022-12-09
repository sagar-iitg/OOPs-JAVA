package com.sagar.constructor;




class Base {


    Base(){

        System.out.println("Base class constructor");
    }


    void fun(){
        System.out.println("Base fun");
    }

}

class Derived extends Base{


    Derived(){
        //super();
        System.out.println("I am in Derived class constructor");
    }

    void fun(){
        System.out.println("Derived fun");
    }
}

class Third extends Derived{

    Third(){
        System.out.println("Third class constructor");
    }
}
public class Example {


    public static void main(String[] args) {
       // Base b=new Derived();
       // Derived d= (Derived) new Base();
           // Derived d=new Derived();

      //  b.fun();

        Third t=new Third();

    }
}
