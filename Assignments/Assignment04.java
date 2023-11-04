// CSE 110     : #11178 
// Assignment  : Assignment 04
// Author      : Madison Chester - 1219358478
// Description : play a game of Master Mind with the user 

import java.util.Scanner; 

public class Assignment04 {

    public static void main(String[] args) {
    	
    	Scanner in = new Scanner(System.in);
    	String playAgain = "yes";
    	
    	while (playAgain.equals("yes")) {
    		double randomNumber = Math.random()*1000;
    		int rNumber = (int)(randomNumber);
    		System.out.println("----- Mastermind -----");
        	System.out.println("Guess the 3 digit number!");
        	System.out.println();

        	int usersGuess = -1;
        	int numberOfGuesses = 1;
        	int matches = 0;
        	int i = 0;
        	while (rNumber != usersGuess) {
        		System.out.print("Guess " + numberOfGuesses + " : ");
                usersGuess = in.nextInt();
            	for (i = 0; i < 2; i++); {
            		if (usersGuess / 100 == rNumber / 100 || usersGuess / 10 == rNumber / 10 ) {
            			matches++;
            		}
            		if (usersGuess / 100 == rNumber / 100 && usersGuess / 10 == rNumber / 10 ) {
            			matches = 2;
            		}
                System.out.println("You matched " + matches);
                System.out.println();
                numberOfGuesses++;
                matches = 0;
            	}
            	
        	}

        System.out.println("Congratulations! You guessed the right number in " + (numberOfGuesses -1) + " guesses.");
        System.out.println("Would you like to play again (yes/no)?");
        playAgain = in.next();
    	}
    	
    	
    }
}