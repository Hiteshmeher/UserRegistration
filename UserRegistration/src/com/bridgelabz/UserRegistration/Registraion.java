package com.bridgelabz.UserRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Registraion {
    public static void validFirstName() {
        Scanner sc = new Scanner(System.in);
        // Taking first name as User Input
        System.out.println("Enter the First Name");
        String FirstName = sc.next();
        /**
         * Checking Whether first name contains first letter Capital
         * second and third small, this is minimum requirement
         * and having minimum 3 character
         */
        boolean result = Pattern.matches("[A-Z][a-z]{2,}", FirstName);
        // if it will true the valid otherwise invalid
        if (result) {
            System.out.println("Valid Input");
        } else {
            System.out.println("Sorry . Invalid Input");
        }
        sc.close();
    }
    public static void validLastName() {
        Scanner sc = new Scanner(System.in);
        // Taking Last name from user
        System.out.println("Enter the Last Name");
        String LastName = sc.next();
        /**
         * Checking Whether Last name contains first letter Capital
         * second and third small, this is minimum requirement
         * and having minimum 3 character
         */
        boolean result = Pattern.matches("[A-Z][a-z]{2,}", LastName);
        // if it will true the valid otherwise invalid
        if (result) {
            System.out.println("Valid Input");
        } else {
            System.out.println("Sorry . Invalid Input");
        }
        sc.close();
    }
    public static void validEmail() {
        Scanner sc = new Scanner(System.in);
        // Taking Email id from user
        System.out.println("Enter the Email id");
        String email = sc.next();
        // Checking Email id is correct format or not
        boolean result = Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email);
        // if it will true the valid otherwise invalid
        if (result) {
            System.out.println("Valid Input");
        } else {
            System.out.println("Sorry . Invalid Input");
        }
        sc.close();
    }
}