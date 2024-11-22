package com.lbrce.ext;

public class Signup {
    public static void main(String[] args) {
        // Predefined username and password
        String predefinedUsername = "admin";
        String predefinedPassword = "password123";

        // Initialize the signup details
        String signupUsername = "admin";  // Example username to be signed up
        String signupPassword = "password123";  // Example password to be signed up

        // Signup logic
        if (signupUsername.equals(predefinedUsername) && signupPassword.equals(predefinedPassword)) {
            System.out.println("Signup successful! Welcome, " + signupUsername);
        } else {
            System.out.println("Signup failed! Username or password doesn't match the predefined values.");
        }
    }
}

