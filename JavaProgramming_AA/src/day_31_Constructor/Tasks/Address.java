package day_31_Constructor.Tasks;

/*
2. Address Task:
	2.1 Create a class named Address
		    Attributes:
		         buildingNumber, street, city, state, zipCode;

		   	Add a constructor to set all the fields

		    Actions
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012
 */

public class Address {

    public String buildingNumber, street, city, state;
    public int zipCode;

    public Address(String buildingNumber, String street, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return "Address:\n" +
                buildingNumber + " " + street + "\n" +
                city + " " + state + ", " + zipCode;
    }
}
