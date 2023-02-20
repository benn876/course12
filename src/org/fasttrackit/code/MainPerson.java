package org.fasttrackit.code;

import org.fasttrackit.homework.ex3.Person;

import java.util.Scanner;

public class MainPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide your name");
        String name = scanner.nextLine();
        System.out.println("Please provide your age");
        int age = scanner.nextInt();
        if (age < 18) {
            throw new ValidationException("No minors are allowed");
        }
        System.out.println("What color your hair has");
        String hairColor = scanner.nextLine();
        Person person = new Person(name, age, hairColor);
        System.out.println("Successful registration");
        System.out.println(person);
    }
}
