package day_24_CustomMethod_Return;

public class ReturnMethodIntro {
    public static void main(String[] args) {

        String str = "Adanada";

        String result = reverse(str);

        if(str.equalsIgnoreCase(result)){
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " is not palindrome");
        }
    }

    public static String reverse(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reverse += "" + str.charAt(i);

        }
        return reverse;
        // System.out.println(reverse);
    }
}
