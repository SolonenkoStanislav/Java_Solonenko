package com.hillel.solonenko.lessons.homework11;

import java.util.Arrays;
import java.util.Scanner;

public class homework11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Транспонуйте матрицю M x N. Розміри M та N задаються з консолі.
//        Після введення повинні автоматично створюватися два масиви розміром M x N перший та N x M другий.


        int temp = 0;
        int temp1 = 0;

        System.out.println("Enter M array size(from 2 to infinity)");
        for (int i = 0; i < 1; ) {
            if (scanner.hasNextInt()) {
                temp = scanner.nextInt();
                i++;
                if (temp < 2) {
                    System.out.println("Wrong value try again!");
                    i--;
                }
            } else {
                System.out.println("Wrong value, try again!");
                scanner.nextLine();
            }
        }
        System.out.println("Your value is " + temp);

        System.out.println();

        System.out.println("Enter N array size(from 2 to infinity)");
        for (int i = 0; i < 1; ) {
            if (scanner.hasNextInt()) {
                temp1 = scanner.nextInt();
                i++;
                if (temp1 < 2) {
                    System.out.println("Wrong value try again!");
                    i--;
                }
            } else {
                System.out.println("Wrong value, try again!");
                scanner.nextLine();
            }
        }
        System.out.println("Your value is " + temp1);

        int[][] matrixValue = new int[temp][temp1];

        System.out.println();
        System.out.println("Before");
        if (temp < temp1) {
            for (int i = 0; i < matrixValue.length; i++) {
                for (int j = i + 1; j < matrixValue.length; j++) {
                    int temp2 = matrixValue[i][j];
                    matrixValue[i][j] = matrixValue[j][i];
                    matrixValue[j][i] = temp2;
                }
            }
        } else {
            for (int i = 0; i < matrixValue.length; i++) {
                for (int j = i + 1; j < matrixValue[i].length; j++) {
                    int temp2 = matrixValue[i][j];
                    matrixValue[i][j] = matrixValue[j][i];
                    matrixValue[j][i] = temp2;
                }
            }
        }

        for (int i = 0; i < matrixValue.length; i++) {
            for (int j = 0; j < matrixValue[i].length; j++) {
                matrixValue[i][j] = (int) (Math.random() * 101);
            }
        }

        for (int i = 0; i < matrixValue.length; i++) {
            for (int j = 0; j < matrixValue[i].length; j++) {
                System.out.print(matrixValue[i][j] + "\t");
            }
            System.out.println();
        }

        if (temp > temp1) {
            for (int i = 0; i < matrixValue.length; i++) {
                for (int j = i + 1; j < matrixValue[i].length; j++) {
                    int temp3 = matrixValue[j][i];
                    matrixValue[i][j] = matrixValue[j][i];
                    matrixValue[i][j] = temp3;
                }
            }
        } else {
            for (int i = 0; i < matrixValue.length; i++) {
                for (int j = i + 1; j < matrixValue.length; j++) {
                    int temp3 = matrixValue[i][j];
                    matrixValue[i][j] = matrixValue[j][i];
                    matrixValue[j][i] = temp3;
                }
            }
        }

        System.out.println("After");
        for (int i = 0; i < matrixValue.length; i++) {
            for (int j = 0; j < matrixValue[i].length; j++) {
                System.out.print(matrixValue[i][j] + "\t");
            }
            System.out.println();
        }
    }
}