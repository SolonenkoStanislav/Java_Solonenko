package com.hillel.solonenko.lessons.homework5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st team name");
        String teamOne = scanner.nextLine();
        System.out.println("You entered : " + teamOne);

        System.out.println("Enter 1st player kill points");
        int playerOne = 0;
        if (scanner.hasNextInt()) {
            playerOne = scanner.nextInt();
            System.out.println("You entered number : " + playerOne);
        } else {
            System.out.println("You entered wrong number,restart!");
            System.exit(0);
        }

        System.out.println("Enter 2nd player kill points");
        int playerTwo = 0;
        if (scanner.hasNextInt()) {
            playerTwo = scanner.nextInt();
            System.out.println("You entered number : " + playerTwo);
        } else {
            System.out.println("You entered wrong number,restart!");
            System.exit(0);
        }

        System.out.println("Enter 3rd player kill points");
        int playerThree = 0;
        if (scanner.hasNextInt()) {
            playerThree = scanner.nextInt();
            System.out.println("You entered number : " + playerThree);
        } else {
            System.out.println("You entered wrong number,restart!");
            System.exit(0);
        }

        System.out.println("Enter 4th player kill points");
        int playerFour = 0;
        if (scanner.hasNextInt()) {
            playerFour = scanner.nextInt();
            System.out.println("You entered number : " + playerFour);
        } else {
            System.out.println("You entered wrong number,restart!");
            System.exit(0);
        }

        System.out.println("Enter 5th player kill points");
        int playerFive = 0;
        if (scanner.hasNextInt()) {
            playerFive = scanner.nextInt();
            System.out.println("You entered number : " + playerFive);
        } else {
            System.out.println("You entered wrong number,restart!");
            System.exit(0);
        }

        System.out.println();
        scanner.nextLine();
        System.out.println("Enter 2nd team name");
        String teamTwo = scanner.nextLine();
        System.out.println("You entered : " + teamTwo);

        System.out.println("Enter 6th player kill points");
        int playerSix = 0;
        if (scanner.hasNextInt()) {
            playerSix = scanner.nextInt();
            System.out.println("You entered number : " + playerSix);
        } else {
            System.out.println("You entered wrong number,restart!");
            System.exit(0);
        }

        System.out.println("Enter 7th player kill points");
        int playerSeven = 0;
        if (scanner.hasNextInt()) {
            playerSeven = scanner.nextInt();
            System.out.println("You entered number : " + playerSeven);
        } else {
            System.out.println("You entered wrong number,restart!");
            System.exit(0);
        }

        System.out.println("Enter 8th player kill points");
        int playerEight = 0;
        if (scanner.hasNextInt()) {
            playerEight = scanner.nextInt();
            System.out.println("You entered number : " + playerEight);
        } else {
            System.out.println("You entered wrong number,restart!");
            System.exit(0);
        }

        System.out.println("Enter 9th player kill points");
        int playerNine = 0;
        if (scanner.hasNextInt()) {
            playerNine = scanner.nextInt();
            System.out.println("You entered number : " + playerNine);
        } else {
            System.out.println("You entered wrong number,restart!");
            System.exit(0);
        }

        System.out.println("Enter 10th player kill points");
        int playerTen = 0;
        if (scanner.hasNextInt()) {
            playerTen = scanner.nextInt();
            System.out.println("You entered number : " + playerTen);
        } else {
            System.out.println("You entered wrong number,restart!");
            System.exit(0);
        }
        System.out.println();
        double resultTeamOne = ((playerOne + playerTwo + playerThree + playerFour + playerFive) / 5);
        System.out.println("Середнє арифметичне команди " + teamOne + " = " + resultTeamOne);
        System.out.println();
        double resultTeamTwo = ((playerSix + playerSeven + playerEight + playerNine + playerTen) / 5);
        System.out.println("Середнє арифметичне команди " + teamTwo + " = " + resultTeamTwo);
        System.out.println();

        if (resultTeamOne > resultTeamTwo) {
            System.out.println("Перемогла команда " + teamOne + " яка набрала" + resultTeamOne + " очків");
        } else if (resultTeamOne < resultTeamTwo) {
            System.out.println("Перемогла команда " + teamTwo + " яка набрала" + resultTeamTwo + " очків");
        } else {
            System.out.println("Нічия!");
        }

        }
    }
