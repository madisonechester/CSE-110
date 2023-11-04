// CSE 110     : #11178
// Assignment  : Assignment 05
// Author      : Madison Chester - 1219358478
// Description : write methods that have no parameters no return value, write methods that have parameters, write methods that have a return value

public class Assignment05 {

    public static void main(String[] args) {
        // Write any code here that you may wish to test your methods defined below.
    	showGreeting();
    	
    	displayMessage("Hello");
    	displayMessage("123");
    	displayMessage("abc" + "123");
    	
    	displayTotal(0, 0, 0, 0);
    	displayTotal(0, 1, 3, 2);
    	displayTotal(100, 23, 2, 1);
    	
    	getSum(0, 0, 0);
    	getSum(0, 1, 3);
    	getSum(100, 23, 2);
    	
    	getMean(0, 0, 0, 0);
    	getMean(0, 1, 3, 2); 
    	getMean(100, 13, 7, 0);
    	
    	totalLength("a", "abc", "ab");
    	totalLength("hello", "goodbye", "monday");
    	totalLength("wednesday", "tuesday", "monday");
    	
    	lengthOfLongest("abc", "ab");
    	lengthOfLongest("hello", "goodbye");
    	lengthOfLongest("thursday", "friday");
    	
    	stringOfStars("a");
    	stringOfStars("Hello, world!");
    	stringOfStars("012345");
    	
    	minStringOfStars("a", "abc");
    	minStringOfStars("hello", "goodbye");
    	minStringOfStars("thursday", "fridays");
    	
    	minPlusMaxStringOfStars("a", "abc", "ab");
    	minPlusMaxStringOfStars("hello", "goodbye", "yes");
    	minPlusMaxStringOfStars("123456", "12", "1234");
    }
    
    // 1) Write (define) a public static method named showGreeting, 
    //    that takes no arguments and returns no value. 
    //    When this method is called, it should print the text "Howdy, and welcome!".
    public static void showGreeting() {
    String greeting = "Howdy, and welcome!";
    System.out.println(greeting); 
    }
    
    //2) Write (define) a public static method named displayMessage, 
    //   that takes a single String argument and returns no value. 
    //   When this method is called, it should print the value of the argument that was passed to it.
    public static void displayMessage (String message) {
    	System.out.println(message);
    }
    
    //3) Write (define) a public static method named displayTotal, 
    //   that takes four int arguments. When this method is called, 
    //   it should print the sum of the three arguments passed to it. 
    //   This method should return no value.
    public static void displayTotal(int value1, int value2, int value3, int value4) {
    	int sum = value1 + value2 + value3 + value4;
    	System.out.println(sum);
    }
    
    //4) Write (define) a public static method named getSum, 
    //   that takes three int arguments. When this method is called, 
    //   it should return the sum of the three arguments passed to it as an int.
    public static int getSum(int value1, int value2, int value3) {
    	int sum = value1 + value2 + value3;
    	return sum;
    }
     
    //5) Write (define) a public static method named getMean, 
    //   that takes four int arguments. When this method is called, 
    //   it should return the average of the three arguments passed to it as a double.
    public static double getMean(int value1, int value2, int value3, int value4) {
    	double average = (value1 + value2 + value3 + value4) / 4.0;
    	return average;
    }
    
    
    //6) Write (define) a public static method named totalLength, 
    //   that takes three String arguments. When this method is called, 
    //   it should return the total length (number of characters) 
    //   of the String arguments passed to it as a double.
    public static double totalLength (String string1, String string2, String string3) {
    	double totalLength = string1.length() + string2.length() + string3.length();
    	return totalLength;
    }
    
    //7) Write (define) a public static method named lengthOfLongest, 
    //   that takes two String arguments. When this method is called, 
    //   it should return the length (number of characters) 
    //   of the longest String argument passed to it as an int.
    public static int lengthOfLongest(String string1, String string2) {
    	int lengthOfLongest = 0;
    	if (string1.length() > string2.length())
    		lengthOfLongest = string1.length();
    	if (string2.length() > string1.length())
    		lengthOfLongest = string2.length();
    	return lengthOfLongest;
    }
    
    //8) Write (define) a public static method named stringOfStars, 
    //   that takes one String argument. When this method is called, 
    //   it should return a String of asterisks (*) that is the same length (number of characters) 
    //   as the String argument passed to it. 
    //   However, if the length of the String argument is less than 3, 
    //   then the methods should return a String of 3 asterisks, 
    //   and if the length of the String argument is greater than 10, 
    //   then the methods should return a String of 10 asterisks.
    public static String stringOfStars(String string1) {
    	String stringOfStars = "";
    	if (string1.length() <= 3) 
    		stringOfStars = "***";
    	if (string1.length() == 4) 
    		stringOfStars = "****";
    	if (string1.length() == 5) 
    		stringOfStars = "*****";
    	if (string1.length() == 6) 
    		stringOfStars = "******";
    	if (string1.length() == 7) 
    		stringOfStars = "*******";
    	if (string1.length() == 8) 
    		stringOfStars = "********";
    	if (string1.length() == 9) 
    		stringOfStars = "*********";
    	if (string1.length() >= 10) 
    		stringOfStars = "**********";
    	return stringOfStars;
    }
    
    //9) Write (define) a public static method named minStringOfStars, 
    //   that takes two String arguments. When this method is called, 
    //   it should return a String of asterisks (*) 
    //   that is the same length as the shortest String argument passed to it.
    public static String minStringOfStars(String string1, String string2) {
    	int minString = 0;
    	String minStringOfStars = "";
    	if (string1.length() < string2.length())
    		minString = string1.length();
    	if (string2.length() < string1.length())
    		minString = string2.length();
    	for (int i = 0; i < minString; i++) {
             minStringOfStars += "*";
    	}
    	return minStringOfStars;
    }
    
    //10) Write (define) a public static method named minPlusMaxStringOfStars, 
    //   that takes three String arguments. When this method is called, 
    //   it should return a String of asterisks (*) 
    //   that is the same length as the length of the shortest String argument 
    //   plus the length of the longest String argument.
    public static String minPlusMaxStringOfStars(String string1, String string2, String string3) {
    	int minString = 0;
    	int maxString = 0;
    	String minPlusMaxStringOfStars = "";
    	if (string1.length() < string2.length() && string1.length() < string3.length())
    		minString = string1.length();
    	if (string2.length() < string1.length() && string2.length() < string3.length())
    		minString = string2.length();
    	if (string3.length() < string1.length() && string3.length() < string2.length())
    		minString = string3.length();
    	if (string1.length() > string2.length() && string1.length() > string3.length())
    		maxString = string1.length();
    	if (string2.length() > string1.length() && string2.length() > string3.length())
    		maxString = string2.length();
    	if (string3.length() > string1.length() && string3.length() > string2.length())
    		maxString = string3.length();
    	int totalLength = minString + maxString;
    	for (int i = 0; i < totalLength; i++) {
    		minPlusMaxStringOfStars += "*";
    	}
    	return minPlusMaxStringOfStars;
    }
    } 