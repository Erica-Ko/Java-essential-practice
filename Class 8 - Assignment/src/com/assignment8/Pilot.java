package com.assignment8;

import java.util.Scanner;

public class Pilot extends Employee{

    private int flightExp;
    Scanner sc = new Scanner(System.in);

    public Pilot() {
        System.out.println("Please input the detail of the pilot");
        System.out.println("Name?");
        name = sc.nextLine();
        System.out.println("Age?");
        age = sc.nextInt();
        System.out.println("Salary?");
        salary = sc.nextFloat();
        System.out.println("Designation?");
        sc.nextLine();
        designation = sc.nextLine();
        System.out.println("Flight experience?");
        flightExp = sc.nextInt();
    }

    public void displayEmployee() {
        System.out.println("Name: "+name+" Age: "+age+" Salary: "+salary+" Designation: "+designation+" Flight experience: "+flightExp);
    }

    public int getFlightExp() {
        return flightExp;
    }

}
