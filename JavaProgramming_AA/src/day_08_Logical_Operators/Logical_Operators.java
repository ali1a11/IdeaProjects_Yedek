package day_08_Logical_Operators;

public class Logical_Operators {
    public static void main(String[] args) {
        String name ="Steven";
        int age = 19;
        String citizen = "USA";
        boolean isEligible = age >= 18 && citizen == "USA";
        System.out.println(name + " iseligible to vote: " + isEligible);

        String name2 ="Jake";
        int creditScore = 720;
        int age2 = 19;
        int income =40000;

        boolean isEligible2 = creditScore>=700 && age2>=21 && income>=60000;
        System.out.println(name2 + " is eligible for loan " + isEligible2);

        //
        String name3 = "John";
        int age3 =19;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender =='F' || gender == 'M');
        System.out.println(name3 + " is eligible to register " + isEligible3);

        //
        String name4 = "James";
        String countryOfBirth = "USA";
        boolean marriedToUSCitizen = false;

        boolean isEligible4 = countryOfBirth== "USA" || marriedToUSCitizen == true;
        System.out.println(name4 + " is eligible to apply for US citizenship: " + isEligible4);

        //
        String name5 = "Anna";
        double GPA = 3.5;
        int familyIncome = 100000;

        boolean isEligible5 = GPA>=3.5 || familyIncome <= 60000;
        System.out.println(name5 + " is eligible to apply scholarship " + isEligible5);

        //
        boolean result2 = true;
        System.out.println("result2 = " + result2);

        boolean result3 = !result2;
        System.out.println("result3 = " + result3);

        int score = 85;
        boolean passed = score >=60;
        boolean failed =!passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);
    }
}
