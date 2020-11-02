package com.assignment8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Management mgmt = new Management();
        int doit;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Welcome to the employee management system");
            System.out.println("1 - Add Employee / 2 - View Employee / 3 - Delete Employee");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    mgmt.addEmployee();
                    break;
                }
                case 2: {
                    mgmt.viewEmployees();
                    break;
                }
                case 3: {
                    mgmt.deleteEmployee();
                    break;
                }
                default:
                    System.out.println("Please input valid option");
            }
            System.out.println("do u want to continue? 1-yes/ 0-no");
            doit=sc.nextInt();
        } while (doit ==1);
    }
}
