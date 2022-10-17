package week_13_31_07_2022.inheritance;

public class Ebook extends Book{
    int sizeAtMemory;
    int pages;
/*
    public Ebook(String title, String type, String author, double price, int sizeAtMemory, int pages) {
        super(title, type, author, price);
        this.sizeAtMemory = sizeAtMemory;
        this.pages = pages;
    }


 */
    public void readBook(){
        System.out.println("reading the book from tablet");
        System.out.println("title = " + title); // since there is inheritance relationship We can reach
        System.out.println("author = " + author);
        System.out.println("price = " + price);
    }

    public Ebook(){
    }
}
