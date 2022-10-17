package day_25_CustomMethods_Method_Overloading;

import utilities.ArraysUtility;

public class Test3 {
    public static void main(String[] args) {

        String[] names = {"Jack", "John", "George", "Karen", "Igor"};

        int[] intArray = {0, 9, 3, -1, 5, 86};

        int maxIntNumber = ArraysUtility.max(intArray);
        System.out.println("maxIntNumber = " + maxIntNumber);
        
        int minIntNumber = ArraysUtility.min(intArray);
        System.out.println("minIntNumber = " + minIntNumber);

        double[] doubleArray = {0.1, 2.5, 9.5, -3.8};
        
        double maxDoubleNumber = ArraysUtility.max(doubleArray);
        System.out.println("maxDoubleNumber = " + maxDoubleNumber);
        
        double minDoubleNumber = ArraysUtility.min(doubleArray);
        System.out.println("minDoubleNumber = " + minDoubleNumber);

        System.out.println("---------------------");
        
        boolean isIntArrayContains = ArraysUtility.contains(intArray, 9);
        System.out.println("isIntArrayContains = " + isIntArrayContains);

        boolean isStringArrayContains = ArraysUtility.contains(names, "Ali");
        System.out.println("isStringArrayContains = " + isStringArrayContains);




    }
}
