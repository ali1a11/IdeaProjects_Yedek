package week07_08_26_06_2022;

public class ShoppingAppTests {
    public static void main(String[] args) {
        String[] items = {"shoes", "jackets", "gloves", "airpods", "ipad", "iphone case"};
        double[] prices = {99.99, 350.50, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {123, 256, 359, 987, 985, 238};

        //find the first index of 'Gloves' in items array

        for (int i = 0; i < items.length; i++) { // shortcut: itar
            if(items[i].equalsIgnoreCase("gloves")){
                System.out.println("Gloves found at index = " + i);
                break;
            }
        }

        //print everything in the items except items that contains 'i'
        for (int j = 0; j < items.length; j++) {
            if (items[j].contains("i")) {
                continue;
            }
            System.out.println(items[j]);
        }

        // set a boolean variable true if ipad exist in the items

        boolean itemExists = false;

        for (String item : items) {
            if (item.equalsIgnoreCase("ipad")){
                itemExists = true;
                break;
            }
        }

        if(itemExists){
            System.out.println("Ipad on the list");
        }



/*
        for (int itemID : itemIDs) { //shortcut: iter

        }

        for (String item : items) {

        }

        for (double price : prices) {

        }
 */

    }
}
