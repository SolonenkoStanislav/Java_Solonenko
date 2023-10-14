package com.hillel.solonenko.lessons.homework11;

import java.util.Arrays;
import java.util.Scanner;


public class homework112 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] array = {
                {2,3,5,6},
                {4,5,6,3,6,2},
        };
        System.out.println("Оригинальная матрица");
        System.out.println("------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        System.out.println("Новая матрица");
        System.out.println("------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
