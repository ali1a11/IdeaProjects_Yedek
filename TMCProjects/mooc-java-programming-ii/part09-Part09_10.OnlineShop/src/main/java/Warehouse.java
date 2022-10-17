import java.util.*;

public class Warehouse {

    private Map<String, Integer> productList;
    private Map<String, Integer> priceList;



    public Warehouse() {
        this.productList = new HashMap<>();
        this.priceList = new HashMap<>();
            }

    public void addProduct(String product, int price, int stock) { // part 1
        this.productList.put(product, stock);
        this.priceList.put(product, price);

    }

    public int price(String product) { // part 1
        if (!this.productList.containsKey(product)) {
            return -99;
        }
        return this.priceList.get(product);
    }

    /* from mooc
        public int price(String product) {
        return this.prices.getOrDefault(product, -99);
    }
     */

    public int stock(String product){
        if (!this.productList.containsKey(product)) {
            return 0;
        }
        return this.productList.get(product);
    }

    /* from mooc
        public int stock(String product) {
        return this.quantities.getOrDefault(product, 0);
    }
     */

    public boolean take(String product){
        if(this.productList.containsKey(product) && this.productList.get(product)>0){
            this.productList.put(product, this.productList.get(product)-1);
            return true;
        }
        return false;
    }

    /* from mooc
        public boolean take(String product) {
        if (!this.quantities.containsKey(product)) {
            return false;
        }

        int stock = this.quantities.get(product);
        if (stock <= 0) {
            return false;
        }

        this.quantities.put(product, stock - 1);
        return true;
    }
     */

    public Set<String> products() {
        Set<String> products = new HashSet<>();
        for (String key : productList.keySet()) {
            products.add(key);
        }

        return products;
    }

    /* from mooc
        public Set<String> products() {
        return this.quantities.keySet();
    }
     */
}
