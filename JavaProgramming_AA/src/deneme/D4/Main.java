package deneme.D4;

class Main {
    public static double convertC(String[][] money, String[][] convertionRate) {
        // write your code here
        double total = 0;
        for (int i =0; i<2; i++){
            double amount = Double.parseDouble(money[i][1]);
            double amount2 = Double.parseDouble(convertionRate[i][1]);

            total += (amount * amount2);

        }


        return total;
    }

    public static void main(String[] args) {

        //Scanner in = new Scanner(System.in);
        System.out.println();

        String[][] test_money =
                {
                        {"mark","5"},
                        {"shekel","30.5"},
                };

        String[][] test_convert=
                {
                        {"mark","1"},
                        {"shekel","0.5"},
                };

        double res = Main.convertC(test_money,test_convert);
        System.out.print(res);

    }

}

