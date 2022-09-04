package com.hillel.solonenko.lessons.homework7;

import java.lang.Math;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {

        double firstGuessNumb = (Math.random() * 10);
        System.out.println((int) firstGuessNumb);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0;; i++) {
            int firstValue = 0;
            if (scanner.hasNextInt()) {
                firstValue = scanner.nextInt();
                System.out.println("You entered : " + firstValue);
            }
            if (firstValue > 10 || firstValue < 0) {
                System.out.println("Wrong number, try again!");
                scanner.nextLine();
            } else {
                System.out.println("Wrong number, try again!");
            }
    }
}}


