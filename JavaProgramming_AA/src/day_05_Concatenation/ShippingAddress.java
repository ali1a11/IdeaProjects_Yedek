package day_05_Concatenation;
/*
1. Create a class called ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
3. Use concatenation to print the full address

 */

public class ShippingAddress {
    public static void main(String[] args) {
        String name = "James King",
                buildingNumber = "112",
                streetName = "Lark street",
                city = "Albany",
                state = "New York",
                zipCode = "23568";

        System.out.println("Shipping address:\n\t\t" + name +"\n\t\t" + buildingNumber + " " + streetName + "\n\t\t" + city+ " "+ state+ " " + zipCode);

        String address = "Shipping address:\n\t\t\t" + name +"\n\t\t\t" + buildingNumber + " " + streetName + "\n\t\t\t" + city+ " "+ state+ " " + zipCode;
        System.out.println(address);
    }
}
