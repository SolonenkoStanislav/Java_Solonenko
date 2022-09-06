package com.hillel.solonenko.lessons.homework7;

import java.lang.Math;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {

        double firstGuessNumb = (int)(Math.random() * 10);
        System.out.println((int) firstGuessNumb);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number from 0 to 10 to try to guess the number PC set");

        int i = 3;
        for (; i > 0;) {
            if (scanner.hasNextInt()) {
                int valueOne = scanner.nextInt();
                System.out.println("Your number is = " + valueOne);
                    if (valueOne != firstGuessNumb || valueOne > 10 || valueOne < 0){
                        System.out.println("Wrong number, attempts left = " + (i - 1));
                        i -= 1;
                    } else {
                        System.out.println("You won!");
                        break;
                    }
            } else {
                System.out.println("Wrong value,try again!");
                scanner.nextLine();
            }
        }














//        System.out.println("Enter number from 1 to 10 to try to guess the number PC set");
//        int firstValue = 0;
//        int i = 3;
//        for (;i >= 0; i--) {
//            if (scanner.hasNextInt()){
//                firstValue = scanner.nextInt();
//                System.out.println("Your number is : " + firstValue);
//                if (firstValue == firstGuessNumb) {
//                    System.out.println("That's right! You won!");
//                    break;
//                } else {
//                    System.out.println("Wrong,attempts left = " + i);
//                }
//            }else {
//                System.out.println("Wrong value,try again!");
//                i = 0;
//            }
//            if (firstValue > 10 || firstValue < 0) {
//                System.out.println("Wrong value,try again");
//                i = 0;
//            }
//        }
//        if (i == 0 ||firstValue != firstGuessNumb){
//            System.out.println();
//            System.out.println("You lose, the set number was : " + (int)firstGuessNumb);
//        }
    }
}


