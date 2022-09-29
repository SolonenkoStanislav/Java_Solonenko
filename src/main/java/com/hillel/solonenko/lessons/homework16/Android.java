package com.hillel.solonenko.lessons.homework16;

public class Android implements Smartphones,LinuxOS{
    @Override
    public void call() {
        System.out.println("Android call");
    }

    @Override
    public void sms() {
        System.out.println("Android SMS");
    }

    @Override
    public void internet() {
        System.out.println("Android Internet");
    }

    @Override
    public void linuxOs() {
        System.out.println("Has LinuxOs");
    }
}
