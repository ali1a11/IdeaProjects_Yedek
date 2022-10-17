
import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Book> books = new ArrayList<>();

        while (true) {

            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int ageRecommendation = Integer.valueOf(scanner.nextLine());

            books.add(new Book(name, ageRecommendation));
        }

        System.out.println(books.size() + " books in total.");
/*
        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println("-------------------------");

        books.stream().sorted().forEach(p-> System.out.println(p));

        System.out.println("-------------------------");
*/
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRecommendation)
                .thenComparing(Book::getName);

        Collections.sort(books, comparator);

        for (Book e : books) {
            System.out.println(e);
        }

    }

}

/* from mooc
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Book> books = new ArrayList<>();
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            books.add(new Book(name, age));
        }

        System.out.println("");
        System.out.println("" + books.size() + " books in total.");
        System.out.println("");
        System.out.println("Books:");
        books.stream().sorted().forEach(book -> {
            System.out.println(book);
        });
    }
}
 */