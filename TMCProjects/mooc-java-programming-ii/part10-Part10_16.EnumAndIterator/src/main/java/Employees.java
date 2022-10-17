import java.util.*;

public class Employees {

    private ArrayList<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {

        for (Person person : peopleToAdd) {
            employees.add(person);
        }
    }

    /* from mooc
        public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(person -> Employees.this.add(person));
    }
     */




    // prints all employees
    public void print() {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //employees.stream().forEach(System.out::println);
    }

    public void print(Education education) {

        Iterator<Person> iterator2 = employees.iterator();
        while (iterator2.hasNext()) {
            Person i = iterator2.next();
            if (i.getEducation() == education) {
                System.out.println(i);
            }

            //        employees.stream().filter(p->p.getEducation() == education).forEach(System.out::println);
        }
    }

    public void fire(Education education) {

        Iterator<Person> iterator2 = employees.iterator();
        while (iterator2.hasNext()) {

            if (iterator2.next().getEducation() == education) {
                iterator2.remove();
            }
        }
    }
}

/* from mooc
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> employees;

    public Employees() {
        employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(person -> Employees.this.add(person));
    }

    public void print() {
        Iterator<Person> iter = employees.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }

    public void print(Education education) {
        Iterator<Person> iter = employees.iterator();

        while (iter.hasNext()) {
            Person person = iter.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iter = employees.iterator();

        while (iter.hasNext()) {
            Person person = iter.next();
            if (person.getEducation() == education) {
                iter.remove();
            }
        }

    }
}

 */
