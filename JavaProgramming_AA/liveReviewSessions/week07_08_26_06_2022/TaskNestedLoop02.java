package week07_08_26_06_2022;
/*
1
1 0
1 0 1
1 0 1 0
1 0 1 0 1
1 0 1 0 1 0

odd columns: 1
even columns: 0
 */

public class TaskNestedLoop02 {
    public static void main(String[] args) {

        for (int i = 0; i <= 6 ; i++) { // handles rows

            for (int j = 0; j <= i ; j++) { // handles columns
                if(j%2==1){
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }

        System.out.println("--------------------");

        for (int i = 6; i >=1 ; i--) {

            for (int j = 1; j <=i ; j++) {
                if(j%2==1){
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
