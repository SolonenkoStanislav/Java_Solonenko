package com.hillel.solonenko.lessons.homework16;
// Зробіть інтерфейс Smartphones, який має містити методи call(), sms(), internet()
// Зробіть класи, які його імплементують: Androids, iPhones.
// Андроїди повинні також імплементувати LinuxOS, айфони повинні імплементувати iOS
// Створіть екземпляри кожного виду у мейн-класі
public interface Smartphones {
    void call();
    void sms();
    void internet();
}
