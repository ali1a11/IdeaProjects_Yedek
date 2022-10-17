package day_31_Constructor.Tasks.RestaurantTask;

public class Chef {
    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    //  makeOrder(): chef's name + " is making an order"
    public void makeOrder() {
        System.out.println(name + " is making an order");
    }

    // washDishes(): chef's name + " is washing the dishes"
    public void washDishes(){
        System.out.println(name + " is washing the dishes");
    }

    @Override
    public String toString() {
        return "Chef{" +
                "name= '" + name + '\'' +
                ", employeeID= " + employeeID +
                ", hourlyRate= $" + hourlyRate +
                ", fullTime status= " + ( (fullTime) ? "full-time": "part-time") +
                '}';
    }
}
