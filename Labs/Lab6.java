/*-------------------------------------------------------------
// AUTHOR: Madison Chester
// FILENAME: Lab6.java
// SPECIFICATION: design a program that can help the user key in the distributions of grades in all groups
// FOR: CSE 110- Lab #6 Nahid Islam
// TIME SPENT: 45 minutes
//-----------------------------------------------------------*/
import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       //ask for number of students
       System.out.println("How many students do you have?");
       int numStudents = scanner.nextInt();
       int[] studentGroups = new int[numStudents];
       double[] studentGrades = new double[numStudents];
       
       //initalize the array based on user input
       for (int i = 0; i < numStudents; i++) {
    	   int entryNumber = 1;
    	   System.out.println("[Group #] and [Grade] for Entry " + entryNumber);
    	   studentGroups[i] = scanner.nextInt();
    	   studentGrades[i] = scanner.nextDouble();
    	   entryNumber++;
       }
	   //complete the code here for part 1
       System.out.println("==== List of Student Records =====");
       for (int index = 0; index < numStudents; index++) {
       System.out.println("Group " + studentGroups[index] + " - " + studentGrades[index] + " Points");
       }
       
       // Part 2: Find the number of groups
       /*if (studentGroups[i] > numGroups)  {
               numGroups = studentGroups[i];
           }
       }

       //double[] groupAverages = new double[numGroups + 1];  // Avoid group 0
       //int[] groupSizes = new int[numGroups + 1];  // Avoid group 0

       // For each student record,
       //   - find the group # and the grade, and
       //   - update groupAverages and groupSizes

       // Display the statistics of groups
       */
       scanner.close();
    }
}
