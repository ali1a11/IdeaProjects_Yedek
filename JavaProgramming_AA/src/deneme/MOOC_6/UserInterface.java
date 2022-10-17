package deneme.MOOC_6;

import java.util.Scanner;

public class UserInterface {
    private WordSet wordSet;
    private Scanner scanner;

    public UserInterface(WordSet wordSet, Scanner scanner) {
        this.wordSet = wordSet;
        this.scanner = scanner;
    }

    public void start() {
        while(true){
            System.out.println("Enter a word: ");
            String word = scanner.nextLine();

            if (this.wordSet.contains(word)){
                break;
            }
            this.wordSet.add(word);
        }
        System.out.println("You gave the same word twice!");
    }
}
