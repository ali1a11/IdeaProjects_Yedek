package day_21_Arrays_Utility_for_Each_Loop;

public class ReverseNames {
    public static void main(String[] args) {
        String names[] = {"James Cook", "Mike White", "Karen Jo", "Jake Eagle", "Joe Dalton", "Michael Hack"};

        for (String each : names) {

            String reversed = "";

            for (int i = each.length() - 1; i >= 0; i--) {
                reversed += each.charAt(i);
            }
            System.out.println(reversed);
        }
    }
}
