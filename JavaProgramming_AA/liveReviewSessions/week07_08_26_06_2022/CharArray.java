package week07_08_26_06_2022;

public class CharArray {
    public static void main(String[] args) {
        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n',};

        for (char letter : letters) {
            System.out.print(letter + " ");
        }
        System.out.println();
        String sentence = new String(letters); //char dan string e
        System.out.println("sentence = " + sentence); // sentence = java is fun

        char[] newLetters = sentence.toCharArray(); // in automation will be used
        for (char newLetter : newLetters) {

            System.out.print(newLetter + " ");
        }

        System.out.println();

        // find the frequency of chars in a string
        String str = "aaabbcdddeffff";

        char[] arr = str.toCharArray(); // .toCharArray();
        String result = "";

        /*
        for (char each : arr) {
            if (!result.contains(""+each)){
                result += each;
            }
        }
         */

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (c == arr[j]) {
                    count++;
                }
            }
            if (result.contains("" + c)) {
                continue;
            }

            result += c;
            result += count;
        }

        System.out.println("result = " + result);
    }
}
