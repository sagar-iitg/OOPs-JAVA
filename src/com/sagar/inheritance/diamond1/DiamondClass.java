package com.sagar.inheritance.diamond1;

interface DemoInterface {
   void display();
}

interface DemoInterface2 extends  DemoInterface
{
    void display();
}
interface DemoInterface3 extends  DemoInterface
{
    void display();

}



public class DiamondClass implements DemoInterface3,DemoInterface2
{
//    public void display()
//    {
//          DemoInterface1.super.display();
//        DemoInterface2.super.display();
//    }

    public static void main(String[] args) {
        DiamondClass obj=new DiamondClass();
        obj.display();
    }

   @Override
    public void display() {
        System.out.println("hello");
    }
}
