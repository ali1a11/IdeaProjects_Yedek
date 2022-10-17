package from_Short_Videos;

public class Method_Return {
    public static void main(String[] args) {
        int total = sum(2, 9);

        System.out.println("total = " + total);

        String reverseText = reverse("Hello world");

        System.out.println("reverseText = " + reverseText);

        String text = "He loves Java";

        System.out.println("Reverse of " + text + " is " + reverse(text));

        System.out.println("isPalindrome(\"Anna\") = " + isPalindrome("Anna"));

    }


    public static int sum(int num1, int num2) {
        int result;
        result = num1 + num2;
        return result;
    }

    public static String reverse(String text) {
        String result = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean isPalindrome(String str) {
        String reversed = reverse(str);

        return reversed.equalsIgnoreCase(str);
    }

}
