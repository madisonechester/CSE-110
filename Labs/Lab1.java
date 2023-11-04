//NAME: Madison Chester
//FILENAME: Lab1.java
//SPECIFICATION: average of three test scores 
//FOR: CSE110 - LAB01
//TIME SPENT: 20 minutes

import java.util.Scanner;

public class Lab1 
{
	public static void main(String[] args) 
	{
		double test1 = 0;
		double test2;
		double test3;
		final double NUM_TESTS = 3;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the score on the first test: "); // prompt
		test1 = keyboard.nextDouble(); // read in the next integer
		System.out.println("Your Test 1 Score is " + test1);
		
		System.out.println("Enter the score on the second test: "); // prompt
		test2 = keyboard.nextDouble(); // read in the next integer
		System.out.println("Your Test 2 Score is " + test2);
		
		System.out.println("Enter the score on the third test: "); // prompt
		test3 = keyboard.nextDouble(); // read in the next integer
		System.out.println("Your Test 3 Score is " + test3);
		
		double avg;
		avg = (test1 + test2 + test3) / (double) NUM_TESTS;
		System.out.println("Your average test score is " + avg);
		
	}
}
