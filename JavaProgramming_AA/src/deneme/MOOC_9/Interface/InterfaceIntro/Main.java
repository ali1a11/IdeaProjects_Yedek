package deneme.MOOC_9.Interface.InterfaceIntro;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*
        TextMessage textMessage = new TextMessage("Tom", "Hello World");

        System.out.println(textMessage.read()); // Hello World

        TextMessage message = new TextMessage("ope", "It's going great!");
        System.out.println(message.read());

        ArrayList<TextMessage> textMessages = new ArrayList<>();
        textMessages.add(new TextMessage("private number", "I hid the body."));
        textMessages.add(new TextMessage("John", "Where are you"));

        System.out.println(textMessages);
*/
        /*
        ArrayList<String> pages = new ArrayList<>();
        pages.add("Split your method into short, readable entities.");
        pages.add("Separate the user-interface logic from the application logic.");
        pages.add("Always program a small part initially that solves a part of the problem.");
        pages.add("Practice makes the master. Try different out things for yourself and work on your own projects.");

        Ebook book = new Ebook("Tips for programming.", pages);

        int page = 0;
        while (page < book.pages()) {
            System.out.println(book.read());
            //Thread.sleep(1000);
            page = page + 1;
        }
        */
        ReadingList jonisList = new ReadingList();
        jonisList.add(new TextMessage("arto", "have you written the tests yet?"));
        jonisList.add(new TextMessage("arto", "have you checked the submissions yet?"));

        System.out.println("Joni's to-read: " + jonisList.toRead());


    }
}
