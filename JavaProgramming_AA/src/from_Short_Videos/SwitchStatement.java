package from_Short_Videos;

public class SwitchStatement {
    public static void main(String[] args) {

        int number = 1;
        String day;

        // print the name of the day

        switch (number) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid number";
                break;
        }

        System.out.println("day = " + day);

    }
}
