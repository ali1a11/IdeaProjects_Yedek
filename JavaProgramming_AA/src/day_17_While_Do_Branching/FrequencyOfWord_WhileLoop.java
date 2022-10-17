package day_17_While_Do_Branching;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {
        String str ="Java Java Python Python";
        int frequency = 0;

        while (str.contains("Java")){
            str = str.replaceFirst("Java", "");
            frequency++;
        }

        System.out.println("frequency = " + frequency);



        String sentence = "cat cat cat cat dog cat cat CAT cAT CaT";
        sentence = sentence.toLowerCase(); //for case insensitivity
        int countCat =0;

        while (sentence.contains("cat")){
            sentence = sentence.replaceFirst("cat", "");
            countCat++;
        }

        System.out.println("countCat = " + countCat);

    }
}
