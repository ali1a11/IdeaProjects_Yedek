package day_17_While_Do_Branching;
/*
	2. write a program that can return the frequency of the a word Java from the sentence 

        Ex:
            sentence = "JavaJavaJava";
           
            output: 3
 */

public class FrequenctOfJava {
    public static void main(String[] args) {
        String str = "JavaJavaJava";
        
        int frequency = 0;

        for (int i = 0; i < str.length()-3; i++) {
            String str2 = str.substring(i, (i+4));
            System.out.println("str2 = " + str2);
            
            if (str2.equals("Java")){
                frequency ++;
            }
        }

        System.out.println("frequency = " + frequency);

    }
}
