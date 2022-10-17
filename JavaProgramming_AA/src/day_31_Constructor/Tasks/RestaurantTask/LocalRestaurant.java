package day_31_Constructor.Tasks.RestaurantTask;
/*
		6.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information

 */


import java.util.ArrayList;
import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("James Deep","Centrum", 4);

        Server server1 = new Server("Mary", 3, 12.5, true);
        Server server2 = new Server("Karen", 6,10.6,false);
        Server server3 = new Server("John", 4, 11.5, true);
        Server server4 = new Server("Mark", 7, 10.6, true);

        Server[] servers = {server1, server2, server3, server4};

        restaurant1.hireServer(servers);

        Chef chef1 = new Chef("Jack", 11, 25.9, true);
        Chef chef2 = new Chef("Silvio", 14, 35.9, true);
        Chef chef3 = new Chef("George", 16, 19.8, false);

        Chef[] chefs = {chef1, chef2, chef3};

        restaurant1.hireChef(chefs);

        System.out.println("restaurant1 = " + restaurant1);

    }

}
