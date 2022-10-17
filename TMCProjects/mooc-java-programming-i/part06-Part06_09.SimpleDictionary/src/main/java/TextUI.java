import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDic;

    public TextUI(Scanner scanner, SimpleDictionary simpleDic) {
        this.scanner = scanner;
        this.simpleDic = simpleDic;
    }

    public void start() {
        while(true) {
            System.out.print("Command: ");
            String word = scanner.nextLine();

            switch (word){
                case "end":
                    System.out.print("Bye bye!");
                    System.exit(0);
                case "add":
                    System.out.print("Word: ");
                    String word1 = scanner.nextLine();

                    System.out.print("Translation: ");
                    String word1Translation = scanner.nextLine();
                    simpleDic.add(word1, word1Translation);
                    break;
                case "search":
                    System.out.print("To be translated: ");
                    String wordToTransl = scanner.nextLine();
                    System.out.print("Translation: " + simpleDic.translate(wordToTransl));
                    break;

                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
}
