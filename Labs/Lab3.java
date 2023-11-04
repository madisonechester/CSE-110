/*-------------------------------------------------------------
// AUTHOR: Madison Chester
// FILENAME: Lab3.java
// SPECIFICATION: take 3 user inputs as homework grade, midterm exam grade, and final exam grade and calculate the weighted total
// FOR: CSE 110- Lab #3 Nahid Islam
// TIME SPENT: 1 hour
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        // This scanner is prepared for you to get inputs
        Scanner scanner = new Scanner(System.in);
        // Declare three variables for HW, midterm, and final exam grades
        // -->
        double homeworkGrade = -1;
        double midtermExamGrade = -1;
        double finalExamGrade = -1;
        // Declare a loop control variable i
        // -->
        int i = 0;

        while ( i >= 0 && i <= 2 ) {
            // Design if-else control flow:
            //
            // if i is 0, asks for the homework grade
            // if i is 1, asks for the midterm exam grade
            // if i is 2, asks for the final exam grade
            //
            // You have to let the user re-try if any of the inputs is invalid.
            // - homework grade is in [0, 100]
            // - midterm grade is in [0, 100]
            // - final exam grade is in [0, 200]
            //
            // The first if-else statement is attached for your reference. You have to
            // finish the last two statments by yourself.
            // -->

            if (i == 0) {
                // Ask the user for homework grade
                // -->
                System.out.print("Enter your HOMEWORK grade: ");
                homeworkGrade = scanner.nextDouble();
                // Do input validation
                // -->
                if ( homeworkGrade < 0 || homeworkGrade > 100) {
                    // Show the error message
                    // -->
                	System.out.println("[ERR] Invalid input. A homework grade should be in [0,100].");
                } else {
                    // Update the loop variable
                    // -->
                	i++;
                }
            }

            // The other two if-else statments go here
            // -->
            
            if (i == 1) {
                // Ask the user for midterm exam grade
                // -->
                System.out.print("Enter your MIDTERM EXAM grade: ");
                midtermExamGrade = scanner.nextDouble();
                // Do input validation
                // -->
                if ( midtermExamGrade < 0 || midtermExamGrade > 100) {
                    // Show the error message
                    // -->
                	System.out.println("[ERR] Invalid input. A midterm exam grade should be in [0,100].");
                } else {
                    // Update the loop variable
                    // -->
                	i++;
                }
            }
            
            if (i == 2) {
                // Ask the user for final exam grade
                // -->
                System.out.print("Enter your FINAL EXAM grade: ");
                finalExamGrade = scanner.nextDouble();
                // Do input validation
                // -->
                if ( finalExamGrade < 0 || finalExamGrade > 200) {
                    // Show the error message
                    // -->
                	System.out.println("[ERR] Invalid input. A final exam grade should be in [0,200].");
                } else {
                    // Update the loop variable
                    // -->
                	i++;
                }
            }
        }

        // Calculate the weighted total by the formula showed in the PDF
        // -->
        double weighted_total =  (finalExamGrade / 200 * 50) + (midtermExamGrade * .25) + (homeworkGrade * .25);
        // Show the weighted total and tell the user s/he passed or not
        // -->
        System.out.println("[INFO] Student's Weighted Total is " + weighted_total);
        if ( weighted_total >= 50 ) {
            // Print "the student PASSED the class."
        	System.out.println("[INFO] Student PASSED the class.");
        } else {
            // Print "the student FAILED the class."
        	System.out.println("[INFO] Student FAILED the class.");
        }

        scanner.close();

    }  // End of main
}  // End of class
