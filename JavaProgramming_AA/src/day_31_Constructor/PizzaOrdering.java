package day_31_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {
    public static void main(String[] args) {

        // create 100 pizza object: size - 'S', cheese topping 2, pepperoni topping 3
        // create 100 pizza object: size - 'M', cheese topping 3, pepperoni topping 4
        // create 100 pizza object: size - 'L', cheese topping 4, pepperoni topping 5

        ArrayList<Pizza> pizzas = new ArrayList<>();

        for (int i = 0; i < 100; i++) {

            Pizza smallPizza = new Pizza('S', 2, 3);
            Pizza mediumPizza = new Pizza('M', 3, 4);
            Pizza largePizza = new Pizza('L', 4, 5);
            pizzas.addAll(Arrays.asList(smallPizza,mediumPizza,largePizza));
        }

        System.out.println("Total number of pizza: " + pizzas.size());
        
        double totalPrice = 0;

        for (Pizza pizza : pizzas) {

            totalPrice += pizza.calcCost();
        }

        System.out.println("totalPrice = $" + totalPrice);
    }
}
