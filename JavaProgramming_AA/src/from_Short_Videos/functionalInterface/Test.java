package from_Short_Videos.functionalInterface;

public class Test {
    public static void main(String[] args) {
/*
        MyInterface cube = (x) -> {
            System.out.println(x*x*x);
        };

 */

        MyInterface <Integer> cube = (x) -> System.out.println(x * x * x);

        cube.funtion(2); // 8

        MyInterface<Integer>  oddOrEven = (x) -> {
            if (x % 2 == 0) {
                System.out.println(x + " is a even number.");
            } else {
                System.out.println(x + " is a odd number.");
            }
        };

        oddOrEven.funtion(7); // 7 is a odd number.

        MyInterface<String> reverse = (str) -> {
            for (int i = str.length()-1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }
            System.out.println();
        };

        reverse.funtion("Hello");


    }
}
