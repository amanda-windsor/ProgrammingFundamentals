// Programmer: Amanda Windsor 12197877
// File: Program3.java
// Date: December 5, 2022
// Purpose: COIT11222 assignment one question three T322
// Creating a class to represent a booking

/*
This program prompts the user for the booking name and number of nights,
    then calculates the total charge and prints a receipt.
*/

import java.util.Scanner;

public class Program3 {
    
    static double calculateCharge(double numOfNights, final double NIGHTLY_CHARGE, final double CLEANING_CHARGE) 
    {
        double charge = numOfNights * NIGHTLY_CHARGE + CLEANING_CHARGE;
        return charge;
    }
    
    public static void main(String[] args) {
        
        // Declare variables
        String bookingName;
        int numOfNights;
        
        // Declare constants
        final double NIGHTLY_CHARGE = 89.95;
        final double CLEANING_CHARGE = 20.00;
        
        // Prompt user for booking name and store input
        Scanner inText = new Scanner(System.in);
        System.out.print("Please enter the booking name ==> ");
        bookingName = inText.nextLine();
    
        // Prompt user for number of nights and store input
        Scanner inNumber = new Scanner(System.in);
        System.out.print("\nEnter the number of nights for " + bookingName + " ==> ");
        numOfNights = inNumber.nextInt();
        
        // Display booking details/receipt
        System.out.println("\n\n---Yeppoon Cabins Receipt---");
        System.out.println("Booking name: " + bookingName);
        System.out.println("Number of nights: " + numOfNights);
        System.out.printf("Total charge: $%.2f\n",calculateCharge(numOfNights, NIGHTLY_CHARGE, CLEANING_CHARGE));
    }
    
    public class Booking2 {
        
    // Private instance variables
    private String bookingName;
    private int numOfNights;
    
    public Booking2 (String bookingName, int numOfNights) {
        this.bookingName = bookingName;
        this.numOfNights = numOfNights;
    }
   
    public String getBookingName() {
        return bookingName;
    }
    
    public void setBookingName(String bookingName) {
        this.bookingName = bookingName;
    }
    
    public int getNumNights() {
        return numOfNights;
    }
    
    public void setNumNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }
  }
}
