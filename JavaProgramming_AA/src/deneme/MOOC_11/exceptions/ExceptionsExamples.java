package deneme.MOOC_11.exceptions;

import java.util.Scanner;

public class ExceptionsExamples {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //readNumber(scanner);

        //---

        Grade grade = new Grade(3);
        System.out.println(grade.getGrade());

        Grade illegalGrade = new Grade(22);




    }
    public static int readNumber(Scanner reader) {
        while (true) {
            System.out.print("Give a number: ");

            try {
                int readNumber = Integer.parseInt(reader.nextLine());
                return readNumber;
            } catch (Exception e) {
                System.out.println("User input was not a number.");
            }
        }
    }
}
