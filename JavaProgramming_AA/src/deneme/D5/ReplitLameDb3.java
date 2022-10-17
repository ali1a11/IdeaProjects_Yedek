package deneme.D5;

class ReplitLameDb3 {
    String[] array1 = {};

    public static String lameDb(String db, String op, String id, String data) {

//
        String[] array = db.split("#");

        int idInt = Integer.parseInt(id);


        for (
                int i = 0;
                i < array.length; i++) {
            array[i] = array[i] + "#";
        }

        switch (op) {
            case "add":
                String[] array1 = new String[array.length + 1];


                for (int j = 0; j < idInt; j++) {
                    if (j == (idInt - 1)) {
                        array1[j] = idInt + data + "#";
                    } else {
                        array1[j] = array[j];
                    }

                }
                for (int i = idInt; i < array1.length; i++) {
                    array1[i] = array[i - 1];
                    array1[i] = (i + 1) + array1[i].substring(1);
                }

                String text = "";
                // array to string
                for (
                        String each : array1) {
                    text += each;
                }
                return text.substring(0, text.length() - 1);

            case "edit":

                array[idInt - 1] = idInt + data  + "#";

                text = "";
                // array to string
                for (
                        String each : array) {
                    text += each;
                }
                return text.substring(0, text.length() - 1);


            case "delete":
                array[idInt - 1] = "";

                text = "";
                // array to string
                for (
                        String each : array) {
                    text += each;
                }
                return text.substring(0, text.length() - 1);
        }

        return null;
    }

    public static void main(String[] args) {
        String str = "1other#2example#3text";

        System.out.println(lameDb(str, "edit", "3", "ttt"));

    }
}



