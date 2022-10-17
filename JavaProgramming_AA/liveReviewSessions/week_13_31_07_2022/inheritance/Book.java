package week_13_31_07_2022.inheritance;

public class Book {
    String title, type, author;
    double price;

    public Book(String title, String type, String author, double price) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
    }
    public Book(){

    }
    public void buy (String store){
        System.out.println("Buying from : " + store);
    }
    public void borrow(String source){
        System.out.println("Borrowing it from " + source);
    }

    public void lend(String source){
        System.out.println("Lending it from " + source);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
