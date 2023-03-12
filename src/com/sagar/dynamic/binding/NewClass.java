package com.sagar.dynamic.binding;

import javax.security.sasl.SaslServer;

public class NewClass {




    public static class Superclass{


        void print(){
            System.out.println("print in superclass");
        }
    }


    public static class Subclass extends Superclass{
        void print()
        {
            System.out.println("print in subclass");
        }
    }
    public static void main(String[] args) {


        Superclass s=new Superclass();
        s.print();
        Superclass s1=new Subclass();
        s1.print();
        Subclass s2=new Subclass();
        s2.print();


        //synatx error (compile time error)

        //Subclass s3=new Superclass();


    }

}
