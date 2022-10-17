package day_51_Map_Intro_Enum;

public class TestENUM {
    public static void main(String[] args) {

        // String browser = "Wooden spoon";

        Browser browser = Browser.CHROME; //ENUM

        switch (browser){
            case FIREFOX:
                System.out.println("Firefox is selected.");
                break;

            case SAFARI:
                System.out.println("Safari is selected.");
                break;

            case OPERA:
                System.out.println("Opera is selected.");
                break;

            case EDGE:
                System.out.println("Edge is selected");
                break;

            default:
                System.out.println("Chrome is selected.");
        }

        System.out.println("---------------------");

        Season season = Season.FALL; // IT CANNOT BE ASSIGNED OTHER VALUES THAN 4 SEASONS

    }
}
