package deneme.MOOC_Part8.hashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HashMap2 {
    public static void main(String[] args) {

        ArrayList<Student> course1students = new ArrayList<>();

        Student student1 = new Student("Tom", 'M');
        Student student2 = new Student("George", 'M');
        Student student3 = new Student("Jane", 'F');

        course1students.addAll(Arrays.asList(student1,student2,student3));

        ArrayList<Student> course2students = new ArrayList<>();

        Student s1 = new Student("Jack", 'M');
        Student s2 = new Student("John", 'M');
        Student s3 = new Student("Karen", 'F');
        Student s4 = new Student("Mary", 'F');

        course2students.addAll(Arrays.asList(student3,s1,s2,s3,s4));

        HashMap<String, ArrayList<Student>> courses = new HashMap<>();

        // arrayList in HashMap
        courses.put("course1", new ArrayList<>());
        courses.get("course1").addAll(Arrays.asList(student1,student2,student3));

        courses.put("course2", new ArrayList<>());
        courses.get("course2").addAll(Arrays.asList(student3,s1,s2,s3,s4));

        System.out.println(courses.get("course1"));

        System.out.println(courses.get("course2"));



    }
}
