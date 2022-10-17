package deneme.MOOC_9.polymorphism.PolymorphismQuiz;

public class Student extends Person {

    private int credits;

    public Student(String name, int age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    public void studentMethod(){
        System.out.println(this.getName() + " is a student");
    }

    @Override
    public String toString() {
        return super.toString() + credits + " credits";
    }

}
