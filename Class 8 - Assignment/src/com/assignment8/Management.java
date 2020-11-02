package com.assignment8;

import java.util.ArrayList;
import java.util.Scanner;

public class Management {
    ArrayList<Employee> employee = new ArrayList<>();
    Employee e;
    Scanner sc = new Scanner(System.in);

    public void addEmployee(){
        int mgmtChoice;
        int employeeType;
        do {
            System.out.println("What type of employee you would like to add?");
            System.out.println("1-Doctor / 2-Engineer / 3-Pilot");
            employeeType = sc.nextInt();
            switch (employeeType) {
                case 1: {
                    e = new Doctor();
                    break;
                }
                case 2: {
                    e = new Engineer();
                    break;
                }
                case 3: {
                    e = new Pilot();
                    break;
                }
                default:
                    System.out.println("Please input a valid type of employee.");
            }
            employee.add(e);
            System.out.println("Do u want to add one more employee ? 1-yes / 0-no");
            mgmtChoice = sc.nextInt();
        } while (mgmtChoice==1);
    }

    public void viewEmployees(){
        if(employee.size()!=0){
            for(Employee item: employee){
                if(!item.getDeleted()){
                    item.displayEmployee();
                    System.out.println();
                }
            }
        }
        else{
            System.out.println("0 employee record");
        }
    }

    public void deleteEmployee() {
        System.out.println("Enter the name of employee u want to delete");
        sc.nextLine();
        String name = sc.nextLine();
        if (employee.size() != 0) {
            for (int i = 0; i < employee.size(); i++) {
                if (employee.get(i).name.equals(name) & !employee.get(i).getDeleted()) {
                    employee.get(i).setDeleted(true);
                }
            }
        } else {
            System.out.println("You have 0 employee");
        }
    }
}
