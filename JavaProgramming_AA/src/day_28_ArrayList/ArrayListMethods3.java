package day_28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(400);
        list.add(500);

        System.out.println(list); // [100, 200, 200, 300, 400, 400, 500]
/*
        int num = 1;
        list.remove(num); // if primitive int is used, it takes as index number

        System.out.println(list); // [100, 200, 300, 400, 400, 500] // the element at the index = 1 was removed

 */


        Integer num = 200; // if nonprimitive Integer is used, it removes the given object
        list.remove(num);
        System.out.println(list); // [100, 200, 300, 400, 400, 500] // first 200 was removed


        Integer num1 = 999;
        boolean b1 = list.remove(num1); // returns boolean if num1 is nonprimitive (object)
        System.out.println(b1); // false

        // remove() removes one element at a time
        //do not use remove method in a loop

        //----
        //clear(): remove all the elements of the arraylist, size will be 0

        list.clear();

        System.out.println(list); // []
        System.out.println(list.size()); // 0

        //------
        // indexOf(Data): returns the first matching element's index number, returns int
        // lastIndexOf(Data): returns the last matching element's index number, returns int

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A');
        int b = characters.lastIndexOf('A');

        System.out.println("a = " + a); // 0
        System.out.println("b = " + b); // 5

        //-------------------------------------
        //contains(Data): returns true if the element is contained in the arraylist, otherwise returns false

        boolean r1 = characters.contains('X');
        System.out.println("r1 = " + r1);









    }
}
