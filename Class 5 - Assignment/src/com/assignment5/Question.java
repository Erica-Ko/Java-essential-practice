package com.assignment5;
import java.util.Scanner;
public class Question {
    String detail, option1, option2, option3, option4;
    int correctAns, userAns;
    Scanner sc = new Scanner(System.in);

    public boolean askQuestion() {
        System.out.println(detail);
        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);
        System.out.println(option4);
        userAns = sc.nextInt();
        return correctAns == userAns;
    }

}
