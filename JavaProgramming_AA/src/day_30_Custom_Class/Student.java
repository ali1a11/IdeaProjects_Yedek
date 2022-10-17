package day_30_Custom_Class;
/*

 */

public class Student {

    // instance variable
    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;

    public void setInfo(String name, char gender, int age, int ID, char grade) { // local variable name and instance variable name can be same
        // this. keyword: used for calling the instance variables
        //assigning to instance variable with this keyword
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    //to generate setInfo by using IntelliJ shortcut
    //right click + Generate + Constructor
/*
    public Student(String name, char gender, int age, int ID, char grade) { // change to public void setInfo(String name, char gender, int age, int ID, char grade)
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }
 */

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

    public void code(){
        System.out.println(name + " is coding");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }
}
