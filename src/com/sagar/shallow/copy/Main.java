package com.sagar.shallow.copy;

import java.util.Arrays;

class ShallowCopy implements Cloneable {





    int a=10;

    int arr[]=new int[]{10,20,30};

   @Override
    public Object clone() throws CloneNotSupportedException{
        return (ShallowCopy)super.clone();
    }
    public void modifyarray()
    {
        arr[0]=0;
    }


}

public class Main{

    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowCopy s=new ShallowCopy();
        ShallowCopy s1=(ShallowCopy) s.clone();
        s.modifyarray();
        s.a=25;
        System.out.println(s1.a);
        System.out.println(Arrays.toString(s1.arr));
        System.out.println(s==s1);

    }

}