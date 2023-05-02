/** WordMover.java - Move the first word in a sentence to the end of the sentence.
 * Author:     Ethan Grant
 * Module:     5
 * Project:    Homework
 * Problem Statement: Write a program that will read in a line of text as input 
 * from the user, then output the line with the first word moved to the end of
 * the line. 
 * Algorithm:
 *   1. Import java.util Scanner and Locale
 *   2. Create a main class
 *   3. Assign a variable
 *   4. Ask user to input information
 *   5. Read from the console with scanner
 *   6. Read the response into a string variable with nextLine
 *   7. Find the first occurence of a blank with indexOf
 *   8. Pull the first word out
 *   9. Pull the rest of the words out 
 *   10. Capitalize the Second word, leave the rest uncapitalized
 *   11. Print to screen with the order of variables firstWord and restWord
 *       swapped
 *   12. Compile and test
*/  

import java.util.Scanner;
import java.util.Locale;
public class WordMover {
    public static void main(String[] args) {
    // Variable
    int rephrase = 0;
    
    // Ask user to input information
        System.out.print("Enter a line of text. No punctuation please. ");
    
     // Reads from system console
     Scanner keyboard =
             new Scanner(System.in);
    
    // Read the response into a string variable
    String line = keyboard.nextLine();
    
    // Finds the first occurrence of a blank
    rephrase = line.indexOf(" ");
    
    // Pulls the first word
    String firstWord = line.substring(0,rephrase);
    
    // Pulls the rest of the word
    String restWord = line.substring(rephrase);
    
    // Capitalizes the second word and leaves rest lower case
    restWord = restWord.substring(1,2).toUpperCase() + 
               restWord.substring(2).toLowerCase();
               
    // Print the reassortment to screen
    System.out.print("I have rephrased that line to read: " 
                                    + restWord + " " 
                                    + firstWord.toLowerCase());
    }
}