/*-------------------------------------------------------------
// AUTHOR: Nahid Islam Madison Chester - 1219358478
// FILENAME: AutoGrader.java
// SPECIFICATION: This is your test driver for Lab7. Please do
// NOT touch anything in this file.
//-----------------------------------------------------------*/
import java.util.Scanner;
public class Lab7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sFirstname, sLastname, sAsuID;
        double sGrade;
        String pName, pDesc, pFname;

        // Read some input data
        System.out.print("The student's first name? ");
        sFirstname = scan.nextLine();
        System.out.print("The student's last name? ");
        sLastname = scan.nextLine();
        System.out.print("The student's ASU ID? ");
        sAsuID = scan.nextLine();
        System.out.print("Program name? ");
        pName = scan.nextLine();
        System.out.print("Program desc? ");
        pDesc = scan.nextLine();
        System.out.print("Program filename? ");
        pFname = scan.nextLine();
        System.out.print("Program grade? ");
        sGrade = scan.nextDouble(); scan.nextLine();
        System.out.print(""); 
        scan.close();
        
        // Create a Student object "student1"
        String fullName = sFirstname + " " + sLastname;
        Student student1 = new Student(fullName, sAsuID, -1);
        // Use the setGrade setter to set student1's grade
        System.out.println("Making a student record\n..." + student1 + "");
        student1.setGrade(9);
        // Create a Program object "program1" by "student1"
        Program program1 = new Program(pName, pDesc, pFname, student1);
        System.out.println("Making a program record\n...[" + program1 + "]");

        // Invoke makeReport to show the report of student1
        makeReport(program1);}
        
        private static void makeReport(Program program) {
            println("\n========== Program Submission Detail ==========");
            pprint("Student", program.getAuthor().getFullname());
            pprint("ASU ID", program.getAuthor().getAsuID());
            pprint("Grade", "" + program.getAuthor().getGrade());
            println("");
            pprint("Program", program.getProgramName());
            pprint("Filename", program.getFileName());
            pprint("Description", program.getDescription());
            pprint("Datetime", program.getCreatedDate());
        }

        private static void pprint(String key, String value) {
            println(String.format("%-12s: %-10s", key, value));
        }

        private static void println(String s) {
            System.out.println(s);
        }
    }