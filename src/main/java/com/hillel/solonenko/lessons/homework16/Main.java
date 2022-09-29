package com.hillel.solonenko.lessons.homework16;

public class Main {
    public static void main(String[] args) {
        Android android = new Android();
        IPhones iPhones = new IPhones();
        android.call();
        android.internet();
        android.sms();
        android.linuxOs();
        System.out.println();
        iPhones.call();
        iPhones.internet();
        iPhones.sms();
        iPhones.IOS();
    }
}
