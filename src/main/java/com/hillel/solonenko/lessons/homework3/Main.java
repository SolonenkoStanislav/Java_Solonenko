package com.hillel.solonenko.lessons.homework3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = 0;
        int b = 0;
        int c = 0;
        if(scanner.hasNextInt()){
             a = scanner.nextInt();
        }
        if(scanner.hasNextInt()){
             b = scanner.nextInt();
        }
        if(scanner.hasNextInt()){
             c = scanner.nextInt();
        }

        int volume = a * b * c;

        System.out.println("Об'єм паралеллепіпеда = " + volume);

        int length = a + b + c;
        System.out.println(length);
    }
}
