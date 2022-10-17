package deneme.MOOC_10.intermediateOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // suppose we have a list of persons
        ArrayList<Person> persons = new ArrayList<>();

        Person p1 = new Person("Jo", "Dalton", 1846);
        Person p2 = new Person("Tom", "Dalton", 1848);
        Person p3 = new Person("Jake", "Dalton", 1850);
        Person p4 = new Person("Avarel", "Dalton", 1853);

        persons.addAll(Arrays.asList(p1, p2, p3, p4));


        long count = persons.stream()
                .filter(person -> person.getBirthYear() < 1970)
                .count();
        System.out.println("Count: " + count);

        long count2 = persons.stream()
                .filter(person -> person.getFirstName().startsWith("A"))
                .count();
        System.out.println("Count2: " + count2);


//--------------
        persons.stream()
                .map(person -> person.getFirstName())
                .distinct()
                .sorted()
                .forEach(name -> System.out.println(name));
    }
}
