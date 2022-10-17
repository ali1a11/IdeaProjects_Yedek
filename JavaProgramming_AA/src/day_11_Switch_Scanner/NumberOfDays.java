package day_11_Switch_Scanner;
/*
4. NumberOfDays
			28 Days: 2
			30 days: 4, 6, 9, 11
			31 days: 1, 3, 5, 7, 8, 10, 12

			If(1~12){


			}else{
				Invalid
			}
 */

public class NumberOfDays {
    public static void main(String[] args) {
        int year = 2000;
        int number = 2;
        String result = "";

        if (number >= 1 && number <= 12) {
            switch (number) {
                case 2:
                    // result = (year % 4 == 0) ? "29 days": "28 days";
                    if (year % 4 == 0) {
                        result = "29 days";
                        //System.out.println("29 days");
                    } else {
                        result = "28 days";
                        //System.out.println("28 days");
                    }
                    break;
                case 4: case 6: case 9: case 11:
                    result = "30 days";
                    //System.out.println("30 days");
                    break;
                default:
                    result = "31 days";
                    //System.out.println("31 days");
                    break;
            }
        } else {
            result = "invalid";
            System.out.println("invalid");
        }

        System.out.println("result = " + result);
    }
}
