package com.assignment8;

import java.util.Scanner;

public class Engineer extends Employee {
    private boolean isLicensed;
    Scanner sc = new Scanner(System.in);

    public Engineer() {
        System.out.println("Please input the detail of the engineer");
        System.out.println("Name?");
        name = sc.nextLine();
        System.out.println("Age?");
        age = sc.nextInt();
        System.out.println("Salary?");
        salary = sc.nextFloat();
        System.out.println("Designation?");
        sc.nextLine();
        designation = sc.next();
        System.out.println("Is licensed?");
        isLicensed = sc.nextBoolean();
    }

    public void displayEmployee() {
        System.out.println("Name: "+name+" Age: "+age+" Salary: "+salary+" Designation: "+designation+" Licensed?: "+isLicensed);
    }

    public Boolean getIsLicensed() {
        return isLicensed;
    }

}
