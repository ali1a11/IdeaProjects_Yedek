package day_17_While_Do_Branching;

public class RemoveDublicates {
    public static void main(String[] args) {

        String str = "AABBCCC";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            String ch = "" + str.charAt(i); // to use contains method concatenate char with String

            if(result.contains(ch)){
                continue;
            }
            result += ch;
        }
        System.out.println(result);
    }
}
