package from_Short_Videos.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsumerPractice2 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("John", "Jack", "Bob", "David", "Emma"));


        names.forEach(p-> System.out.println(p));

        System.out.println("-------------------------------");

        names.forEach(p-> {
            if(p.startsWith("J")){
                System.out.println(p);
            }
        });
    }
}
