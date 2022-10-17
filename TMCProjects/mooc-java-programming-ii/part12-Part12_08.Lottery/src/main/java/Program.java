
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        LotteryRow row = new LotteryRow();
        ArrayList<Integer> lotteryNumbers = row.numbers();

        LotteryRow row2 = new LotteryRow();

        for (Integer number : row2.numbers()) {
            System.out.print(number + " ");
        }
        System.out.println("-----------------------------------------------");

        System.out.println("Lottery numbers:");
        for (Integer number : lotteryNumbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}



