import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> itemsCart;

    public ShoppingCart() {
        this.itemsCart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (this.itemsCart.containsKey(product)) {
            this.itemsCart.get(product).increaseQuantity();
        } else {
            this.itemsCart.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int totalPrice = 0;

        for (Item value : itemsCart.values()) {
            totalPrice += value.price();
        }

        return totalPrice;
    }


    public void print(){
        for (Item value : itemsCart.values()) {
            System.out.println(value);
        }
    }


}
