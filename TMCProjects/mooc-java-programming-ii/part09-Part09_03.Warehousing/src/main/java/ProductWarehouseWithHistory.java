public class ProductWarehouseWithHistory extends ProductWarehouse{
    //public double initialBalance;
    private ChangeHistory history1;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        //this.initialBalance = initialBalance; why not ????
        this.history1 = new ChangeHistory();

        super.addToWarehouse(initialBalance);
        this.history1.add(initialBalance);
    }

    @Override
    public void addToWarehouse(double amount) { // Part 6
        super.addToWarehouse(amount);
        this.history1.add(super.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) { // Part 6
        double taken = super.takeFromWarehouse(amount);
        this.history1.add(super.getBalance());
        return taken;

    }

    public String history(){
        return history1.toString();
    }

    public void printAnalysis() { // Part 7
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + this.history1.maxValue());
        System.out.println("Smallest amount of product: " + this.history1.minValue());
        System.out.println("Average: " + this.history1.average());
    }
}
