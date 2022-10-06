package com.hillel.solonenko.lessons.homework17;

import java.util.Scanner;

public class Main extends Drinks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        do {


            DrinksMachine drinksMachine = null;
            DrinksMachine[] drinksMachines = DrinksMachine.values();
            while (true) {
                System.out.println("Please enter transport type from list: COFFEE, TEA, LEMONADE, MOJITO,WATER,COLA or type DONE for pay");
                String userValue = scanner.nextLine().toUpperCase();
                for (DrinksMachine type : drinksMachines) {
                    if (userValue.equals(type.toString())) {
                        drinksMachine = type;
                        Drinks.counterDrinks();
                        chosenDrink(drinksMachine);
                    }
                }
                if (drinksMachine != null) {
                    break;
                } else if (userValue.equalsIgnoreCase("DONE")) {
                    System.out.println("You just get " + Drinks.counterDrinks + " drinks");
                    System.out.println("You have to pay " + priceDrinks + "$ to get your drinks");
                    return;
                } else {
                    System.out.println("Wrong data, try again!");
                }
            }
        } while (true);
    }

    public static int priceDrinks = 0;

    public static void chosenDrink(DrinksMachine drinksMachine) {
        switch (drinksMachine) {
            case COFFEE:
                System.out.println("Your " + DrinksMachine.COFFEE + " is ready");
                System.out.println(DrinksMachine.COFFEE + " price is " + coffee + "$");
                priceDrinks = priceDrinks + coffee;
                break;
            case TEA:
                System.out.println("Your " + DrinksMachine.TEA + " is ready");
                System.out.println(DrinksMachine.TEA + " price is " + tea + "$");
                priceDrinks = priceDrinks + tea;
                break;
            case LEMONADE:
                System.out.println("Your " + DrinksMachine.LEMONADE + " is ready");
                System.out.println(DrinksMachine.LEMONADE + " price is " + lemonade + "$");
                priceDrinks = priceDrinks + lemonade;
                break;
            case MOJITO:
                System.out.println("Your " + DrinksMachine.MOJITO + " is ready");
                System.out.println(DrinksMachine.MOJITO + " price is " + mojito + "$");
                priceDrinks = priceDrinks + mojito;
                break;
            case WATER:
                System.out.println("Your " + DrinksMachine.WATER + " is ready");
                System.out.println(DrinksMachine.WATER + " price is " + water + "$");
                priceDrinks = priceDrinks + water;
                break;
            case COLA:
                System.out.println("Your " + DrinksMachine.COLA + " is ready");
                System.out.println(DrinksMachine.COLA + " price is " + cola + "$");
                priceDrinks = priceDrinks + cola;
                break;
        }
    }
}


