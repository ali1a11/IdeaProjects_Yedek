package day_05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String name = "Jimmy";
        String lastName = "Lark";
        String fullName = name + " " + lastName;
        int age = 26;
        String jobTitle = "SDET";
        String companyName = "Green Watermellon";
        double salary = 100_000.59;


        String address = "High street, 148/2, Albany, NY, 15386.";

        System.out.println("fullName = " + fullName);
        System.out.println("Full name is "+ name + " " + lastName + ". " + name + " " + lastName + " is " + age + " years old.");
        System.out.println("Address: " + address);
        System.out.println(fullName + " is " + jobTitle + ", he works at " + companyName + ", and "+ fullName + "' salary is $" + salary + ".");


    }
}
