package deneme.D5;
/*
import java.util.*;

class ReplitLameDb {


    public static String lameDb(String db, String op, String id, String data) {

//
        String str = "1etsy#2wooden#3spoon#4aaa";

        String[] array = str.split("#");

        //str = str.replace("el", "XXX");

        for (
                int i = 0;
                i < array.length; i++) {
            array[i] = array[i] + "#";
        }


        //sondaki # unutma

        switch (op) {
            case "add":
                String[] array1 = new String[array.length + 1];
                if (id.equals("1")) {
                    array1[0] = "1" + data;
                    for (int i = 1; i < array1.length; i++) {
                        array1[i] = array[i - 1];
                    }
                }
                if (id.equals("2")) {
                    array1[0] = array[0];
                    array1[1] = "1" + data;
                    array1[2] = array[1];
                    array1[3] = array[2];
                }
                if (id.equals("3")) {
                    array1[0] = array[0];
                    array1[1] = array[1];
                    array1[2] = "1" + data;
                    array1[3] = array[2];
                }
                if (id.equals("4")) {
                    array1[0] = array[0];
                    array1[1] = array[1];
                    array1[2] = array[2];
                    array1[3] = "1" + data;
                }
                break;

            case "edit":
                if (id.equals("1")) {
                    array[0] = "1" + data;

                }
                if (id.equals("2")) {
                    array[1] = "2" + data;

                }
                if (id.equals("3")) {
                    array[2] = "3" + data;

                }
                break;

            case "remove": // or delete
                String[] array2 = new String[array.length - 1];

                if (id.equals("1")) {
                    for (int i = 0; i < array2.length; i++) {
                        array2[i] = array[i + 1];
                    }
                }

                if (id.equals("2")) {
                    array2[0] = array[0];
                    array2[1] = array[2];
                    array2[2] = array[3];
                }

                if (id.equals("3")) {
                    array2[0] = array[0];
                    array2[1] = array[1];
                    array2[2] = array[2];

                }
                break;

        }


    }


        System.out.println(Arrays.toString(array));

    String text = "";
    // array to string
        for(
    String each :array)

    {
        text += each;
    }

        System.out.println(text);


        return null;

}//end lameDb


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));

    }
}

 */