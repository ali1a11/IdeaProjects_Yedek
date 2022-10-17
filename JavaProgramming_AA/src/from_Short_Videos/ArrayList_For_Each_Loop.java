package from_Short_Videos;

import java.util.ArrayList;

public class ArrayList_For_Each_Loop {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        for(Integer each: numbers){
            System.out.print(each + " ");
        }

    }

}
