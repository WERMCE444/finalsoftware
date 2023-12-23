package org.example;

import static java.lang.System.*;

public class Installer {
    private String username;
    private String password;

    public Installer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void login(String enteredUsername, String enteredPassword) {
        boolean flag = true;
        if (enteredPassword.length() > 0) {
            for (int i = 0; i < enteredUsername.length(); i++) {
                if (Character.isDigit(enteredUsername.charAt(i))) {
                    flag = true;
                    break;
                }
                flag = false ;
            }
        }
        if (flag==true)  System.out.println("Login done");

        else  System.out.println("Login failed. Invalid credentials.");

    }

    public static void navigateToSection(int section) {
        System.out.println("Navigating to the " + section);
    }

    /////// for feature 3
    public boolean available;

    public Installer() {
        this.available = true;
    }

    public boolean isAvailable() {return available;}

    public void checkAvailability() {
        out.println("Installer's Current Availability: " + (available ? "Available" : "Not Available"));
    }}
