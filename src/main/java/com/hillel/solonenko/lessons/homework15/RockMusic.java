package com.hillel.solonenko.lessons.homework15;

public class RockMusic extends MusicStyles{
    String name;

    public RockMusic(String name){
        this.name = name;
    }

    @Override
    void playMusic() {
        System.out.println("Rock music is playing...");

    }
}

