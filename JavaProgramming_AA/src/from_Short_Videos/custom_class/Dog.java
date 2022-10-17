package from_Short_Videos.custom_class;

public class Dog {
    public String name;
    public char gender;
    public String breed;
    public String size;
    public int age;
    public String color;

    public void eat(){
        System.out.println(name + " is eating.");
    }

    public void drink(){
        System.out.println(name + " is drinking.");
    }

    public void play(){
        System.out.println(name + " is playing.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
