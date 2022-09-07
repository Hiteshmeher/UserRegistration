package com.bridgelabz.UserRegistration;

import java.util.Scanner;

public class UserRegistrationMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("*** Welcome to User Registration problem ***");
        int choose;
        int select;
            System.out.print("PRESS for Validation \n1.First Name\n2.Last Name ");
            choose = sc.nextInt();
            switch (choose){
                case 1:
                    Registraion.validFirstName();
                    break;
                case 2:
                    Registraion.validLastName();
                    break;
                default :
                    break;
            }
        }
    }