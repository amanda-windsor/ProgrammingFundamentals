import java.util.Scanner;

// Programmer: Amanda Windsor 12197877
// File: Program4.java
// Date: December 5, 2022
// Purpose: COIT11222 assignment one question three T322
// Creating a class to represent a booking

/*
This program prompts the user for the booking name and number of nights,
    then calculates the total charge and prints a receipt.
*/
/**
 *
 * @author amwin
 */
public class Program4 {
    
    public static double calculateCharge(int numOfNights, final double NIGHTLY_CHARGE, final double CLEANING_CHARGE) 
    {
        
    // Discounts
    final int LONG_TERM_STAY1 = 7;
    final int LONG_TERM_STAY2 = 14;
    final double DISCOUNT_10 = 0.1;
    final double DISCOUNT_15 = 0.15;
    
        double charge;
        if (numOfNights > LONG_TERM_STAY1 && numOfNights < LONG_TERM_STAY2)
            charge = ((numOfNights * NIGHTLY_CHARGE) - (numOfNights * NIGHTLY_CHARGE * DISCOUNT_10));
        else if (numOfNights > LONG_TERM_STAY2)
            charge = ((numOfNights * NIGHTLY_CHARGE) - (numOfNights * NIGHTLY_CHARGE * DISCOUNT_15));
        else
            charge = (numOfNights * NIGHTLY_CHARGE);
        return (charge + CLEANING_CHARGE);
    }

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
   
        int numOfNights;
        // Calculate charge
        numOfNights = inNumber.nextInt();
        
        // Display booking details/receipt
        System.out.println("\n\n---Yeppoon Cabins Receipt---");
        System.out.println("Booking name: " + bookingName);
        System.out.println("Number of nights: " + numOfNights);
        System.out.printf("Total charge: $%.2f", calculateCharge(numOfNights, NIGHTLY_CHARGE, CLEANING_CHARGE));
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