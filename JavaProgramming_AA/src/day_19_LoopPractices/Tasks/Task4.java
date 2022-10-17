package day_19_LoopPractices.Tasks;

// 4. Write a program that can return the index number of the first unique character.

public class Task4 {
    public static void main(String[] args) {

        String str = "a2df4fss44!fy";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);

                if (ch1 != ch2 && !unique.contains("" + ch1)) {
                    unique += ch1;
                }
            }
        }
        System.out.println("Unique characters: " + unique);
        System.out.println("First unique character is " + unique.charAt(0));

    }
}
