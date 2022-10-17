package deneme.MOOC_10.objectsAndStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // let's assume that we have a list of books
        Person p1 = new Person("Albert Goodman", 1946);
        Person p2 = new Person("James Atkins", 1964);
        Person p3 = new Person("Karen Wattson", 1963);

        Book b1 = new Book(p1, "Sun and Summer", 165);
        Book b2 = new Book(p2, "Weather", 65);
        Book b3 = new Book(p3, "Forest and birds", 189);
        Book b4 = new Book(p3, "Rivers", 954);




        List<Book> books = new ArrayList<>();
        books.addAll(Arrays.asList(b1, b2, b3, b4));
        double average = books.stream()
                .map(book -> book.getAuthor())
                .mapToInt(author -> author.getBirthYear())
                .average()
                .getAsDouble();

        System.out.println("Average of the authors' birth years: " + average);
        // the mapping of a book to an author could also be done with a single map call
        // double average = books.stream()
        //     .mapToInt(book -> book.getAuthor().getBirthYear())
        //     ...

        System.out.println("------------------------------------------------");
        //-----------------------------------
        books.stream()
                .filter(book -> book.getName().contains("Sun"))
                .map(book -> book.getAuthor())
                .forEach(author -> System.out.println(author));

        System.out.println("------------------------------------------------");
        //------------------------
        books.stream()
                .map(book -> book.getAuthor().getName() + ": " + book.getName())
                .sorted()
                .forEach(name -> System.out.println(name));

        System.out.println("------------------------------------------------");
        //------------------------
        books.stream()
                .map(book->book.getAuthor().getName())
                .distinct()
                .sorted()
                .forEach(System.out::println);






    }
}
