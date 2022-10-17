package day_14_String;

public class StringEx4 {
    public static void main(String[] args) {

        String text = "New School";

        String text2 = text.substring(0,2); //from index 0 to index 2 (index 2 not included)

        System.out.println("text2 = " + text2); //text2 = Ne


        String text3 = text.substring(4,10); //from index 4 to index 10 (end of the text)

        System.out.println("text3 = " + text3); //text3 = School
        // if we want to take from index x to the end of the text (only beginning index is enough)
        String text4 = text.substring(4);
        System.out.println("text4 = " + text4); //text4 = School

        String text11 = "Java Programming Language";
        String s1 = text11.substring(0,text11.indexOf(" ")); // Java
        String s2 = text11.substring(text11.indexOf(" ") + 1, text11.lastIndexOf(" ")); // Programming
        String s3 = text11.substring(text11.lastIndexOf(" ") + 1); // Language

        System.out.println("s1 = " + s1); // s1 = Java
        System.out.println("s2 = " + s2); // s2 = Programming
        System.out.println("s3 = " + s3); // s3 = Language


    }
}
