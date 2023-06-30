package com.sagar.innerclass;

import java.util.Map;

public class OuterClass {

        int instanceVariable=10;
        static int classVariable=20;

        static  class NestedClass{
//            OuterClass o=new OuterClass();

            public void print(){
                System.out.println(classVariable);
               // System.out.println(o.instanceVariable);

            }
        }

    public static void main(String[] args) {


            OuterClass.NestedClass nestedObj=new OuterClass.NestedClass();
            nestedObj.print();

    }

}
