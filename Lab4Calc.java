package com.humber.java1;

import java.util.Scanner;

public class Lab4Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer to check: ");
        int userNumber = scanner.nextInt();

        if (userNumber % 4 == 0 && userNumber % 5 == 0) {
            System.out.println("Is " + userNumber + " divisible by 4 and 5? True");
        } else {
            System.out.println("Is " + userNumber + " divisible by 4 and 5? False");
        }

        if (userNumber % 4 == 0 || userNumber % 5 == 0) {
            System.out.println("Is " + userNumber + " divisible by 4 or 5? True");
        } else {
            System.out.println("Is " + userNumber + " divisible by 4 or 5? False");
        }

        if ((userNumber % 4 == 0 || userNumber % 5 == 0) && !(userNumber % 4 == 0 && userNumber % 5 == 0)) {
            System.out.println("Is " + userNumber + " divisible by 4 or 5 but not both? True");
        } else {
            System.out.println("Is " + userNumber + " divisible by 4 or 5 but not both? False");
        }
    }
}
