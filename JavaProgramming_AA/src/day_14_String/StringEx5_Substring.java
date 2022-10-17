package day_14_String;

public class StringEx5_Substring {
    public static void main(String[] args) {
        String str1 = "Java is fun, Java is cool";

        String s1 = str1.substring(0, 10+1); // Java is fun
        
        String s2 = str1.substring(str1.lastIndexOf("J")); // Java is cool

        //System.out.println("s1 = " + s1);
        //System.out.println("s2 = " + s2);

        String str3 = "Java is fun, Java is cool, Java is popular";
        String s3 = str3.substring(0, 10+1); // Java is fun

        String s4 = str3.substring(str3.indexOf(", ") + 2, str3.lastIndexOf(",") ); // Java is cool

        String s5 = str3.substring(str3.lastIndexOf(",") + 2); // Java is popular

        System.out.println("s3 = " + s3); // s3 = Java is fun
        System.out.println("s4 = " + s4); // s4 = Java is cool
        System.out.println("s5 = " + s5); // s5 = Java is popular
        
    }
}
