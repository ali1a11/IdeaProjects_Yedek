package day_31_Constructor.Tasks.RestaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    public String owner;
    public String location;
    public int numberOfStars;
    public ArrayList<Server> Servers = new ArrayList<>(); // do not forget = new ArrayList<>();
    public ArrayList<Chef> Chefs = new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    // hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
    public void hireServer(Server server) {
        Servers.add(server);
    }

    // hireServer(Server[] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList
    public void hireServer(Server[] servers) {
        Servers.addAll(Arrays.asList(servers));
    }

    // hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList
    public void hireChef(Chef chef) {
        Chefs.add(chef);
    }

    // hireChef(Chef[] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList
    public void hireChef(Chef[] chefs) {
        Chefs.addAll(Arrays.asList(chefs));
    }

    // terminateChef(int employeeID): removes the chef with the matching ID from the arraylist of chef
    public void terminateChef(int employeeID) {
        Chefs.removeIf(p->p.employeeID==employeeID);
    }

    // terminateServer(int employeeID) removes the server with the matching ID from the arraylist of server
    public void terminateServer(int employeeID) {
        Servers.removeIf(p->p.employeeID==employeeID);
    }

    //  toString(): Return (String) of all the information of a Restaurant object.
    //  No need to print the whole list of Servers or Chefs.
    //  Print the number of Servers and Chefs along side the other information


    @Override
    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", number of Stars=" + numberOfStars +
                ", number of servers=" + Servers.size() +
                ", number of chefs=" + Chefs.size() +
                '}';
    }
}

