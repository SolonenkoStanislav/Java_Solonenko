package com.hillel.solonenko.lessons.homework14;

public class FitnessTracker {
        private final String name;
        private final int birthDay;
        private final int birthMonth;
        private final int birthYear;
        private final String email;
        private final String phoneNumber;
        private String surname;
        private double weight;
        private int age;
        private int pressure;

        public FitnessTracker(String name, int birthDay, int birthMonth, int birthYear, String email, String phoneNumber, String surname, double weight) {
            this.name = name;
            this.birthDay = birthDay;
            this.birthMonth = birthMonth;
            this.birthYear = birthYear;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.surname = surname;

            setWeight(weight);
            age = 2020 - birthYear;
        }

    public String getName() {
        return name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setWeight(double weight) {
            if (weight < 0) {
                System.out.println("Wrong data!");
            } else {
                this.weight = weight;
            }
        }

        void printAccountInfo() {
            String stringBuilder = "Person :" + "name='" + name + '\'' +
                    ", birthDay =" + birthDay +
                    ", birthMonth =" + birthMonth +
                    ", birthYear =" + birthYear +
                    ", age =" + age +
                    ", email ='" + email + '\'' +
                    ", phoneNumber ='" + phoneNumber +
                    '\'' + ", surname ='" + surname +
                    '\'' + ", weight =" + weight;

            System.out.println(stringBuilder);

        }

        @Override
        public String toString() {
            return "Person :" +
                    "name='" + name + '\'' +
                    ", birthDay=" + birthDay +
                    ", birthMonth=" + birthMonth +
                    ", birthYear=" + birthYear +
                    ", email='" + email + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    ", surname='" + surname + '\'' +
                    ", weight=" + weight;
        }
    }
