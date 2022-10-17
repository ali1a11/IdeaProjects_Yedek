package deneme.D4;

public class ParceDouble {
    public static void main(String[] args) {
        String[][] money =
                {
                        {"mark","5"},
                        {"shekel","30.5"},
                };

        double amount = Double.parseDouble(money[0][1]);
        double amount2 = Double.parseDouble(money[1][1]);

        System.out.println(amount + amount2);

    }
}
