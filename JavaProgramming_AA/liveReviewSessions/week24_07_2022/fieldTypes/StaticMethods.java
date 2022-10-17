package week24_07_2022.fieldTypes;

public class StaticMethods {
    public int num = 10;
    public static int count = 4;
    
    public static void displayMessage(String message){
        System.out.println("message = " + message);

        System.out.println("count = " + count);
        //instanceMethod(); instance method cannot be called in static field
    }

    public void instanceMethod(){
        System.out.println("instance method is called");
        System.out.println("num = " + num);
        System.out.println("count = " + count);
        displayMessage("Hello world"); // static method can be called in instance field
    }
}
