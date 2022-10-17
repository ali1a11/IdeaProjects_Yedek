import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card>  {
    @Override
    public int compare(Card card1, Card card2) {
        if(card1.getSuit().ordinal()==card2.getSuit().ordinal()){
            return card1.getValue() - card2.getValue();
        }
       return card1.getSuit().ordinal() - card2.getSuit().ordinal(); //card1.getSuit().compareTo(card2.getSuit());
    }
}

/* from mooc
import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2) {
        if (c1.getSuit() == c2.getSuit()) {
            return c1.getValue() - c2.getValue();
        }

        return c1.getSuit().compareTo(c2.getSuit());
    }

}
 */