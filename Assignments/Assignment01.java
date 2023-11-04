//CSE 110     : #11178
//Assignment  : Assignment 01
//Author      : Madison Chester - 1219358478
//Description : split a number of pizzas among a group of adults and children at a pizza party

import java.util.Scanner;

public class Assignment01 
{
 public static void main(String[] args) 
 {  
     // declare and instantiate the Scanner
	 Scanner in = new Scanner(System.in);
     
     // declare and initialize the variables
     int slicesPerPizza;
     int pizzasPurchased;
     int numAdults;
     int numChildren;
     
     // prompt for and collect the inputs
     System.out.print("Number of slices per pizza: ");
     slicesPerPizza = in.nextInt();
     System.out.print("Number of pizzas purchased: ");
     pizzasPurchased = in.nextInt();
     System.out.print("Number of adults          : ");
     numAdults = in.nextInt();
     System.out.print("Number of children        : ");
     numChildren = in.nextInt();
     
     // compute the required values
     final int NUM_SLICES_PER_ADULT = 3;
     int totalSlicesOfPizza = slicesPerPizza * pizzasPurchased;
     int slicesForAdults = NUM_SLICES_PER_ADULT * numAdults;
     int slicesForChildren = totalSlicesOfPizza - slicesForAdults;
     int slicesPerChild = slicesForChildren / numChildren;
     int slicesLeftover = slicesForChildren % numChildren;

     // display the required outputs
     System.out.println("Total number of slices of pizza               : " + totalSlicesOfPizza);
     System.out.println("Total number of slices given to adults        : " + slicesForAdults);
     System.out.println("Total number of slices available for children : " + slicesForChildren);
     System.out.println("Number of slices each child will get          : " + slicesPerChild);
     System.out.println("Number of slices left over                    : " + slicesLeftover);
 }
}
