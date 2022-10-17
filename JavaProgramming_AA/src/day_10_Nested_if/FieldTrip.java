package day_10_Nested_if;

public class FieldTrip {
    public static void main(String[] args) {
        int grade = 2;
        String location = " ";
        int numberOfGroups = 0;
        String teacherInCharge = " ";

        if (grade >= 1 && grade <= 5) {
            if (grade == 1) {
                location = "Apple orchard";
                numberOfGroups = 3;
                teacherInCharge = "Ms. Smith";
            } else if (grade == 2) {
                location = "Zoo";
                numberOfGroups = 7;
                teacherInCharge = "Mr. Lee";
            } else if (grade == 3) {
                location = "Aquarium";
                numberOfGroups = 5;
                teacherInCharge = "Ms. Wilson";
            } else if (grade == 4) {
                location = "Aquarium";
                numberOfGroups = 5;
                teacherInCharge = "Ms. Wilson";
            } else {
                location = "Farm";
                numberOfGroups = 4;
                teacherInCharge = "Mr. Park";
            }

        } else {
            System.out.println("Invalid grade");
        }

        System.out.println("Location: " + location);
        System.out.println("Number of groups = " + numberOfGroups);
        System.out.println("Teacher in charge = " + teacherInCharge);


    }
}
