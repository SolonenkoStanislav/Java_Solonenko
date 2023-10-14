package com.hillel.solonenko.lessons2.dz6;

import java.util.Scanner;

public class Dz6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String team1 = new String();
        if(scanner.hasNextLine()){
            team1 = scanner.nextLine();
            System.out.println(team1);
        } else if (scanner.hasNextInt()) {
            System.out.println("-");
            System.exit(0);
        }
        {
}

        System.out.println(team1);

        int player1 = scanner.nextInt();
        int player2 = scanner.nextInt();
        int player3 = scanner.nextInt();
        int player4 = scanner.nextInt();
        int player5 = scanner.nextInt();

   String team2 = scanner.nextLine();
        System.out.println(team2);

        int player6 = scanner.nextInt();
        int player7 = scanner.nextInt();
        int player8 = scanner.nextInt();
        int player9 = scanner.nextInt();
        int player10 = scanner.nextInt();



       int sumNavi = player1 + player2 + player3 + player4 + player5;
        int sumAstralis = player7 + player8 + player9 + player10 + player6;

        int sredneeNavi = sumNavi / 5;
        int sredneeAstralis = sumAstralis / 5;
        System.out.println("Среднее ариф Нави = " + sredneeNavi);
        System.out.println("Среднее ариф astralis = " + sredneeAstralis);
        if (sumNavi < sumAstralis){
            System.out.println("Перемогла команда " + "astralis " + "набрала " + sumAstralis + " очків");
        } else {
            System.out.println("Перемогла команда " + "navi " + "набрала " + sumNavi + " очків");
        }
    }
}