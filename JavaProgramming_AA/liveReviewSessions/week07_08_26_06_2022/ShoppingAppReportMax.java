package week07_08_26_06_2022;

//Find the item which is most expensive and print its info

public class ShoppingAppReportMax {
    public static void main(String[] args) {
        String[] items = {"shoes", "jackets", "gloves", "airpods", "ipad", "iphone case"};
        double[] prices = {99.99, 350.50, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {123, 256, 359, 987, 985, 238};

        double maxPrice = prices[0];
        int indexOfMaxPrice = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                indexOfMaxPrice = i;
            }
        }

        System.out.println("Max price is " + maxPrice);
        System.out.println("Item ID : " + itemIDs[indexOfMaxPrice]+ ", item : "  + items[indexOfMaxPrice]  + ", price: " + prices[indexOfMaxPrice]);

    }
}
