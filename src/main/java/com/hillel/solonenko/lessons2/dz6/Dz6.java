package com.hillel.solonenko.lessons2.dz6;

import java.util.Scanner;

public class Dz6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name for the first team: ");
        String firstTeam = scanner.nextLine();
        System.out.println("First team name is " + firstTeam);

        System.out.println("Enter amount of kills for the  player 1 : ");
        int firstPlayerStats = 0;
        if (scanner.hasNextInt()) {
            firstPlayerStats = scanner.nextInt();
            System.out.println("You entered  " + firstPlayerStats);
        } else {
            System.out.println("You entered wrong value");
            System.exit(0);
        }
        System.out.println("Enter amount of kills for the  player 2 : ");
        int secondPlayerStats = 0;
        if (scanner.hasNextInt()) {
            secondPlayerStats = scanner.nextInt();
            System.out.println("You entered  " + secondPlayerStats);
        } else {
            System.out.println("You entered wrong value");
            System.exit(0);
        }
        System.out.println("Enter amount of kills for the  player 3 : ");
        int thirdPlayerStats = 0;
        if (scanner.hasNextInt()) {
            thirdPlayerStats = scanner.nextInt();
            System.out.println("You entered  " + thirdPlayerStats);
        } else {
            System.out.println("You entered wrong value");
            System.exit(0);
        }
        System.out.println("Enter amount of kills for the  player 4 : ");
        int fourthPlayerStats = 0;
        if (scanner.hasNextInt()) {
            fourthPlayerStats = scanner.nextInt();
            System.out.println("You entered  " + fourthPlayerStats);
        } else {
            System.out.println("You entered wrong value");
            System.exit(0);
        }
        System.out.println("Enter amount of kills for the  player : 5 ");
        int fifthPlayerStats = 0;
        if (scanner.hasNextInt()) {
            fifthPlayerStats = scanner.nextInt();
            scanner.nextLine();
            System.out.println("You entered  " + fifthPlayerStats);
            System.out.println();
        } else {
            System.out.println("You entered wrong value");
            System.exit(0);
        }

        System.out.println("Enter name for the second team : ");
        String secondTeam = scanner.nextLine();
        System.out.println("Second team name is " + secondTeam);


        System.out.println("Enter amount of kills for the  player 6 : ");
        int sixthPlayerStats = 0;
        if (scanner.hasNextInt()) {
            sixthPlayerStats = scanner.nextInt();
            System.out.println("You entered  " + sixthPlayerStats);
        } else {
            System.out.println("You entered wrong value");
            System.exit(0);
        }
        System.out.println("Enter amount of kills for the  player 7 : ");
        int seventhPlayerStats = 0;
        if (scanner.hasNextInt()) {
            seventhPlayerStats = scanner.nextInt();
            System.out.println("You entered  " + seventhPlayerStats);
        } else {
            System.out.println("You entered wrong value");
            System.exit(0);
        }
        System.out.println("Enter amount of kills for the  player 8 : ");
        int eighthsPlayerStats = 0;
        if (scanner.hasNextInt()) {
            eighthsPlayerStats = scanner.nextInt();
            System.out.println("You entered  " + eighthsPlayerStats);
        } else {
            System.out.println("You entered wrong value");
            System.exit(0);
        }
        System.out.println("Enter amount of kills for the  player 9 : ");
        int ninthPlayerStats = 0;
        if (scanner.hasNextInt()) {
            ninthPlayerStats = scanner.nextInt();
            System.out.println("You entered  " + ninthPlayerStats);
        } else {
            System.out.println("You entered wrong value");
            System.exit(0);
        }
        System.out.println("Enter amount of kills for the  player 10 : ");
        int tenthPlayerStats = 0;
        if (scanner.hasNextInt()) {
            tenthPlayerStats = scanner.nextInt();
            System.out.println("You entered  " + tenthPlayerStats);
        } else {
            System.out.println("You entered wrong value");
            System.exit(0);
        }
        int sumFirstTeam = firstPlayerStats + secondPlayerStats + thirdPlayerStats + fourthPlayerStats + fifthPlayerStats;
        int sumSecTeam = sixthPlayerStats + seventhPlayerStats + eighthsPlayerStats + ninthPlayerStats + tenthPlayerStats;

        System.out.println(sumFirstTeam + " is " + firstTeam + " points");
        System.out.println(sumSecTeam + " is " + secondTeam + " points");
        System.out.println();
        System.out.println("Average value of kills of all " + firstTeam + " " +(sumFirstTeam / 5));
        System.out.println("Average value of kills of all " + secondTeam +  " " + (sumSecTeam / 5));
        System.out.println();

        if (sumFirstTeam > sumSecTeam){
            System.out.println("The " + firstTeam + " won!");
        } else if (sumFirstTeam < sumSecTeam) {
            System.out.println("The " + secondTeam + " won!");
        } else {
            System.out.println("Draw!");
        }
    }
}