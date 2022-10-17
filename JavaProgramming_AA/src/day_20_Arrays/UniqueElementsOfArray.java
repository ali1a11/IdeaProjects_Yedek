package day_20_Arrays;

public class UniqueElementsOfArray {
    public static void main(String[] args) {
        String[] words = {"Java", "Java", "Python", "Python", "C#", "DOS"};


        for (int i = 0; i < words.length; i++) {
            String element = words[i];
            int frequency = 0;

            for (int j = 0; j < words.length; j++) {
                if (words[j].equals(element)) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.println(element + " is unique element" );
            }
        }
    }
}
