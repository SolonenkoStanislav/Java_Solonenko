package com.hillel.solonenko.lessons.homework14;


import java.io.FileReader;

public class FitnessTracker {

    public static void main(String[] args) {
    }

    String name;
    String dateDay;
    String dateMonth;
    String dateYear;
    String email;
    String phone;
    final String surname;
    final String weight;
    final String pressure;
    final String steps;

    public FitnessTracker(String name, String dateDay, String dateMonth, String dateYear, String email, String phone,
                          String surname, String weight, String pressure, String steps) {
        this.name = name;
        this.dateDay = dateDay;
        this.dateMonth = dateMonth;
        this.dateYear = dateYear;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
    }

    void printAccountInfo() {
        System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateDay() {
        return dateDay;
    }

    public void setDateDay(String dateDay) {
        this.dateDay = dateDay;
    }

    public String getDateMonth() {
        return dateMonth;
    }

    public void setDateMonth(String dateMonth) {
        this.dateMonth = dateMonth;
    }

    public String getDateYear() {
        return dateYear;
    }

    public void setDateYear(String dateYear) {
        this.dateYear = dateYear;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSurname() {
        return surname;
    }

    public String getWeight() {
        return weight;
    }

    public String getPressure() {
        return pressure;
    }

    public String getSteps() {
        return steps;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", dateDay='" + dateDay + '\'' +
                ", dateMonth='" + dateMonth + '\'' +
                ", dateYear='" + dateYear + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", surname='" + surname + '\'' +
                ", weight='" + weight + '\'' +
                ", pressure='" + pressure + '\'' +
                ", steps='" + steps;
    }
}




