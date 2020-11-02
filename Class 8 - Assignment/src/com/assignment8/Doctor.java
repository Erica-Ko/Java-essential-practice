package com.assignment8;

import java.util.ArrayList;
import java.util.Scanner;

public class Doctor extends Employee {
    private String specialisation;
    private ArrayList<String> qualification = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private int choice;

    public Doctor() {
        System.out.println("Please input the detail of the doctor");
        System.out.println("Name?");
        name = sc.nextLine();
        System.out.println("Age?");
        age = sc.nextInt();
        System.out.println("Salary?");
        salary = sc.nextFloat();
        System.out.println("Designation?");
        sc.nextLine();
        designation = sc.nextLine();
        System.out.println("Specialisation?");
        specialisation = sc.nextLine();
        System.out.println("Any qualification? 1 - Yes / 0 - No");
        choice = sc.nextInt();
        while (choice==1) {
            System.out.println("Input the qualification:");
            qualification.add(sc.next());
            System.out.println("Any more qualification? 1 - Yes / 0 - No");
            choice = sc.nextInt();
        }
    }

    public void displayEmployee() {
        System.out.println("Name: "+name+" Age: "+age+" Salary: "+salary+" Designation: "+designation+" Specialisation: "+specialisation);
        System.out.println("Qualifications:");
        for (String item : qualification){
            System.out.print(item+ " ");
        }
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public  ArrayList<String> getQualification() {
        return qualification;
    }
}
