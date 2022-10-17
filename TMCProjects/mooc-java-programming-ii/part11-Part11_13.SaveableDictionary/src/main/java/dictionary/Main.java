package dictionary;

public class Main {
    public static void main(String[] args) {
        // You can test your dictionary here
        SaveableDictionary dictionary = new SaveableDictionary("C:\\Users\\eyela\\IdeaProjects\\TMCProjects\\mooc-java-programming-ii\\part11-Part11_13.SaveableDictionary\\words.txt");
        dictionary.load();



        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("alla oleva"));
        dictionary.save();

    }
}
