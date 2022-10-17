import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand; //cards

    public ArrayList<Card> getHand() {
        return hand;
    }

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card){
        hand.add(card);
        //hand.stream().forEach(p->hand.add(p));
    }

    public void print(){
        hand.stream().forEach(p-> System.out.println(p));
    }

    public void sort(){
        Collections.sort(hand);
    }

    public int sumValues(){
        int sum = 0;
        for (Card card : this.hand) {
            sum += card.getValue();
        }
        return sum;
    }

    @Override
    public int compareTo(Hand handc) {

        return this.sumValues()- handc.sumValues();
        /*
        int sum1 = this.hand.stream().map(p->p.getValue()).reduce(0, (previousSum, value) -> previousSum + value);

        int sum2 = 0;
        for (Card card : handc.hand) {
            sum2 += card.getValue();
        }

        //this.handSum(this.hand) - hand.handSum(handc)
        return sum1-sum2;
        */
    }

    public void sortBySuit(){
        Collections.sort(hand, new BySuitInValueOrder());
    }


}
