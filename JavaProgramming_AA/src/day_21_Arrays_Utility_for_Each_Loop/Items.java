package day_21_Arrays_Utility_for_Each_Loop;

public class Items {
    public static void main(String[] args) {

        String[] items = {"pen", "pencil", "eraser", "A4 paper"};

        double[] prices = {1.25, 2.0, 1.1, 0.25};

        int[] itemID = {124, 135, 153, 168};

        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            double price = prices[i];
            int ID = itemID[i];

            System.out.println(item + " - " + ID + " - $" + price);

        }
    }
}
