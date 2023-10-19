package com.hillel.solonenko.lessons2.dz5;

public class Dz5 {
        public static void main(String[] args) {
            int warierLi = 13;
            int archerLi = 24;
            int riderLi = 46;

            int warierMin = 9;
            int archerMin = 35;
            int riderMin = 12;

            int liPeopleSum  = 860 * (warierLi + archerLi + riderLi);
            double minPeopleSum = (860 * 1.5) * (warierMin + archerMin + riderMin);

            System.out.println(liPeopleSum + " Li atack ");
            System.out.println((int)minPeopleSum + " Min atack ");

        }
}


