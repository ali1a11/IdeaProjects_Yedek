package day_19_LoopPractices.Tasks;
// 3. Write a program that can display all the characters that appeared twice in the string.

public class Task3 {
    public static void main(String[] args) {
        String str = "1a2b3ca3brby3y";
        String twice = "";

        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);

                if (ch1==ch2){
                    count++;
                }
            }
            if (count==2 && !twice.contains(""+ch1)){
                System.out.println(ch1);
                twice += ch1;
            }
        }

        System.out.println(twice);

    }
}
