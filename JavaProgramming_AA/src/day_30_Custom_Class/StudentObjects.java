package day_30_Custom_Class;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("John", 'M', 29, 1689, 'A');

        System.out.println(student1);

        Student student2 = new Student();
        student2.setInfo("Karen", 'F', 21, 3578, 'B');

        Student student3 = new Student();
        student3.setInfo("Tom", 'M', 20, 3697, 'A');

        Student student4 = new Student();
        student4.setInfo("Mary", 'F', 22, 2569, 'B');

        Student student5 = new Student();
        student5.setInfo("James", 'M', 23, 2547, 'C');

        Student[] students = {student1, student2, student3, student4, student5};

        for (Student student : students) {
            System.out.println(student);
        }

        //--------------------------------------------

        ArrayList<Student> earlyBirds = new ArrayList<>(); // students with grade A
        ArrayList<Student> angryBirds = new ArrayList<>();


        for (Student student : students) {
            if(student.grade == 'A'){
                earlyBirds.add(student);
            } else {
                angryBirds.add(student);
            }
        }

        System.out.println("earlyBirds = " + earlyBirds); // earlyBirds = [Student{name='John', gender=M, age=29, ID=1689, grade=A}, Student{name='Tom', gender=M, age=20, ID=3697, grade=A}]
        System.out.println("angryBirds = " + angryBirds); // angryBirds = [Student{name='Karen', gender=F, age=21, ID=3578, grade=B}, Student{name='Mary', gender=F, age=22, ID=2569, grade=B}, Student{name='James', gender=M, age=23, ID=2547, grade=C}]





    }
}
