package deneme.MOOC_10.recap.stream.book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        Person p1 = new Person("Arthur King", 1864);
        Person p2 = new Person("Mark River", 1984);

        Book b1 = new Book(p1, "Dark Forest", 198);
        Book b2 = new Book(p2, "Open Sea", 234);
        Book b3 = new Book(new Person("Karina Black", 1896), "White River", 126);


        books.addAll(Arrays.asList(b1, b2, b3));

        double average = books.stream()
                .map(book -> book.getAuthor())
                .mapToInt(author -> author.getBirthYear())
                .average()
                .getAsDouble();

        System.out.println("Average of the authors' birth years: " + average);

        System.out.println("Author, name starting A");
        books.stream()
                .map(book -> book.getAuthor())
                .filter(p->p.getName().startsWith("A")).forEach(author-> System.out.println(author));

        books.stream()
                .filter(book->book.getName().contains("Sea"))
                .map(book -> book.getAuthor())
                .forEach(author-> System.out.println(author));

/*
Streams can also be used to build more complex string representations.
In the example below, we print "Author Name: Book" pairs arranged in alphabetical order.
*/
        books.stream()
                .map(book -> book.getAuthor().getName() + ":" + book.getName() + "pg: " + book.getPages())
                .sorted()
                .forEach(b-> System.out.println(b));
    }
}
