package com.assignment5;
import java.util.Scanner;

public class Player {
    String name;
    int score;
    Scanner sc = new Scanner(System.in);

    public void askDetails() {
        System.out.println("Hello, what is your name? ");
        name = sc.nextLine();
    }
}
