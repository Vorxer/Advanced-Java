package io;

import misc.Person;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name, age and number seperated by commas");
        String name = scanner.next();
        int age = scanner.nextInt();
        long number = scanner.nextLong();

        Person person = new Person(name,age,number);
        System.out.println(person.toString());

        scanner.useDelimiter("(,)");
    }
}
