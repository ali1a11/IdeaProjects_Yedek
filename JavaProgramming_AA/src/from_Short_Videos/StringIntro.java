package from_Short_Videos;

public class StringIntro {
    public static void main(String[] args) {
        // String object is immutable
        // Two ways to create String object
        // by String literal
        // by new keyword

        String str1 = "Java";
        // created in the special memory called String pool inside the Java Heap
        String str2 = "Java";
        String str3 = "Java";

        // only one object is created not three "Java" is already in the String pool

        // they are representing the same object

        System.out.println("str1 == str2 " + (str1 == str2));
        System.out.println("str2 == str3 " + (str2 == str3));

        System.out.println("-----------------------------------");
        //Creating String object by new keyword
        // creates new different object in the heap

        String str5 = new String("Java");
        String str6 = new String("Java");

        // They are not representing the same object

        System.out.println("str5 == str6 " + (str5 == str6));

        System.out.println("-----------------------------------");
        System.out.println("---------------String object is immutable--------------------");
        String text = "wooden spoon";
        text.toUpperCase(); // creates new objects, not changes text
        System.out.println("text.toUpperCase() = " + text.toUpperCase());
        System.out.println("text = " + text);

        // to assign =
        text = text.toUpperCase();
        System.out.println("text = " + text);


    }
}
