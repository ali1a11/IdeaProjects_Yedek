package day_37_Inheritance_Cont.phoneTask;
/*
		1.3 Create a sub class of Phone named Samsung:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()
 */

public class Samsung extends Phone{
    public Samsung(String model, String size, double price, String color) {
        super("Samsung", model, size, price, color); // we can set "Samsung" here
    }

    public void freeze () {
        System.out.println(brand + " " + model + " is freezing");
    }



}
