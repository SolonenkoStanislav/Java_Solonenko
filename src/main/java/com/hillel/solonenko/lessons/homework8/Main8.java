package com.hillel.solonenko.lessons.homework8;

import java.util.Arrays;

public class Main8 {
    public static void main(String[] args) {

        int[] firstTeamPlayers = new int[25];
        int[] secondTeamPlayers = new int[25];
//              Перша комманда
        int middleAge = 0;
        for (int i = 0; i < firstTeamPlayers.length; i++) {
            firstTeamPlayers[i] = (int) (Math.random() * 22 + 18);
            middleAge = middleAge + firstTeamPlayers[i];
        }

        System.out.println("Вік гравців першої команди");
        System.out.println(Arrays.toString(firstTeamPlayers));
        System.out.println();
        System.out.println("Середній вік гравців першої комманди: " + middleAge / firstTeamPlayers.length);
        System.out.println();
//              Друга комманда
        int middleAgeTwo = 0;
        for (int i = 0; i < secondTeamPlayers.length; i++) {
            secondTeamPlayers[i] = (int) (Math.random() * 22 + 18);
            middleAgeTwo = middleAgeTwo + secondTeamPlayers[i];
        }

        System.out.println("Вік гравців другої команди");
        System.out.println(Arrays.toString(secondTeamPlayers));
        System.out.println();
        System.out.println("Середній вік гравців другої комманди: " + middleAgeTwo / secondTeamPlayers.length);
    }
}
