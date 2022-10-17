
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        //

        while (true){
          String input = scanner.nextLine();

          if(input.equals("")){

              inputs.stream().forEach(x -> System.out.println(x));


              break;
          }
          inputs.add(input);
        }

    }
}

/*

import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> read = new ArrayList<>();

        while (true) {
            String read_current = scanner.nextLine();

            if (read_current.isEmpty()) {
                break;
            }

            read.add(read_current);
        }

        read.stream().forEach(s -> System.out.println(s));
    }
}
 */
