package deneme.D4;

import java.util.Scanner;

public class ShoppingListReportFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice= 0;

        for (int i=1; i<=10; i++){
            System.out.println("Enter Item" + i + " and its price:");
            item = scan.next();
            price = scan.nextDouble();
            shoppingListReport += "Item" + i + ": "+  item + " Price: " + price + ", ";
            totalPrice +=price;

            System.out.println("Add one more item?");
            countinue = scan.next().toLowerCase();

            if(!countinue.equals("yes")){
                break;
            }
        }

        System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-2));
        System.out.println("Total price: " + totalPrice);

    }
}