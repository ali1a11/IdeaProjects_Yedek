package day_42_Exceptions_Continue;

import java.util.NoSuchElementException;

public class ThrowKeyword2 {
    public static void main(String[] args) {

        throw new NoSuchElementException("There is no such element EXAMPLE OF throw");

        // After throw no code is compilable

        // System.out.println("Hello"); // Unreachable

    }
}
