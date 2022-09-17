package com.hillel.solonenko.lessons.homework11;

import java.util.Arrays;
import java.util.Scanner;

public class homework11 {
    public static void main(String[] args) {

//        Транспонуйте матрицю M x N. Розміри M та N задаються з консолі.
//        Після введення повинні автоматично створюватися два масиви розміром M x N перший та N x M другий.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first M value(from 2 to infinity)");
        for (int i = 1; i > 0; i++) {
            if (scanner.hasNextInt()) {
                int[] valueM = new int[scanner.nextInt()];
                System.out.println("Your matrix is " + (Arrays.toString(valueM)));
                i--;
            } else {
                System.out.println("Wrong data, try again");
                scanner.nextLine();
            }
        }
    }
}
