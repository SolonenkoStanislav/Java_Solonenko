package com.hillel.solonenko.lessons.homework16;

public class IPhones implements Smartphones,IOS{

    @Override
    public void call() {
        System.out.println("IOS call");
    }

    @Override
    public void sms() {
        System.out.println("IOS SMS");
    }

    @Override
    public void internet() {
        System.out.println("IOS Internet");
    }

    @Override
    public void IOS1() {
        System.out.println("IOS Iphone");
    }
}
