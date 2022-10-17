package day_35_OOP_Encapsulation;

public class CydeoStudentObjects {
    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("Tom", 'M', 25, 8, 7, "SDET");

        System.out.println(student1.age); // accessing instance member of the class
        student1.attendClass();

        student1.printSchoolName(); // accessing static member of the class


    }
}
