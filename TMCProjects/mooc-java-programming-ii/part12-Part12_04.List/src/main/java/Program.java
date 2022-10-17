
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        List<Integer> myList = new List<>();
        myList.add(1);
        myList.add(3);

        for(int i = 0; i < myList.size(); i++) {
            System.out.println(myList.value(i));
        }


    }

}
