package com.hillel.solonenko.lessons2.dz5;

public class Dz5 {
        public static void main(String[] args) {
            int liWarier = 13;
            int liArcher = 24;
            int liRider = 46;
            int liWarriersAmount = 860;

            int minWarier = 9;
            int minArcher = 35;
            int minRider = 12;
            double minWarrierAmount = liWarriersAmount * 1.5;

            int wholeAttackLi = (liArcher + liWarier + liRider) * liWarriersAmount;
            double wholeAttackMin =  ((minArcher + minRider + minWarier) * minWarrierAmount);
            System.out.println("Li = " + wholeAttackLi);
            System.out.println("Min = " + (int)wholeAttackMin);
            System.out.println();
            System.out.println();

        }
}


