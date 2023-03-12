package com.sagar.mcq;

public class Example1 {


    public static void main(String[] args) {

        char chars[]={'a','b','c'};
        String s=new String(chars);
        System.out.println(s.getClass().getName()+ " "+s);

        String s1=new String(chars,1,2);
        System.out.println(s1);

        int[]  arr=new int[]{65,66,67,97};

        String s2=new String(arr,1,3);
        System.out.println(s2);





    }
}
