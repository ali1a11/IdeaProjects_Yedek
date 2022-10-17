package day_31_Constructor;
/*
Attributes: size, numberofCheeseTopping, numberOfPepperoniTopping

    	Add a constructor that can set all the fields

Actions:
		calcCost(): returns the totalCost of the pizza
		toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

	Pizza cost is determined by:
                  S: $10 + $2 per topping
                  M: $12 + $2 per topping
                  L: $14 + $2 per topping
 */


public class Pizza {
    public char size;
    public int numberOfCheeseTopping, numberOfPepperoniToppling;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniToppling) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniToppling = numberOfPepperoniToppling;
    }


    public double calcCost(){
        double startingPrice = (size =='S')? 10 :(size == 'M')? 12: 14;

        double totalPrice = startingPrice + (numberOfCheeseTopping + numberOfPepperoniToppling)*2;

        return totalPrice;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniToppling=" + numberOfPepperoniToppling +
                ", total price= $" + calcCost() +                                // Added
                '}';
    }
}
