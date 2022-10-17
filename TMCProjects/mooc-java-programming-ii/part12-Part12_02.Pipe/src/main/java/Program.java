
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you may try out your class here

        Pipe<String> pipe = new Pipe<>();
        pipe.putIntoPipe("dibi");
        pipe.putIntoPipe("dab");
        pipe.putIntoPipe("dab");
        pipe.putIntoPipe("daa");
        while(pipe.isInPipe()) {
            System.out.println(pipe.takeFromPipe());
        }

        /*
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.addAll(Arrays.asList(1, 2, 3, 4));
        list.add(8);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
*/

      

        }

    }
