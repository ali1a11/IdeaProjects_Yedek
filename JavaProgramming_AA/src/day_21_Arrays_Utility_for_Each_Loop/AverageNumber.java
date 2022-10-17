package day_21_Arrays_Utility_for_Each_Loop;

public class AverageNumber {
    public static void main(String[] args) {


        int[] numbers = {10, 20, 30, 40, 50, 60};

        double sum = 0;

        for (int i : numbers) {
            sum += i;
        }

        double average = sum / numbers.length;

        System.out.println("average = " + average);

        for (int number : numbers) {  //shortcut for for each loop ArraysName.for

        }


    }
}
