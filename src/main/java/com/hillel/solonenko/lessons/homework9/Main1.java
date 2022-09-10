package com.hillel.solonenko.lessons.homework9;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {

        int[] userValue = new int[7];
        int[] firmValue = new int[7];

        System.out.println("Числа, які загадав гравець");
        for (int i = 0; i < userValue.length; i++) {
            userValue[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(userValue);
        System.out.println((Arrays.toString(userValue)));

        System.out.println("Числа, які загадала компанія");
        for (int i = 0; i < firmValue.length; i++) {
            firmValue[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(firmValue);
        System.out.println(Arrays.toString(firmValue));
        System.out.println();

        int a = 0;
        for (int i = 0; i < firmValue.length; i++) {
            if (userValue[i] == firmValue[i]) {
                a = +1;
            }
        }
        System.out.println("Кількість збігів = " + a);

    }
}