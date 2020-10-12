package com.employee;

public class Employee {
    private String Name;
    private int Age;
    private String City;

    public Employee(String name, int age, String city) {
        Name = name;
        Age = age;
        City = city;
    }

    public void getEmployeeInfo() {
        System.out.println("The name is " + Name);
        System.out.println("The age is " + Age);
        System.out.println("The city is " + City);
    }
}


