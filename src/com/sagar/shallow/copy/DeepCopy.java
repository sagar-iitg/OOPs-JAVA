package com.sagar.shallow.copy;

import java.util.Arrays;

public class DeepCopy implements Cloneable {


    int a=10;
    int arr[]=new int[]{10,20,30,40};

    @Override
    public Object clone() throws CloneNotSupportedException {

        DeepCopy d=(DeepCopy) super.clone();
        d.arr=new int[]{10,20,30,40};
        d.a=a;
        return d;
    }
    void modifyArray(){
        arr[0]=0;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepCopy obj1=new DeepCopy();
        //System.out.println(obj1.a);
        DeepCopy obj2=(DeepCopy) obj1.clone();
        obj1.a=100;
        System.out.println(obj2.a);
        obj1.modifyArray();
        System.out.println(Arrays.toString(obj2.arr));
        System.out.println(Arrays.toString(obj1.arr));

        System.out.println(obj1.a==obj2.a);
        System.out.println(obj1==obj2);
        System.out.println(obj1.arr==obj2.arr);

    }
}
