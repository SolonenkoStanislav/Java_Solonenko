package com.hillel.solonenko.lessons.homework14;

public class Main {
    public static void main(String[] args) {
        FitnessTracker person = new FitnessTracker(
                "Stanislav",
                15,
                8,
                2005,
                "solonenkostas@gmail.com",
                "+48708298807",
                "Solonenko",
                68);
        person.printAccountInfo();
        FitnessTracker person1 = new FitnessTracker(
                "Melina",
                15,
                4,
                2007,
                "MelinaGray@gmail.com",
                "+48345274803",
                "Gray",
                61);
        person1.printAccountInfo();
        FitnessTracker person2 = new FitnessTracker(
                "Michael",
                25,
                5,
                2001,
                "mcMichael@gmail.com",
                "+481525832",
                "Warder",
                62);
        person2.printAccountInfo();
    }
}

