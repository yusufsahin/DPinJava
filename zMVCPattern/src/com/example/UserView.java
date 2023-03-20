package com.example;
import java.util.Scanner;

public class UserView {
    public void printUserDetails(String firstName, String lastName, String email) {
        System.out.println("User Details:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
    }

    public User getUsetInput()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter Last Name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter Email:");
        String email = scanner.nextLine();

        return new User(firstName, lastName, email);
    }


}
