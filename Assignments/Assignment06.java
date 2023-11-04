// CSE 110     : #11178
// Assignment  : Assignment 06
// Author      : Madison Chester - 1219358478
// Description : define a series of methods

public class Assignment06 {
	
    public static void main(String[] args) {
        // Write any code here that you may wish to test your methods defined below.
    	int[] myArray1 = {1, 22, 333, 400, 5005, 9};
    	displayArray(myArray1, ", ");
    	displayArray(myArray1, " - ");
    	
    	double[] myArray2 = {1.0, 2.2, 33.3, 40.0, 50.05, 9.0};
    	getFirstItem(myArray2);
    	
    	double[] myArray3 = {1.0, 2.2, 33.3, 40.0, 50.05, 9.0};
    	getLastItem(myArray3);
    	
    	int[] myArray4 = {1, 22, 333, 400, 5005, 9};
    	getAllButLast(myArray4);
    	
    	int[] myArray5 = {1, 22, 333, 400, 5005, 9};
    	countLessThan(myArray5, 333);
    	
    	int[] myArray6 = {1, 22, 333, 400, 5005, 9};
    	countBetween(myArray6, 20, 400);
    	
    	double[] myArray7 = {1.0, 2.2, 33.3, 40.0, 50.05, 9.0};
    	swapByIndex(myArray7, 1, 4);
    	
    	int[] myArray8 = {1, 22, 333, 400, 5005, 9};
    	getLessThan(myArray8, 100);
    	
    	int[] myArray9 = {1, 22, 333, 400, 5005, 9};
    	getBetween(myArray9, 22, 450);
    	
    	int[] myArray10 = {22, 5005, 400, 333, 1, 9};
    	isSorted(myArray10);
    }
    
    // 1) Write a public static method named displayArray, that takes two arguments. 
    //    The first argument is an Array of int and the second argument is a String. 
    //    The method should print out a list of the values in the array, 
    //    each separated by the value of the second argument.
    public static void displayArray(int[] myArray1, String between) {
    	System.out.print(myArray1[0]);
    	for (int i = 1; i < myArray1.length; i++) {
    		System.out.print(between + myArray1[i]);
    		}
    	System.out.println();
    	}
    

    // 2) Write a public static method named getFirstItem, 
    //    that takes an Array of double as an argument 
    //    and returns the value of the first element of the array.
    public static double getFirstItem(double[] myArray2) {
    	return myArray2[0];
    }

    
    // 3) Write a public static method named getLastItem, 
    //    that takes an Array of double as an argument 
    //    and returns the value of the last element of the array.
    public static double getLastItem(double[] myArray3) {
    	return myArray3[myArray3.length - 1];
    }
    
    
    // 4) Write a public static method named getAllButLast, 
    //    that takes an Array of int as an argument 
    //    and creates and returns a new array 
    //    with all of the values in the argument array except the last value.
    public static int[] getAllButLast(int[] myArray4) {
    	int[] madeArray = new int[myArray4.length - 1];
    	for (int i = 0; i < myArray4.length - 1; i++) {
    		madeArray[i] = myArray4[i];
    	}
    	return madeArray;
    }
    
    // 5) Write a public static method named countLessThan, that takes two arguments. 
    //    The first argument is an Array of int, and the second argument is an int. 
    //    This method will return (as an int) a count of the number of elements 
    //    in the argument array that are less than the value of the second argument.
    public static int countLessThan(int[] myArray5, int value) {
    	int count = 0;
    	for (int i = 0; i < myArray5.length; i++) {
    		if (myArray5[i] < value)
    			count++;
    	}
    	return count;
    }
    
    
    // 6) Write a public static method named countBetween, that takes three arguments. 
    //    The first argument is an Array of int, the second and third arguments are both of type int 
    //    (you can safely assume that the second argument value 
    //    will always be less than or equal to the third argument value). 
    //    This method must return (as an int) a count of the number of elements in the argument array 
    //    that are greater than or equal to the second argument value, 
    //    and less than or equal to the value of the third argument.
    public static int countBetween(int[] myArray6, int firstBoundary, int secondBoundary) {
    	int count = 0;
    	for (int i = 0; i < myArray6.length; i++) {
    		if (myArray6[i] >= firstBoundary && myArray6[i] <= secondBoundary)
    			 count++;
    	}
    	return count;	
    }
    
    // 7) Write a public static method named swapByIndex, that takes three arguments. 
    //    The first argument is an Array of double, and the second and third arguments are int indexes. 
    //    This method will swap the values at the two given index arguments in the array, 
    //    and return a reference to the array. This method will not create a new Array. 
    //    It will swap the elements in the argument array and return the argument array.
    public static double[] swapByIndex(double[] myArray7, int index1, int index2) {
    	double value1 = myArray7[index1];
    	double value2 = myArray7[index2];
    	myArray7[index1] = value2;
    	myArray7[index2] = value1;
    	return myArray7;
    }
    
    //8) Write a public static method named getLessThan, that takes two arguments. 
    //   The first argument is an Array of int, and the second argument is an int. 
    //   This method create and return a new array with all of the values in the argument array 
    //   that are less than the second argument value. 
    //   The order the values in the returned array must be the same 
    //   as the order of those values in the argument array.
    public static int[] getLessThan(int[] myArray8, int value) {
    	int count = 0;
    	for (int i = 0; i < myArray8.length; i++) {
    		if (myArray8[i] < value) 
    			count++;
    	}
    	int[] madeArray = new int[count];
    	int index = 0;
    	for (int i = 0; i < myArray8.length; i++) {
    		if (myArray8[i] < value) {
    			madeArray[index] = myArray8[i];
    		    index++;
    		}	
    	}
    	return madeArray;
    }
    
    //9) Write a public static method named getBetween, that takes three arguments. 
    //   The first argument is an Array of int, the second and third arguments will be of type int 
    //   (you can safely assume that the second argument value 
    //   will always be less than or equal to the third argument value). 
    //   This method must create and return a new array 
    //   with all of the values in the argument array that are greater than or equal to the second argument value, 
    //   and less than or equal to the value of the third argument. 
    //   The order the values in the returned array must be the same as the order of those values in the argument array.
    public static int[] getBetween(int[] myArray9, int value1, int value2) {
    	int count = 0;
    	for (int i = 0; i < myArray9.length; i++) {
    		if (myArray9[i] >= value1 && myArray9[i] <= value2)
    			count++;
    	}
    	int[] madeArray = new int[count];
    	int index = 0;
    	for (int i = 0; i < myArray9.length; i++) {
    		if (myArray9[i] >= value1 && myArray9[i] <= value2) { 
    			madeArray[index] = myArray9[i];
    		    index++;
    		}
    	}
    	return madeArray;
    }
    
    //10) Write a public static method named isSorted, that takes an Array of int as an argument. 
    //   This method should return the boolean value true 
    //   if all the element values in the array are in descending order (greatest to least); 
    //   otherwise the method should return the boolean value false.
    public static boolean isSorted(int[] myArray10) {
    	boolean sorted = true;
    	for (int i = 0; i < myArray10.length - 1; i++) {
    			if (myArray10[i] >= myArray10[i + 1]) { 
    				sorted = true; }
    			else {
    				sorted = false;
    				break; }
    	}
    	return sorted;	
    }


}