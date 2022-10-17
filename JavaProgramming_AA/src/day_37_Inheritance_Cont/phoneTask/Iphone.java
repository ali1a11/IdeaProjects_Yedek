package day_37_Inheritance_Cont.phoneTask;
/*
		1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()
 */

public class Iphone extends Phone {

    public Iphone(String model, String size, double price, String color) { // do not use unnecessary parameter (String brand) is erased here
        super("Apple", model, size, price, color); // we can set "Apple" here
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand + " " + model + " is having a FaceTime with " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(brand + " " + model + " is having a FaceTime with " + email);
    }


}
