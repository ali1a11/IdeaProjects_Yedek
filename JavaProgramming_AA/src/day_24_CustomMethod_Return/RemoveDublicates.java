package day_24_CustomMethod_Return;

public class RemoveDublicates {
    public static void main(String[] args) {
        String str = "aaaaffffssssdsfsdfsfsdf";
        str = removeDublicates(str);

        System.out.println(str);

    }
    	// 1. create a method that can remove duplicated characters from a string and returns the new value
        // "aaabbcccc" ===> "abc"

    public static String removeDublicates (String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains(""+each)){
                result += each;
            }
        }
        return result;
    }
}
