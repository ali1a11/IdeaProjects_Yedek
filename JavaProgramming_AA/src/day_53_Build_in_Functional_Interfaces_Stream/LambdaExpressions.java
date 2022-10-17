package day_53_Build_in_Functional_Interfaces_Stream;

public class LambdaExpressions {
    public static void main(String[] args) {

        MyThirdFunctionalInterface<String> stringReverse =
                (s) ->{
            String reverse = new StringBuilder(s).reverse().toString();
            return reverse;
                };

        String text = "Wooden Spoon";
        String result = stringReverse.method(text);

        System.out.println("Reverse of " + text + " is " + result);

        // Create a function that can return the cube of an integer

        MyThirdFunctionalInterface<Integer> findCube =
                (n) ->{
            Integer cube = n*n*n;
            return cube;
                };

        int n = 2;
        int n3 = findCube.method(n);
        System.out.println("cupe of " + n + " is " + n3);


    }
}
