package com.hillel.solonenko.lessons.homework15;




//        Зробіть клас MusicStyles, який міститиме метод playMusic()
//        Зробіть його спадкоємців: PopMusic, RockMusic і ClassicMusic.
//        Спадкоємці повинні реалізовувати метод playMusic().
//        У мейн-класі створіть музичні гурти для кожного стилю
//        За допомогою методу for each викличте у всіх спадкоємців
//        MusicStyles метод playMusic()
public class Main {
    public static void main(String[] args) {

        MusicStyles[] groups = {
          new ClassicMusic("Classic"),
          new PopMusic("Pop"),
          new RockMusic("Rock")
        };
        for (MusicStyles playMusic1 : groups) {
            playMusic1.playMusic();
        }
    }
}
