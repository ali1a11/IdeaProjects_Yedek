package day_24_CustomMethod_Return;
/*
Warmup tasks:
	1. Create a method that can display the initials of the person. initials(String firstName, String lastName)

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has
 */

public class WarmUpTasks {

    // 1. Create a method that can display the initials of the person. initials(String firstName, String lastName)
    public static void initials(String firstName, String lastName) {
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println(initial);
    }

    // 2. Create a method that can display the domain of the email  displayDomain (String email)

    public static void displayDomain(String email) {
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println(domain);
    }

    //	3. Create a method that can display the name of the month based on the given number to the method

    public static void displayNameOfMonth(int number) {
        String name = "";
        if (number >= 1 && number <= 12) {

            name = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March" : (number == 4) ? "April" :
                    (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "August" :
                            (number == 9) ? "September" : (number == 10) ? "October" : (number == 11) ? "November" : "December";

        } else {
            name = "invalid number";
        }
        System.out.println("Month name: " + name);
    }

    // 4. Create a method that can print the name of the day based on the given number to the method

    public static void displayNameOfDay(int number) {
        String nameOfDay = "";
        if (number >= 1 && number <= 7) {
            nameOfDay = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" : (number == 3) ? "Wednesday" : (number == 4) ? "Thursday" :
                    (number == 5) ? "Friday" : (number == 6) ? "Saturday" : "Sunday";
        } else {
            nameOfDay = "invalid number";
        }
        System.out.println(nameOfDay);
    }

    // 5. Create a method that can print how many days a month has

    public static void daysinMonth(int number) {
        int daysinMonth = 0;
        if (number >= 1 && number <= 12) {
            if (number == 1 || number == 3 || number == 5 || number == 7 || number == 8 || number == 10 || number == 12) {
                daysinMonth = 31;
            } else if (number == 2) {
                daysinMonth = 28;
            } else {
                daysinMonth = 30;
            }

        } else {
            System.out.println("Invalid number");
        }


        System.out.println(number + ". month has " + daysinMonth + " days.");
    }


    public static void main(String[] args) {
        initials("john", "Cook");

        displayDomain("abc.dennis@example.com");

        /*
        String[] emails = {"abc@yahoo.com", "cvf@gmail.com", "gas@hotmail.com"};

        for (String email : emails) {
            displayDomain(email);
        }
*/
/*
        for (int i = 0; i < emails.length; i++) {
            displayDomain(emails[i]);
        }

 */

        displayNameOfMonth(11);
        displayNameOfDay(3);

        daysinMonth(4);

    }
}
