package com.sagar.innerclass.pack1;

public class OuterClass {

    int instanceVariable=10;
    static int classVariable=20;

    private static  class NestedClass{


        public  void print(){
            System.out.println(classVariable);
            // System.out.println(o.instanceVariable);

        }
    }

    public void display(){
        NestedClass nestedObj=new NestedClass();
        nestedObj.print();
    }





}
