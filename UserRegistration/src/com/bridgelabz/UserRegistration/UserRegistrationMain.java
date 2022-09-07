package com.bridgelabz.UserRegistration;

import java.util.Scanner;

public class UserRegistrationMain {
    Registraion reg = new Registraion();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("*** Welcome to User Registration problem ***");
        int choose;
        int select;
        while (true) {
            System.out.print("Press 1 for validate First Name ");
            choose = sc.nextInt();
            if (choose == 1) {
                Registraion.validFirstName();
                break;
            } else {
                System.out.println("Invalid: Enter valid details.");
            }
        }
    }
}