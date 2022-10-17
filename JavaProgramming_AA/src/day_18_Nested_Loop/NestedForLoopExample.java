package day_18_Nested_Loop;
/*
Print the following shape by using a nested Loop:
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
 */



public class NestedForLoopExample {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <10 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
