package day_52_Map_Cont;

public class MySecondFunctionalInterfaceTest {
    public static void main(String[] args) {

        MySecondFunctionalInterface<String> printEach;

        printEach = s -> {

            for (String each : s.split("")) {
                System.out.println(each);
            }
        };

        printEach.test("Wooden spoon");

        System.out.println("---------------------");
        MySecondFunctionalInterface<Integer> cube = n -> System.out.println(n*n*n);

        cube.test(5);

    }
}
