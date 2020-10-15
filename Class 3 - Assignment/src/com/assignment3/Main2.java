package com.assignment3;
import java.util.Scanner;
import java.time.LocalDate;

//Take employee name,date of birth,month of birth
////        birth year, monthly salary;
////        5l - 20%;
////        4l - 15%;
////        3l- 10%;
////        2l -5%;
////       Display name,age,annual salary and the tax amount
public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name of the employee: ");
        String name = in.nextLine();
        System.out.print("Enter date of birth of the employee: ");
        int date = in.nextInt();
        System.out.print("Enter month of birth of the employee: ");
        int month = in.nextInt();
        System.out.print("Enter year of birth of the employee: ");
        int year = in.nextInt();
        System.out.print("Enter monthly salary of the employee:");
        float salary = in.nextFloat();
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - year;

        float tax;
        if (salary >= 5) {
            tax = salary*20/100 ;
        } else if (salary >= 4) {
            tax = salary*15/100 ;
        } else if (salary >= 3) {
            tax = salary*10/100 ;
        } else if (salary >= 2) {
            tax = salary*5/100 ;
        }   else {
            tax = 0 ;
        }

        System.out.print("The name of the employee: " + name + "\n" +
                "The age of the employee: " + age + "\n" +
                "The annual salary of the employee: " + salary + "\n" +
                "The annual tax amount of the employee: " + tax
        );
    }
}
