/** VendingMachine.java - Calculate how to make change from a vending machine.
 * Author:     Ethan Grant
 * Module:     5
 * Project:    Homework
 * Problem Statement: Write a program that determines the change to be dispensed 
 * from a vending machine.  An item in the machine can cost between 5 cents and 1 
 * dollar, in 5-cent increments (5, 10, 15, 20, . . . 95, or 100),and the machine 
 * accepts only a single dollar bill to pay for the item.
 *  
 * Algorithm:
 *   1. Import java.util Scanner and Locale
 *   2. Create a main class
 *   3. Assign variables; price, change, quarters, dimes, and nickels
 *   4. Ask user to input information
 *   5. Read from the console with scanner
 *   6. Read the response into an int variable with nextInt
 *   7. Subtract 100 from price and print current information to screen
 *   8. Perform divison by dividng change into coin amount 
 *   9. Take the remainer with modulus and repeat steps 8 and 9 until 
 *      quarters, dimes, and nickels have been completed
 *   10.Print that information to screen
 *   12. Compile and test
*/  

import java.util.Scanner;
import java.util.Locale;
public class VendingMachine {
    public static void main(String[] args) {
    // Variables
    int price = 0;
    int change = 0;
    int quarters = 0;
    int dimes = 0;
    int nickels = 0;
    // Ask user for input
    System.out.print("Enter item price (from 5 cents to $1, in 5-cent incerements):");
    // Reads from system console
     Scanner keyboard =
             new Scanner(System.in);
             
    // Returns the value of the next int typed on the keyboard
    price = keyboard.nextInt();
    // Gets change from dollar
    change = 100 - price;
    // Prints out information
    System.out.print("Your item costs " + price + " cents. From $1, your change is " + 
                  change + " cents:\n");
    // Calculations to determine how many quarters, dimes, and nickels 
    // will be dispensed    
    // Takes the change and sees how many times 25 goes into it
    quarters = change / 25;
    // Takes the remainder for next the division statement
    change %= 25;
    dimes = change / 10;
    change %= 10;
    nickels = change / 5;
    change %= 5;
    // Prints calculations to screen   
    System.out.print(quarters + " quarters " + dimes + " dimes, and " + nickels + " nickels.");
    }
}