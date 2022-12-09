package com.sagar.inheritance.mode.of.inheritance;



class BaseClass{


    private int  age;

    protected int getAge(){
        return this.age;

    }

    void setAge(int x){
         this.age=x;
    }
}


class ChildClass extends BaseClass{


   public int getAge(){
        return 10;

    }

    void setAge(int x){
        x =10;
    }
    public static void main(String[] args) {

        ChildClass c=new ChildClass();

        System.out.println(c.getAge());
    }
}

public class Main {



}
