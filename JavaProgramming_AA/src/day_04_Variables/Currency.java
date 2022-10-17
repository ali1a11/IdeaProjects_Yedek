package day_04_Variables;

public class Currency {

    public static void main(String[] args) {
        int dollarAmount = 1000;
        double lira = dollarAmount * 14.98;
        double euro = dollarAmount * 0.95;
        double yen = dollarAmount * 131.21;
        double ruble = dollarAmount * 68.25;
        double NOK = dollarAmount * 9.55;

        System.out.println("lira = " + lira);
        System.out.println("euro = " + euro);
        System.out.println("yen = " + yen);
        System.out.println("ruble = " + ruble);
        System.out.println("NOK = " + NOK);

    }
}
