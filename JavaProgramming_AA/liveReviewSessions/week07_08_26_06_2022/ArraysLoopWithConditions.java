package week07_08_26_06_2022;

public class ArraysLoopWithConditions {
    public static void main(String[] args) {

        // prices are more than 100

        double[] prices = {2.5, 238.9, 53.99, 99.99, 102, 1258};

        int count = 0;
        for (double price : prices) {

            if (price > 100) {
                System.out.println(price);
                count++;
            }
        }

        System.out.println(count);
    }
}
