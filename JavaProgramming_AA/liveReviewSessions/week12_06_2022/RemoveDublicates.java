package week12_06_2022;

public class RemoveDublicates {
    public static void main(String[] args) {
        String str = " Asfaaergghkp668977";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (!result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i);
            }

        }
        System.out.println("result = " + result);
    }
}
