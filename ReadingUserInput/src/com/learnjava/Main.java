package com.learnjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your year of birth: ");
        boolean isInt = scanner.hasNextInt();
        if (isInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // To handle \n character entered by user
            System.out.println("Enter your nick name: ");
            String nickName = scanner.nextLine();
            System.out.println("Enter current year: ");
            isInt = scanner.hasNextInt();
            if (isInt) {
                int currentYear = scanner.nextInt();
                int age = currentYear - yearOfBirth;
                if (age < 0 || age > 100) {
                    System.out.println("Invalid year of birth!");
                } else {
                    System.out.println("Your name is " + name + ", your nickname is " + nickName + ", and you are " + age + " years old!");
                }
            } else {
                System.out.println("Failed to parse current year!");
            }
        } else {
            System.out.println("Failed to parse year of birth!");
        }
        scanner.close();
    }
}
