package day_17_While_Do_Branching;

public class HowManyTimes {
    public static void main(String[] args) {
        String str = "AAABBBC45444$+aaafhht u  das fsd f9hji";
        String chars = "" + str.charAt(0);
        //int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            String char1 = "" + str.charAt(i);
            if (!chars.contains(char1)) {
                chars += char1;
            }
        }
        System.out.println("chars = " + chars);

        for (int i = 0; i < chars.length(); i++) {
            System.out.print(chars.charAt(i) + " ");

            int frequency = 0;
            char eachChar = chars.charAt(i);
            for (int j = 0; j < str.length(); j++) {

                if (eachChar == str.charAt(j)) {
                    frequency += 1;
                }
            }
            System.out.println(frequency);
        }
    }
}
