package from_Short_Videos;

import java.util.ArrayList;

public class ArrayList_Intro {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list); //[]
        System.out.println("list.size() = " + list.size()); //list.size() = 0

        list.add(10);
        list.add(10);
        list.add(2);

        System.out.println(list); // [10, 10, 2]
        System.out.println("list.size() = " + list.size()); // list.size() = 3
    }
}
