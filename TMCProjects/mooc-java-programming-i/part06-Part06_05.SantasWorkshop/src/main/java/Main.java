
public class Main {

    public static void main(String[] args) {


        // use this main method to try out your classes!
        Gift book1 = new Gift("Harry Potter and the Philosopher's Stone", 2);

        Gift book2 = new Gift("Night", 1);

        Package gifts = new Package();
        gifts.addGift(book1);
        gifts.addGift(book2);
        gifts.addGift(book1);
        System.out.println(gifts.totalWeight());
    }
}
