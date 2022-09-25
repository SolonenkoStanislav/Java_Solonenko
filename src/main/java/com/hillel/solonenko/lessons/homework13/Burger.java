

package com.hillel.solonenko.lessons.homework13;

public class Burger {
    public static void main(String[] args) {

    }

    String bun;
    String meat;
    String cheese;
    String lettuce;
    String mayo;
    String doubleMeat;

    public Burger(String bun, String meat, String cheese, String lettuce, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.mayo = mayo;
        System.out.println("Regular burger = " + bun + meat + cheese + lettuce + mayo);
    }

    public Burger(String bun, String meat, String cheese, String lettuce) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;
        System.out.println("Diet = " + bun + meat + cheese + lettuce);
    }

    public Burger(String bun, String meat, String cheese, String lettuce, String mayo, String doubleMeat) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.mayo = mayo;
        this.doubleMeat = doubleMeat;
        System.out.println("Double meat = " + bun + meat + cheese + lettuce + mayo + doubleMeat);
    }
}
