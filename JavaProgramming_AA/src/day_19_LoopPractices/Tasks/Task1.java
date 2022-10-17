package day_19_LoopPractices.Tasks;
// 1. Write a program that can return the first duplicated character from a string

public class Task1 {
    public static void main(String[] args) {

        String str = "123";
        String dublicates = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count =0;

            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);
                if (ch==ch2){
                    count++;
                }
            }

            if ((count>1) && (!(dublicates.contains(""+ch)))){
                dublicates += ch;
            }
        }

        if (dublicates.isEmpty()) {
            System.out.println("There is no dublicated character");
        } else {
            System.out.println("Dublicated characters: " + dublicates);
            System.out.println("First dublicate is " + dublicates.charAt(0));


        }





    }
}
