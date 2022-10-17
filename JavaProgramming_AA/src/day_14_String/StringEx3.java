package day_14_String;

public class StringEx3 {
    public static void main(String[] args) {
        String str = "Java is fun. Java is very popular";
        str.replace("Java", "Python");
        System.out.println("str = " + str); // str = Java is fun. Java is very popular

        String str2 = str.replace("Java", "Python");
        System.out.println("str2 = " + str2); // str2 = Python is fun. Python is very popular

        String str3 = "Python Python Python Java Python C++ Python Python C#";
        String str4 = str3.replace("Python ", ""); //to erase Python

        System.out.println("str4 = " + str4); // str4 = Java C++ C#

        String str5 = "Java Java Python C++ Python C#";
        String str6 = str5.replaceFirst("Java", "Python");
        System.out.println("str6 = " + str6); // str6 = Python Java Python C++ Python C#

        String remove = "Java";

        str5 = str5.replace(remove, "").trim();

        System.out.println("str5 = " + str5);
        
    }
}
