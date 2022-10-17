package day_10_Nested_if;

public class CharacterIdentity {
    public static void main(String[] args) {
        char ch = '@';
        char ch2 = 65;

        if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Alphabetic");
        } else {
            System.out.println("Special character");
        }
    }
}
