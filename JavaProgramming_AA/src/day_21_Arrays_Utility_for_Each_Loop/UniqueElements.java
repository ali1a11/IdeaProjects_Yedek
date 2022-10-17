package day_21_Arrays_Utility_for_Each_Loop;

public class UniqueElements {
    public static void main(String[] args) {

        String[] words = {"John", "Mike", "Jack", "Bob", "Adam", "Adam", "Karen", "Can", "Can"};

        for (String each : words) {

            int count = 0;
            for (String element : words) {

                if (element.equals(each)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);
            }
        }
    }
}
