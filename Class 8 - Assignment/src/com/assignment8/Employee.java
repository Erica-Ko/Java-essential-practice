package com.assignment8;

public class Employee {
    protected String name;
    protected int age;
    protected float salary;
    protected String designation;
    private boolean isDeleted=false;

    public void displayEmployee() {
        System.out.println(name+" "+age+" "+salary+" "+designation);
    }
    public String getName() {
        return  name;
    }

    public String getDesignation() {
        return designation;
    }

    public int getAge() {
        return age;
    }
    public float getSalary() {
        return salary;
    }

    public void setDeleted(boolean isDeleted){
        this.isDeleted=isDeleted;
    }

    public boolean getDeleted(){
        return isDeleted;
    }

}
