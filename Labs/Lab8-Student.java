/*-------------------------------------------------------------
//AUTHOR: Nahid Islam Madison Chester - 1219358478
//FILENAME: Student.java
//SPECIFICATION: Student data type
//-----------------------------------------------------------*/

public class Student {
    private String fullName, asuID;
    private double grade;
    private int numOfUpdates, numOfAccessed;

    private String studentName;
    //default constructor
    public Student() {
        this.asuID = null;
        this.fullName = null;
        this.grade = -1;  // an impossible value to say it's N/A
        this.numOfUpdates = 0;
        this.numOfAccessed = 0;
    }
    //overloaded constructor
    public Student(String fullName, String asuID, double grade) {
        this.asuID = asuID;
        this.grade = grade;
        this.fullName = fullName;
        this.numOfUpdates = 0;
        this.numOfAccessed = 0;
    }

    public boolean equals(Student other) {
        // Check whether two objects have available asuID
        if (this.asuID != null && other.asuID != null) {
            if (this.asuID.equals(other.asuID)) {
                return true;
            }
        }   else if (this.fullName != null && other.fullName != null) {
        		return true;
        }

        return false;
    }
    //return student's info
    public String toString() {
        return String.format("[Name: %s, ASUID: %s, Grade: %.2f]", fullName, asuID, grade);
    }
    //mutator method
    public void setName(String fullName) {
    	this.fullName = fullName;
    	numOfUpdates += 1;
    }
    //mutator methods
    public void setId(String id) {
    	this.asuID = id;
    	numOfUpdates += 1;
    }

    public void setGrade(double grade) {
    	this.grade = grade;
    	numOfUpdates += 1;
    }
    //accessor methods
    public String getFullname() {
    	numOfAccessed += 1;
        return fullName;
    }
    public String getAsuID() {
    	numOfAccessed += 1;
        return asuID;
    }

    public double getGrade() {
    	numOfAccessed += 1;
        return grade;
    }

    public int getNumOfUpdates() {
    	numOfAccessed += 1;
        return numOfUpdates;
    }

    public int getNumOfAccessed() {
    	numOfAccessed += 1;
        return numOfAccessed;
    }
}