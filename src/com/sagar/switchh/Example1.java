package com.sagar.switchh;




public class Example1 {


    public static void main(String[] args) {
        System.out.println(test(4));
    }

    public static int test(int k)
    {

        int x=1;
        switch(k){
            case 1: x++;
            case 2: x++;
            case 3: x++;
                   // System.out.println("case3"+ x);
            case 4: x++;
                //System.out.println("case4"+x);
            case 5: x++;
               // System.out.println("case5"+x);
            case 6: x++;
                //System.out.println("case6"+x);
            default:x++;
               // System.out.println("default"+x);

        }
        System.out.println(k+" "+x);
        return x+k;
    }
}
