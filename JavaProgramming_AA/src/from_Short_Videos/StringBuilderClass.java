package from_Short_Videos;
// StringBuilder Class
// StringBuilder object represents sequences of characters
// StringBuilder object is mutable, once the object is created it can be modified
// StringBuilder is not synchronized, therefore it is not thread-safe
// There is only one way to crate StringBuilder object
// by new keyword
// StringBuilder sb1 = new StringBuilder("Wooden spoon");

// StringBuffer object is mutable, once the object is created it can be modified
// StringBuffer is synchronized, therefore it is thread-safe
// There is only one way to crate StringBuffer object
// by new keyword
// StringBuffer sb = new StringBuffer("Wooden spoon");

public class StringBuilderClass {
    public static void main(String[] args) {

        String string = "Wooden";
        string.concat(" spoon"); // creates a new object "Wooden spoon" does not change string object
        System.out.println("string = " + string); // string = Wooden


        StringBuilder sb1 = new StringBuilder("Wooden");
        sb1.append(" spoon"); // does not create a new object, modies existing sb1 object
        System.out.println("sb1 = " + sb1); // sb1 = Wooden + spoon


        StringBuffer sb2 = new StringBuffer("Wooden");
        sb2.append(" spoon-2");
        System.out.println("sb2 = " + sb2); // sb2 = Wooden spoon-2

    }
}
