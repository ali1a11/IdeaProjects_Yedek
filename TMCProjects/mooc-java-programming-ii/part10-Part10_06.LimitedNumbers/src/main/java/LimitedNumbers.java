
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while(true){
            int input = scanner.nextInt();

            if(input<0){
                numbers.stream().filter(n->n>=1 && n<=5).forEach(n-> System.out.println(n));
                //
                break;
            }
            numbers.add(input);
        }

    }
}

/* from mooc

import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> read = new ArrayList<>();

        while (true) {
            int read_current = Integer.valueOf(scanner.nextLine());

            if (read_current < 0) {
                break;
            }

            read.add(read_current);
        }

        read.stream().filter(num -> num >= 1 && num <= 5).forEach(num -> System.out.println(num));
    }
}
 */
