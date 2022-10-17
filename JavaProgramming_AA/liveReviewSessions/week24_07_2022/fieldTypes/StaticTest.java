package week24_07_2022.fieldTypes;

public class StaticTest {
    public static void main(String[] args) {
        StaticMethods.displayMessage("Hello from static method");
        StaticMethods object = new StaticMethods();
        object.displayMessage("we are using object to call this static method");

        System.out.println(new StaticMethods().num);

    }
}
