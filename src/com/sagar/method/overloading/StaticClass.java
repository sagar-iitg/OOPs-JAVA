package com.sagar.method.overloading;


class Test {
    public static void foo() {
        System.out.println("Test.foo() called ");
    }
    public static void foo(int a) {
        System.out.println("Test.foo(int) called "+a);
    }
    public static void foo(Object a) {
        System.out.println("Test.foo(Object) called "+a);
    }
    public static void foo(String a) {
        System.out.println("Test.foo(String) called "+a);
    }
    public static void foo(Integer a) {
        System.out.println("Test.foo(Integer) called "+a);
    }

}
public class StaticClass {


    public static void main(String args[])
    {
        Test.foo();
        Test.foo(10);
        Test.foo(new Integer(25));
        Test.foo('a');
        Test.foo("a");
    }
}
