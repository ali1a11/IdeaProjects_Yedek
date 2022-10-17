package day_04_Variables;

//	6. Create a class named EmployeeInfo. declare the following variables:
//				1. name (String)
//				2. age (int)
//				3. gender (char)
//				4. company (String)
//				5. jobTitle (String)
//				6. yearsOfExpereince (double)
//				7. salary (int)
//				8. isFullTime (boolean)
//				9. isMarried (boolean)
//				10. employeeId (String)
//				11. SSN (String)

public class EmployeeInfo {
    public static void main(String[] args) {
        String name = "Maria";
        int age = 25;
        char gender = 'F';
        String company = "Doodle";
        String jobTitle = "Sdet";
        double yearsOfExpereince = 2.6;
        int salary = 120000;
        boolean isMarried = true;
        String employeeId ="A1023";
        String SSN = "(123)-45953";

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("company = " + company);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("yearsOfExpereince = " + yearsOfExpereince);
        System.out.println("salary = " + salary);
        System.out.println("isMarried = " + isMarried);
        System.out.println("employeeId = " + employeeId);
        System.out.println("SSN = " + SSN);

    }
}
