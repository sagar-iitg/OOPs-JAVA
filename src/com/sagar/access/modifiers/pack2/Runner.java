package com.sagar.access.modifiers.pack2;

import com.sagar.access.modifiers.pack1.Human;

public class Runner extends Human{

    public static void main(String[] args) {
        Human h=new Human();
        Runner r=new Runner();

        //cannot acesss it
        //System.out.println(h.a);
        //cannot acesss it
        //System.out.println(h.b);
        System.out.println(r.b);
        System.out.println(r.c);
        //System.out.println(r.d);
        System.out.println(h.c);
        //System.out.println(h.d);



    }
}
