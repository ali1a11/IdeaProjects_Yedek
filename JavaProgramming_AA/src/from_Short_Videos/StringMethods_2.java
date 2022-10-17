package from_Short_Videos;

public class StringMethods_2 {
    public static void main(String[] args) {

        // replace(oldValue, newValue): replaces all the matching character(s) of the String with the given character(s), return type --> String
        String str1 = "Wooden spoon";
        str1 = str1.replace("o", "i");

        System.out.println("str1 = " + str1); // str1 = Wiiden spiin

        String sentence1 = "He loves Java, Java is a good programming language.";

        sentence1 = sentence1.replace("He", "She");
        sentence1 = sentence1.replace("Java", "C++");

        System.out.println("sentence1 = " + sentence1); // sentence1 = She loves C++, C++ is a good programming language.

        System.out.println("-----------------------------");

        // replaceFirst(oldValue, newValue): replaces the first matching character(s) of the String with the given character(s), return type --> String
        String str2 = "Wooden spoon";
        str2 = str2.replaceFirst("o", "x"); //str2 = Wxoden spoon

        System.out.println("str2 = " + str2);

        String sentence2 = "He loves Java, Java is a good programming language.";

        sentence2 = sentence2.replaceFirst("Java", "C#");
        System.out.println("sentence2 = " + sentence2); // sentence2 = He loves C#, Java is a good programming language.

        System.out.println("-----------------------------");

        // subString(beginningIndex): creates substring starting from the given beginning index to the end of the String. return type -> String

        String str3 = "Java Programming Language";

        String result1 = str3.substring(2);
        System.out.println("result1 = " + result1);

        String result2 = str3.substring(str3.indexOf("P"));
        System.out.println("result2 = " + result2);

        // substring(beginningIndex, endingIndex)
        String result3 = str3.substring(5, 16);
        System.out.println("result3 = " + result3); // result3 = Programming

        String result4 = str3.substring(str3.indexOf("P"), str3.indexOf(" L"));
        System.out.println("result4 = " + result4);

        System.out.println("-----------------------------");
        // repeat(N): repeats the string N number of times return type -> String
        String str4 = "Java";
        String repeatResult = str4.repeat(3);

        System.out.println("repeatResult = " + repeatResult); // repeatResult = JavaJavaJava

        System.out.println("-----------------------------");
        System.out.println("-----------------------------");



    }
}
