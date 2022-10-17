package day_21_Arrays_Utility_for_Each_Loop;

public class Initials {
    public static void main(String[] args) {

        String names[] = {"James Cook", "Mike White", "Karen Jo", "Jake Eagle", "Joe Dalton", "Michael Hack"};

        for (String each : names) {

            String initial = each.charAt(0) + "." + each.charAt(each.indexOf(" ") + 1);
            System.out.println(initial);


        }
    }
}
