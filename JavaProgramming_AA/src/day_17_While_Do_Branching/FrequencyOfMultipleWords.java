package day_17_While_Do_Branching;

public class FrequencyOfMultipleWords {
    public static void main(String[] args) {

        String str = "Java Java JaVa JAVA python python Python";
        int countJava = 0;
        int countPython = 0;

        str = str.toLowerCase();

        while (str.contains("java")||str.contains("python")){
            if (str.contains("java")){
                str = str.replaceFirst("java", "");
                countJava++;
            }
            if (str.contains("python")){
                str = str.replaceFirst("python", "");
                countPython++;
            }
        }

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);


    }
}
