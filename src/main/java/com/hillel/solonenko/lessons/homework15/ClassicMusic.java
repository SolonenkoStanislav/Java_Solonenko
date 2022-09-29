package com.hillel.solonenko.lessons.homework15;

public class ClassicMusic extends MusicStyles{

    String name;

    public ClassicMusic(String name){
        this.name = name;
    }

    @Override
    void playMusic() {
        System.out.println("Classic music is playing...");
    }
}
