package day_24_CustomMethod_Return;


public class ReturnStatement {
    public static void main(String[] args) {

        displayNameOfDay(6);
    }

    public static void displayNameOfDay(int number) {
        String nameOfDay = "";
        if (number < 1 || number > 7) {
            System.out.println("Invalid");

            return; //exits displayNameOfDay method
        }

        String NameOfDay = "";
        if (number == 1) {
            NameOfDay = "Monday";
        } else if (number == 2) {
            NameOfDay = "Tuesday";
        } else if (number == 3) {
            NameOfDay = "Wednesday";
        } else if (number == 4) {
            NameOfDay = "Thursday";
        } else if (number == 5) {
            NameOfDay = "Friday";
        } else if (number == 6) {
            NameOfDay = "Saturday";
        } else {
            NameOfDay = "Sunday";
        }

        System.out.println(NameOfDay);

    }
}
