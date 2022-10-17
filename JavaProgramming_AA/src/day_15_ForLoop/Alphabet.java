package day_15_ForLoop;

public class Alphabet {
    public static void main(String[] args) {
        // printing A to Z

        for (char i = 'A'; i<= 'Z'; i++ ){ // i = A, B ....
            System.out.print(i + " ");
        }

        System.out.println();

        for (char i = 'a'; i<= 'z'; i++ ){
            System.out.print(i + " ");
        }

        System.out.println();

        for (char i = 'z'; i>= 'a'; i-- ){
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 65; i<=90; i++) { //ASCII  i=65, 66 ....
            System.out.print((char)i + " ");
        }

        for( char i =1; i <= 40000; i++){
            System.out.print(i + " ");
        }

    }
}
