package deneme.MOOC_10.recap.stream;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonStreamUse {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        Person p1 = new Person("John", "First", 1965);
        Person p2 = new Person("Tom", "Second", 1978);
        Person p3 = new Person("Karen", "Third", 1969);
        Person p4 = new Person("Adam", "Fourth", 1967);

        persons.addAll(Arrays.asList(p1,p2,p3,p4));

        long count = persons.stream()
                .filter(person -> person.getBirthYear() < 1970)
                .count();
        System.out.println("Count: " + count);

        System.out.println("--------------person.getFirstName().startsWith(\"A\"))-------------------");

        long count2 = persons.stream()
                .filter(person -> person.getFirstName().startsWith("A"))
                .count();
        System.out.println("Count: " + count2);

        System.out.println("-------------------------------------");

        persons.stream().map(person -> person.getFirstName())
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
