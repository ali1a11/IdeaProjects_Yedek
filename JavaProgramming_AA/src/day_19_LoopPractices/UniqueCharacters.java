package day_19_LoopPractices;
/*
	2. Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf
 */

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aabccdeefaef";
        String unique = "";
        String notUnique = "";
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if (ch ==each) {
                    count++;
                }
        }
            if (count==1){
                unique += ch;
            } else {
                if (!(notUnique.contains(""+ch))){
                    notUnique +=ch;
                }
            }
        }
        System.out.println("Given text: " + str);
        System.out.println("Unique characters: " + unique);
        System.out.println("Not unique characters: " + notUnique);
    }
}
