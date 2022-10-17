package day_18_Nested_Loop;
/*
 5 4 3 2 1
  4 3 2 1
   3 2 1
    2 1
     1
*/

public class NestedLoop8 {
    public static void main(String[] args) {

        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int k = 6-i; k >=1 ; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
