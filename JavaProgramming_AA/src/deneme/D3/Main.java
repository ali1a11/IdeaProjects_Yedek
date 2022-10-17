package deneme.D3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter
        // book information and to examine them
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());

            bookList.add(new Book(title, pages, pubYear));

        }
        System.out.print("What information will be printed? ");
        String info = scanner.nextLine();

        if (info.equals("name")){
            for (Book b: bookList){
                System.out.println(b.getTitle());
            }
        }

        if (info.equals("everything")){
            for (Book b: bookList){
                System.out.println(b);
            }
        }
    }
}
