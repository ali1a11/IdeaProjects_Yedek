package from_Short_Videos;

public class Loops_break_continue {
    public static void main(String[] args) {

        for(char i = 'A'; i <= 'E'; i++){
            System.out.print(i + " ");

            if( i == 'C'){
                break;
            }
        }

        // A B C

        System.out.println();

        System.out.println("-------------------");

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");

            if(i == 3 ){
                break;
            }
        }

        // 1 2 3

        System.out.println();
        System.out.println("-------------------");

        for(char i = 'A'; i <= 'E'; i++){

            if( i == 'C'){
                continue;
            }

            System.out.print (i + " ");
        }

        // A B D E

    }
}
