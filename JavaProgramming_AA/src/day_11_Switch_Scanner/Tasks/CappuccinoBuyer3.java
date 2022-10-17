package day_11_Switch_Scanner.Tasks;

public class CappuccinoBuyer3 {
    public static void main(String[] args) {

        String size = "tall";
        boolean validSize = size == "tall" || size == "grande" || size == "venti";

        if (validSize) {
            switch (size) {
                case "tall":
                    System.out.println("tall:\n\t\tprice is $3.69\n" +
                            "\t\t90 calories");
                    break;
                case "grande":
                    System.out.println("grande:\n\t\tprice is $3.99\n" +
                            "\t\t120 calories");
                    break;
                default:
                    System.out.println("venti:\n\t\tprice is $4.29\n" +
                            "\t\t150 calories");
            }

        } else {
            System.out.println("Invalid Size");
        }
    }
}
