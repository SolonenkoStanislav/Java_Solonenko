package com.hillel.solonenko.lessons.homework6;


public class Main6 {
    public static void main(String[] args) {

        int firstValue = 0;
        for (int i = 0; i < 155; i++) {
            if
                (((i / 10 == 4) || (i / 10 == 9))  ||  ((i % 10 == 4) || (i % 10 == 9)) || (i / 10 % 10 == 4)) {
                continue;
            }
            firstValue++;
            System.out.println(i + " shuttle number - " + firstValue);
        }
    }
}

