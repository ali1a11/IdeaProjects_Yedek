package day_37_Inheritance_Cont.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iPhone1 = new Iphone("Ipohe 12", "6.7 inches", 1000, "black");

        Samsung samsung1 = new Samsung("Galaxy S19", "4 inches", 900,"white");

        Nokia nokia1 = new Nokia("XLX", "5 inches", 450, "blue");

        System.out.println("iPhone1 = " + iPhone1);
        System.out.println("samsung1 = " + samsung1);
        System.out.println("nokia1 = " + nokia1);

        iPhone1.call(911);
        iPhone1.text(45698723);
        iPhone1.faceTime(45632198);
        iPhone1.faceTime("adf@gmail.com");

        samsung1.call(15935745);
        samsung1.freeze();

        nokia1.call(15975365);
        nokia1.selfDefense();


    }
}
