package deneme.D5;

class ReplitLameDb2 {
    String[] array1 = {};

    public static String lameDb(String db, String op, String id, String data) {

//
        String[] array = db.split("#");

        for (
                int i = 0;
                i < array.length; i++) {
            array[i] = array[i] + "#";
        }

        switch (op) {
            case "add":
                String[] array1 = new String[array.length + 1];
                if (id.equals("1")) {
                    array1[0] = "1" + data +"#";
                    for (int i = 1; i < array1.length; i++) {
                        array1[i] = array[i - 1];
                        array1[i]= (i +1) + array1[i].substring(1);
                    }
                }
                if (id.equals("2")) {
                    array1[0] = array[0];
                    array1[1] = "2" + data + "#";
                    array1[2] = "3" + array[1].substring(1);
                    array1[3] = "4" + array[2].substring(1);
                }
                if (id.equals("3")) {
                    array1[0] = array[0];
                    array1[1] = array[1];
                    array1[2] = "3" + data + "#";
                    array1[3] = "4" +array[2].substring(1);
                }
                if (id.equals("4")) {
                    array1[0] = array[0];
                    array1[1] = array[1];
                    array1[2] = array[2];
                    array1[3] = "4" + data;
                }
                String text = "";
                // array to string
                for (
                        String each : array1) {
                    text += each;
                }
                return text.substring(0,text.length()-1);
            //break;

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
                text = "";
                // array to string
                for (
                        String each : array) {
                    text += each;
                }
                return text;


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

                }

                if (id.equals("3")) {
                    array2[0] = array[0];
                    array2[1] = array[1];

                }
                text = "";
                // array to string
                for (
                        String each : array2) {
                    text += each;
                }
                return text.substring(0,text.length()-1);
        }

        return null;
    }

    public static void main(String[] args) {
        String str = "1etsy#2wooden#3spoon";

        System.out.println(lameDb(str, "add","4","XXX"));

    }
}



