package com.sagar.access.modifiers.pack1;

public class Main {

    public static void main(String[] args) {
        Human h=new Human();

        //a is private field in Human class can't access it.
        //System.out.println(h.a);
        //protected field {b}
        System.out.println(h.b);
        //public field{c}
        System.out.println(h.c);
        //default
        System.out.println(h.d);


    }
}
