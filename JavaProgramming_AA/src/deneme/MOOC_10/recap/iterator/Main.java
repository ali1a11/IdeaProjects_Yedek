package deneme.MOOC_10.recap.iterator;

public class Main {
    public static void main(String[] args) {


        Card first = new Card(10, Suit.HEART);
        Card second = new Card(2, Suit.CLUB);
        Card third = new Card(5, Suit.DIAMOND);
        Card fourth = new Card(1, Suit.SPADE);

        Hand hand = new Hand();
        hand.add(first);
        hand.add(second);
        hand.add(third);
        hand.add(fourth);

        System.out.println("first = " + first);

        // System.out.println("hand = " + hand);
        hand.print();


    }
}
