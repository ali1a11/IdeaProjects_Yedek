package day_29_ArrayList_Continue;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // removeIf()
        // remove cannot be used in a loop

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        System.out.println(list);
/*
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2 !=0){
                list.remove(i); // not working properly [2, 4, 1, 2, 4, 1, 2, 4]
            }
        }
        System.out.println(list);
*/
        // removeIf()
        //lambda expression

        list.removeIf(p -> p < 5); // p represents each element of the Array List

        System.out.println(list); // [5, 6, 5, 6, 5, 6]

        //---------------------------------------------

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // remove even numbers
        list2.removeIf(each -> each % 2 == 0); // each represents each element of the Array List

        System.out.println(list2);

        //---------------------------------------------

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Python", "Java script", "C#", "C++", "Java", "Java", "Ruby"));

        // remove all the element starting with J

        list3.removeIf(p->p.startsWith("J")); // .removeIf()  // .startsWith()

        System.out.println(list3);

        //-----------------------------------------------

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Racecar", "level", "Java", "eye", "Python", "Hello", "World", "earth"));

        names.removeIf(name -> !StringUtility.isPalindrome(name)); // removes the not palindrome names in the list

        System.out.println(names);



    }
}
