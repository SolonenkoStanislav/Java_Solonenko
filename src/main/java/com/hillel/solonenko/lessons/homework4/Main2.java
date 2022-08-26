package com.hillel.solonenko.lessons.homework4;

import java.sql.SQLOutput;

public class Main2 {

    public static void main(String[] args) {
        // Lee

        int warrior = 13;
        int archer = 24;
        int rider = 46;
        int amount = 860;
        int sum = amount * 3;
        System.out.println("Всього воїнів династії Лі = " + sum);
        System.out.println("Воїнів династії Лін кожного типу = " + amount);
        System.out.println();

        //Min

        int warrior2 = 9;
        int archer2 = 35;
        int rider2 = 12;
        double sum2 = (amount*1.5)+(amount*1.5)+(amount*1.5);
        System.out.println("Всього воїнів династії Мінь = " + (int)sum2);
        int sum3 = (int) (sum2 / 3);
        System.out.println("Воїнів династії Мінь кожного типу = " + sum3);
        System.out.println();

        int leeDamage = (amount * 13) + (amount * 24) + (amount * 46);
        System.out.println("Загальний показник атаки Лі = " + leeDamage);

        int minDamage = (sum3 * 9) + (sum3 * 35) + (sum3 * rider2);
        System.out.println("Загальний показник атаки Мінь = " + minDamage);

        String allDamage = ("Загальний показник атаки = " + (minDamage + leeDamage));
        System.out.println();
        System.out.println(allDamage);
    }
}
