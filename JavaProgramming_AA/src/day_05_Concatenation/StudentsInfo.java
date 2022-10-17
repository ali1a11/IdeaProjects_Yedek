package day_05_Concatenation;
/*
   2. Create a class called StudentInfo, and declare variables for the followings:
    			1. student name (String)
    			2. age (int)
    			3. gender (char)
    			4. school name (String)
    			5. phone number (String) (###)-###-####
    			6. full time (boolean)
 */

public class StudentsInfo {
    public static void main(String[] args) {
        String studentName = "Marry White";
        int age = 18;
        char gender = 'F';
        String schoolName = "Troy High School";
        String phoneNumber = "(518) 965-4562";
        boolean fullTime = true;

        System.out.println("studentName = " + studentName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("schoolName = " + schoolName);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("fullTime = " + fullTime);

    }
}
