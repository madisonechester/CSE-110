/*-------------------------------------------------------------
// AUTHOR: Madison Chester
// FILENAME: Lab4.java
// SPECIFICATION: perform three different arithmetic operations based on the user’s input
// FOR: CSE 110- Lab #4 Nahid Islam
// TIME SPENT: 60 minutes
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {
        // Declare some variables you need
        // -->
    	Scanner in = new Scanner(System.in);
    	int option = 0;
    	int m = 0;
    	int i = 1;
    	int sum = 0;
    	int n = 0;
    	int factorial = 1;
    	int firstDigit = 0;
    	int z = 0;

        do {
            // Display the menu
            displayMenu();

            // Ask the user for one option
            // -->
            option = in.nextInt();

            switch (option) {
                // Define four cases for different options. Don't forget "break".
                // -->
            case 1: 
            	System.out.println("Enter a number: ");
            	m = in.nextInt();
            	while (i <= m ) {
            		sum = sum + i; 
            		i++;
            	}
            	System.out.println("The sum of 1 to " + m + " is " + sum);
            	break;
            case 2:
            	System.out.println("Enter a number: ");
            	n = in.nextInt();
            	int p = n;
            	while (p > 0) {
            		factorial = factorial * p;
            		p--;
            	}
            	System.out.println("The factorial of " + n + " is " + factorial);
            	break;
            case 3:
            	System.out.println("Enter a number: ");
            	firstDigit = in.nextInt();
            	int first = firstDigit;
            	while (first >= 10) {
            		first = first / 10;
            	}
            	System.out.println("The leftmost digit of " + firstDigit + " is " + first);
            	break;
            case 4:
            	System.out.println("Bye");
            	break;
            	default:
            		System.out.println("Invalid option");
            }
        } while (option != 4);
        	
    }

    /**
     * Print the menu
     */
    private static void displayMenu() {
        System.out.println("Please choose one option from the following menu:");
        System.out.println("1) Calculate the sum of integers from 1 to m");
        System.out.println("2) Calculate the factorial of a given number");
        System.out.println("3) Display the leftmost digit of a given number");
        System.out.println("4) Quit");
    }
}