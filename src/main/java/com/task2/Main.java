package com.task2;

public class Main {

    public static void main(String[] args) {

        Account user1 = new Account("Ilya", 28, 10, 1999, "ilya@gmail.com",
                "+38098765432", "Karmazinskyi", 91.5,
                120, 80, 10000);
        System.out.println(printAccountInfo(user1));

        Account user2 = new Account("Ivan", 14, 8, 1988, "ivan@gmail.com",
                "+38093435432", "Kovalenko", 83,
                124, 81, 12345);
        System.out.println(printAccountInfo(user2));

        Account user3 = new Account("Jan", 18, 1, 1996, "jan@gmail.com",
                "+3809885432", "Kowalski", 102.4,
                140, 90, 3056);
        System.out.println(printAccountInfo(user3));

        Account user4 = new Account("John", 3, 9, 1996, "john@gmail.com",
                "+3809881111", "Smith", 98,
                132, 91, 4234);
        System.out.println(printAccountInfo(user4));

        user1.setEmail("IlYA2@gmail.com");
        user1.stepsPerDay = 0;
        user2.setName("Vano");
        user2.weight = 75;

        System.out.println(printAccountInfo(user1));
        System.out.println(printAccountInfo(user2));


    }

    public static String printAccountInfo(Account account) {
        return "Name: " + account.getName() + "\n" +
                "Surname: " + account.surName + "\n" +
                "Age: " + account.getAge(account.getBirthYear()) + "\n" +
                "Email: " + account.getEmail() + "\n" +
                "Phone: " + account.getPhone() + "\n" +
                "Weight: " + account.weight + "\n" +
                "Pressure: " + account.pressureSystolic + "/" + account.pressureDiastolic + "\n" +
                "Steps per day: " + account.stepsPerDay + "\n";

    }
}
