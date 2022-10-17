package day_35_OOP_Encapsulation;

public class PersonObjects {
    public static void main(String[] args) {
        Person person1 = new Person("Julia", 24, 'F', "English");
        Person person2 = new Person("John", 26, 'M', "Spanish");

        System.out.println("person1 = " + person1); // person1 = Person{name='Julia', age=24, gender=F, language='English', planet='Earth'}
        System.out.println("person2 = " + person2); // person2 = Person{name='John', age=26, gender=M, language='Spanish', planet='Earth'}

        person1.eat("apple"); // Julia is eating apple
        person2.drink("orange juice"); // John is drinking orange juice
        System.out.println(Person.isHuman); // true
        System.out.println(person1.isHuman); // true
    }
}
