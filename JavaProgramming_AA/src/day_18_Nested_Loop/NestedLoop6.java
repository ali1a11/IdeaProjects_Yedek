package day_18_Nested_Loop;
/*
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1

*/

public class NestedLoop6 {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            for (int j = 6-i; j >=1 ; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
