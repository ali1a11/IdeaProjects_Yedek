package from_Short_Videos.enum_Intro;

import java.util.Arrays;

public class Enum_Test {
    public static void main(String[] args) {

        Day day = Day.MONDAY;

        System.out.println("day = " + day);

        Day[] days = Day.values();

        System.out.println(Arrays.toString(days)); // [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY]

        System.out.println("--------------------------------");

        String dayPrint = "";

        day = Day.FRIDAY;

        switch (day){
            case MONDAY:
                dayPrint = "Monday";
                break;
            case TUESDAY:
                dayPrint = "Tuesday";
                break;
            case WEDNESDAY:
                dayPrint = "Wednesday";
                break;
            case THURSDAY:
                dayPrint = "Thursday";
                break;
            case FRIDAY:
                dayPrint = "Friday";
                break;
            case SATURDAY:
                dayPrint = "Saturday";
                break;
            case SUNDAY:
                dayPrint = "Sunday";
                break;
            default:
                dayPrint = "Invalid day";
                break;
        }

        System.out.println("Today is " + dayPrint);



    }
}
