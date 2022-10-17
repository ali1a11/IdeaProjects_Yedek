package day_21_Arrays_Utility_for_Each_Loop;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        String[] words = {"Java Programming", "Hello World", "Wooden Spoon", "Early Birds", "Angry Birds"};

        for (String each : words) {


            //Prints first and last character of the each element of he array
            System.out.println("" + each.charAt(0) + each.charAt(each.length() - 1));

        }
    }
}
