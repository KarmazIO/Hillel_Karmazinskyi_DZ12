package com.task2;

public class Account {
    private String name;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String email;
    private String phone;

    String surName;
    double weight;
    int pressureSystolic;
    int pressureDiastolic;
    long stepsPerDay;

    public Account(String name, int birthDay, int birthMonth, int birthYear,
                   String email, String phone, String surName, double weight,
                   int pressureSystolic, int pressureDiastolic, long stepsPerDay) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phone = phone;
        this.surName = surName;
        this.weight = weight;
        this.pressureSystolic = pressureSystolic;
        this.pressureDiastolic = pressureDiastolic;
        this.stepsPerDay = stepsPerDay;
        int age = getAge(birthYear);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
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

    public int getAge(int birthYear) {
        int age = 2022 - birthYear;
        return age;
    }

}


