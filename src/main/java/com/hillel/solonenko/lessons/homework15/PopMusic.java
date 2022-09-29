package com.hillel.solonenko.lessons.homework15;

public class PopMusic extends MusicStyles{

    String name;

    public PopMusic(String name){
        this.name = name;
    }

    @Override
    void playMusic() {
        System.out.println("Pop music is playing...");

    }
}

