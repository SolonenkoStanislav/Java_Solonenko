package com.hillel.solonenko.lessons.homework18;

public class MainArray {
    public static void main(String[] args) {

    }

    public static int countArray(int[][] arrayOne1) {
        int sum = 0;
        for (int i = 0; i < arrayOne1.length; i++) {
            for (int j = 0; j < arrayOne1.length; j++) {
                sum += arrayOne1[i][j];
            }
        }
        if (sum == 30) {
            return 0;
        } else return -1;

    }

    public static int arraySquare(int[][] arrayOne1) {
        for (int i = 0; i < arrayOne1.length; i++) {
            for (int j = 0; j < arrayOne1[i].length - 1;) {
                if (arrayOne1.length == arrayOne1[j].length) {
                    System.out.println("Матриця квадратна");
                    return 1;
                } else {
                    System.out.println("Матриця не квадратна");
                    return 2;
                }
            }
        }return 0;
    }
}