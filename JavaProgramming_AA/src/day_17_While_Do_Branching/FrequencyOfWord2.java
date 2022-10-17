package day_17_While_Do_Branching;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String str = "Cat Cat Dog Dog cat cAt CAT cAt";

        int frequency = 0;

        for (int i = 0; i < str.length()-2; i++) {
            String str2 = str.substring(i, (i+3));
            System.out.println("str2 = " + str2);

            if (str2.equalsIgnoreCase("Cat")){ // case insensitive

         // if (str2.equals("Cat")){
                frequency ++;
            }
        }

        System.out.println("frequency = " + frequency);





    }
}
