package week_13_31_07_2022.inheritance;

public class BookStore {
    public static void main(String[] args) {
        Book book = new Book("1984","distopia", "George Orwell", 25);

        System.out.println(book);
        book.buy("D R");
        book.lend("GAA");

        AudioBook a1 = new AudioBook("Animal Farm", "story", "George Orwell", 34, 680,"Mike Tyson");

        System.out.println(a1);
    }
}
