package day_38_Inheritance_Cont.CarTask;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota = new Toyota("Camry", 2020, 20000, "gray", 12354);
        Tesla tesla = new Tesla("Model S", 2022, 94500, "red", 0);
        BMW bmw = new BMW("X5", 2020,12500,"black", 50253);

        toyota.start(); // Twist the key to ignition to start Toyota Camry
        tesla.start();  // Say "Start " to start Tesla Model S
        bmw.start();    // BMW X5 call mechanic to jump start
    }
}
