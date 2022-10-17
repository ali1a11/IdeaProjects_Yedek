package day_34_Static_Continue_Garbage_Collection_Access_Modifiers;

public class CydeoStudent {
    public String studentName;
    public static String schoolName;

    // Constructor
    public CydeoStudent(String studentName){
        this.studentName = studentName;
        // schoolName = "Cydeo School";
        // static variable can be set in the constructor but it is not advised and not the best way for static variables
    }

    static {
        schoolName = "Cydeo School";
    }

}


class CydeoStudentObject{
    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("Jimmy");
        CydeoStudent student2 = new CydeoStudent("Carry");

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);
    }
}
