package day_24_CustomMethod_Return;

public class ReturnPractice3 {
    public static void main(String[] args) {
        //
        String str = "aabcctdeeo";

        System.out.println(frequency(str, 'a'));

        for (int i = 0; i < str.length(); i++) {
            int frequency = frequency(str, str.charAt(i));

            if (frequency == 1) {
                System.out.println(str.charAt(i));
            }
        }

    }
    public static int frequency (String str, char ch){
        int count = 0;
        for (char each : str.toCharArray()) { //shortcut: str.toCharArray().for
            if(each==ch){
                count++;
            }
        }
        return count;
    }

}
