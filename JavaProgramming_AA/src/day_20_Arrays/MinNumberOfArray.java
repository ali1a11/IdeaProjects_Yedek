package day_20_Arrays;

public class MinNumberOfArray {
    public static void main(String[] args) {
        int numbers[] = {1, -2, 3, 5, 9, -5, 8, 10};

        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("min = " + min);

/*
        int min = numbers[numbers.length-1];
        for (int i = numbers.length - 1; i >= 0; i--) { // shortcut for this loop numbers.forr
            if (numbers[i]<min){
                min =numbers[i];
            }
        }

        System.out.println("min = " + min);
 */
    }
}
