// Programmer: Amanda Windsor 12197877
// File: Program2.java
// Date: November 12, 2022
// Purpose: COIT11222 assignment one question two T322
// Input of data types and arithmetic expressions

/*
This program prompts the user for the booking name and number of nights,
    then calculates the total charge and prints a receipt.
*/

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        // Declare constants
        final double NIGHTLY_CHARGE = 89.95;
        final double CLEANING_CHARGE = 20.00;
        // Prompt user for booking name and store input
        Scanner inText = new Scanner(System.in);
        System.out.print("Please enter the booking name ==> ");
        String bookingName = inText.nextLine();
        // Prompt user for number of nights and store input
        Scanner inNumber = new Scanner(System.in);
        System.out.print("\nEnter the number of nights for " + bookingName + " ==> ");
        int numOfNights = inNumber.nextInt();
        // Calculate the total charge
        double charge = (numOfNights * NIGHTLY_CHARGE + CLEANING_CHARGE);
        // Display booking details/receipt
        System.out.println("\n\n---Yeppoon Cabins Receipt---");
        System.out.println("Booking name: " + bookingName);
        System.out.println("Number of nights: " + numOfNights);
        System.out.printf("Total charge: $%.2f\n",charge);
        
    }
}
