import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        return this.persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }

        int shortest = this.persons.get(0).getHeight();
        Person shortestPerson = this.persons.get(0);
        for (Person person : this.persons) {
            if (person.getHeight() < shortest) {
                shortest = person.getHeight();
                shortestPerson = person;
            }

        }
        return shortestPerson;
    }

    public Person take(){
        if (persons.isEmpty()){
            return null;
        }

        int shortest = this.persons.get(0).getHeight();
        Person shortestPerson = this.persons.get(0);
        for (Person person : this.persons) {
            if (person.getHeight() < shortest) {
                shortest = person.getHeight();
                shortestPerson = person;
            }
        }
        /*
        Person toBeReturned = this.persons.get(0);
        for (Person person : this.persons) {
            if(person.getHeight() < toBeReturned.getHeight()) {
                toBeReturned = person;
            }
        }
         */

        this.persons.remove(shortestPerson);
        return shortestPerson;
        /*
        Person shortestPerson = shortest();
        this.persons.remove(shortestPerson);
        return shortestPerson;
         */

    }
}
