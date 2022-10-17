public class Book implements Packable{

    private String author;
    private String nameOfBook;
    private double weightOfBook;

    public Book(String author, String nameOfBook, double weightOfBook) {
        this.author = author;
        this.nameOfBook = nameOfBook;
        this.weightOfBook = weightOfBook;
    }

    @Override
    public double weight() {
        return this.weightOfBook;

    }

    @Override
    public String toString() {
        return this.author + ": " + this.nameOfBook;
    }
}
