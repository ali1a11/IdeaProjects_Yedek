package from_Short_Videos;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_RemoveIf_Method {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8));


        //removeIf(Predicate): removes all the elements from the array list that are matching with the given predicate condition
        list.removeIf(each -> each<5);

        System.out.println("list = " + list);

        System.out.println("------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Jana", "Python", "C#", "JavaScript", "JUnit", "JQuery", "C++", "Ruby"));

        names.removeIf(p->p.startsWith("J"));

        System.out.println("names = " + names);

    }
}
