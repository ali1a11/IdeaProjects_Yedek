package day_11_Switch_Scanner.Tasks;
/*
	1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories
						grande:
								price is $3.99;
								120 calories
						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"

			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "tall";
        boolean validSize = size == "tall" || size == "grande" || size == "venti";

        if (validSize) {
            if (size == "tall") {
                System.out.println("tall:\n\t\tprice is $3.69\n" +
                        "\t\t90 calories");
            } else if (size == "grande") {
                System.out.println("grande:\n\t\tprice is $3.99\n" +
                        "\t\t120 calories");
            } else {
                System.out.println("venti:\n\t\tprice is $4.29\n" +
                        "\t\t150 calories");
            }

        } else {
            System.out.println("Invalid Size");
        }

    }
}
