package com.sagar.association;


import java.util.HashSet;
import java.util.Set;

class Bank {

    // Attributes of bank
    private String name;

    private Set<Employee> employees;
    // Constructor of this class
    Bank(String name)
    {
        // this keyword refers to current instance itself
        this.name = name;
    }

    // Method of Bank class
    public String getBankName()
    {
        // Returning name of bank
        return this.name;
    }

    public void setEmployees(Set<Employee> employees){
        this.employees = employees;
    }
    public Set<Employee> getEmployees(Set<Employee> employees){
        return this.employees;
    }
}
class Employee {
    // Attributes of employee
    private String name;
    // Employee name
    Employee(String name)
    {
        // This keyword refers to current instance itself
        this.name = name;
    }
 
    // Method of Employee class
    public String getEmployeeName()
    {
        // returning the name of employee
        return this.name;
    }
}

class GFG {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating objects of bank and Employee class
        Bank bank = new Bank("ICICI");
        Employee emp = new Employee("Ridhi");
        Employee emp1 = new Employee("Sagar");

        Set<Employee> employees = new HashSet<>();
        employees.add(emp);
        employees.add(emp1);

        bank.setEmployees(employees);

        System.out.println(emp.getEmployeeName()+" is employee of "+bank.getBankName());
        System.out.println(emp1.getEmployeeName()+" is employee of "+bank.getBankName());

        System.out.println("Expalnation");
        System.out.println("In the above example,\n two separate classes Bank and Employee are associated through their Objects. \nBank can have many employees, So it is a one-to-many relationship. ");
    }
}