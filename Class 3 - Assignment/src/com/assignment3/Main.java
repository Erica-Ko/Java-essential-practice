package com.assignment3;

import java.util.Scanner;

public class Main {

//    Questions 1:
//    Take 5 subjects marks each subject 100 marks;
//    calculate the percentage;
//    based on the percentage print the grade and the percentage;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the mark of English Exam: ");
        int eng = in.nextInt();
        System.out.print("Enter the mark of Math Exam: ");
        int math = in.nextInt();
        System.out.print("Enter the mark of Chinese Exam: ");
        int chin = in.nextInt();
        System.out.print("Enter the mark of Physics Exam: ");
        int phy = in.nextInt();
        System.out.print("Enter the mark of Chemistry Exam: ");
        int chem = in.nextInt();

        int[] myScoreArray = {eng, math, chin, phy, chem};

        for (int num : myScoreArray)
        {
            if (num >= 80) {
                System.out.println("Grade A, Percentage: " + num + "%");
            } else if (num >= 50) {
                System.out.println("Grade B, Percentage: " + num + "%");
            } else if (num >= 30) {
                System.out.println("Grade C, Percentage: " + num + "%");
            } else {
                System.out.println("Grade F, Percentage: " + num + "%");
            }
        }
    }
}

