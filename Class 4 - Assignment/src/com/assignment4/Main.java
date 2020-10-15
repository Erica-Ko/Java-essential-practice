package com.assignment4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Question 1
        Avenger[] avengers = new Avenger[5];
        for(int i=0;i<5;i++)
        {
            avengers[i] = new Avenger();
        }
        System.out.println("Avenger number:" + avengers.length + '\n');
        avengers[0] = new Avenger("Erica", 99, 100, "Gun", "Earth");
//        String[] arrA1 = avengers[0].getDetails();
        for (String details : avengers[0].getDetails()) {
            System.out.println(details);
        }
        System.out.println();
        avengers[0].displayDetails();
        System.out.println();

        // Question 2
        int[] arrInt1 = {12, 4, 5, 2, 5};
        for (int number : arrInt1) {
            if (number % 2 != 0) {
                System.out.print(number + ", ");
            }
        }
        System.out.println();

        // Question 3
        Scanner in = new Scanner(System.in);
        int[] arrInt2 = new int[5];
        int sum = 0;
        for(int i=0;i<5;i++) {
            System.out.print("Enter number " + (i+1) +": ");
            arrInt2[i] = in.nextInt();
            sum += arrInt2[i];
        }
        System.out.print("The sum of the array elements is: " + sum);

    }
}
