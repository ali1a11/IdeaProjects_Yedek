package week07_08_26_06_2022;

import java.util.Arrays;

public class ArraysBasic {
    public static void main(String[] args) {

        int[] codes = new int[8];

        codes[0]=12;
        codes[5]=85;
        codes[codes.length-1]=15;


        for (int i = 0; i < codes.length; i++) {
            System.out.println("codes[" + i + "] = " + codes[i]);
        }

        System.out.println(Arrays.toString(codes));

        ///

        int[] statusCodes = {200, 201, 204, 400, 401, 403, 404, 500}; // declare and initialize array

        String str = new String("Unauthoritized");

        String[] responseTypes = new String[]{"OK", "Created", "No content", new String ("Bad request"), str, "Forbidden", "Not found", "Internal server error"};

        System.out.println(Arrays.toString(responseTypes));


        for (int i = 0; i < statusCodes.length; i++) {

            System.out.println(statusCodes[i] + ": " + responseTypes[i]);

        }
    }
}
