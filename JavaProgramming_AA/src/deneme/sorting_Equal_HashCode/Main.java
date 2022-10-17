package deneme.sorting_Equal_HashCode;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Tom", 21);
        Person p2 = new Person("Jim", 42);
        Person p3 = new Person("Karen", 18);
        Person p4 = new Person("Betty", 20);
        Person p5 = new Person("Tom", 21);

        Set<Person> personSet = new HashSet<>();

        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);
        personSet.add(p4);
        personSet.add(p5);

        for (Person person : personSet) {
            System.out.println(person);
        }

        System.out.println("-----------------------------------");

        List<Person> personList = new ArrayList<>();

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);

        Collections.sort(personList);

        for (Person person : personList) {
            System.out.println(person);
        }

    }
}
