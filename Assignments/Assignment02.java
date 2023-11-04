// CSE 110     : #11178
// Assignment  : Assignment 02
// Author      : Madison Chester - 1219358478
// Description : compute the materials and costs required for a specified road construction project

import java.util.Scanner;

public class Assignment02 {
    public static void main(String[] args) {  
        // declare and instantiate the Scanner
    	Scanner in = new Scanner(System.in);
        
        // declare and initialize the variables
        double lengthOfRoad;                                    // in miles 
        int numberOfLanes;
        int depthOfAsphalt;                                     // in inches
        int daysToComplete;
        double truckloadsOfAsphalt;                             // rounded up
        int numberOfStoplights;
        double numberOfConduitPipes;                            // rounded up
        double crewMembersNeeded;                               // rounded up
        double costOfAsphalt;                                   // rounded up to nearest full truckload
        double costOfStoplights;
        double costOfConduitPipes;
        double costOfLabor;
        double totalCostOfProject;
        final int INTERSECTIONS_PER_MILE = 1;
        final int TRUCK_CAPACITY = 10000;                       // in pounds (5 US tons)
        final int LANE_WIDTH = 12;                              // in feet
        final int ASPHALT_WEIGHT = 160;                         // pounds per cubic foot
        final int ASPHALT_COST = 230;                           // dollars per ton 
        final int CONDUIT_PIPE_LENGTH = 20;                     // in feet
        final int CONDUIT_PIPE_COST = 600;
        final int STOPLIGHT_COST = 27000;
        final int WORK_DAY_HOURS = 8;
        final int SALARY_PER_HOUR = 28;
        final int CREWMEMBER_CONSTANT_OF_PROPORTIONALITY = 50;  // miles*lanes/days 
        
        // prompt for and collect the inputs
        System.out.print("Length of road project (miles) : ");
        lengthOfRoad = in.nextDouble();
        System.out.print("Number of lanes                : ");
        numberOfLanes = in.nextInt();
        System.out.print("Depth of asphalt (inches)      : ");
        depthOfAsphalt = in.nextInt();
        System.out.print("Days to complete project       : ");
        daysToComplete = in.nextInt();
        
        // compute the required values
        // Truckloads of asphalt 
        final int FEET_PER_MILE = 5280;
        final int INCHES_PER_FOOT = 12;
        truckloadsOfAsphalt = lengthOfRoad * FEET_PER_MILE * LANE_WIDTH * depthOfAsphalt / INCHES_PER_FOOT * numberOfLanes * ASPHALT_WEIGHT / TRUCK_CAPACITY;
        int truckloads = (int) (Math.ceil(truckloadsOfAsphalt));
        // Stoplights
        int stoplightsPerIntersection = numberOfLanes + 2;
        int roadLength = (int) (lengthOfRoad);
        numberOfStoplights = roadLength * INTERSECTIONS_PER_MILE * stoplightsPerIntersection;
        // Conduit pipes 
        numberOfConduitPipes = lengthOfRoad * FEET_PER_MILE / CONDUIT_PIPE_LENGTH;
        int conduitPipes = (int) (Math.ceil(numberOfConduitPipes));
        // Crew members needed
        crewMembersNeeded = CREWMEMBER_CONSTANT_OF_PROPORTIONALITY * lengthOfRoad * numberOfLanes  / daysToComplete;
        int crewMembers = (int) (Math.ceil(crewMembersNeeded));
        // Cost of Asphalt 
        final int TONS_ASPHALT_PER_TRUCK = 5;
        costOfAsphalt = truckloads * TONS_ASPHALT_PER_TRUCK * ASPHALT_COST;
        // Cost of Stoplights 
        costOfStoplights = numberOfStoplights * STOPLIGHT_COST;
        // Cost of Conduit pipes 
        costOfConduitPipes = conduitPipes * CONDUIT_PIPE_COST;
        // Cost of Labor 
        costOfLabor = crewMembers * daysToComplete * WORK_DAY_HOURS * SALARY_PER_HOUR;
        // Total cost of project
        totalCostOfProject = costOfAsphalt + costOfStoplights + costOfConduitPipes + costOfLabor;
        
        // display the required outputs
        System.out.println("=== Amount of materials needed ==="); 
        System.out.println("Truckloads of Asphalt : " + truckloads);
        System.out.println("Stoplights            : " + numberOfStoplights);
        System.out.println("Conduit pipes         : " + conduitPipes);
        System.out.println("Crew members needed   : " + crewMembers);
        System.out.println("=== Cost of Materials ============"); 
        System.out.printf("Cost of Asphalt       : $%.2f%n", costOfAsphalt);
        System.out.printf("Cost of Stoplights    : $%.2f%n", costOfStoplights);
        System.out.printf("Cost of Conduit pipes : $%.2f%n", costOfConduitPipes);
        System.out.printf("Cost of Labor         : $%.2f%n", costOfLabor);
        System.out.println("=== Total Cost of Project ========");
        System.out.printf("Total cost of project : $%.2f%n", totalCostOfProject);
       
    }

}
