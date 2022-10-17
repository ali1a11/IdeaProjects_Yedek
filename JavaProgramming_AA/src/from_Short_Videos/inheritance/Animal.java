package from_Short_Videos.inheritance;

public class Animal {
    public String name;
    public String breed;
    public char gender;
    public int age;
    public String size;
    public String color;

    public void sleep(){
        System.out.println(name + " is sleeping.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
