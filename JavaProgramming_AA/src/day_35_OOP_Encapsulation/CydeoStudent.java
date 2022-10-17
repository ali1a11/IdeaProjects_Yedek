package day_35_OOP_Encapsulation;
/*
	2. create a class named CydeoStudent
            Variables: name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            Methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()

 */

public class CydeoStudent {
    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;


    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }
    static {
        schoolName = "Cydeo";
        programmingLanguage = "Java";
        secretCode = "Wooden spoon";
    }

    //static method
    public static void printSchoolName(){
        System.out.println("School is " + schoolName);
    }
    //static method
    public static void printProgrammingLanguage(){
        System.out.println("Programming language is " + programmingLanguage);
    }
    //static method
    public static void printSecretCode(){
        System.out.println("Secret code is " + secretCode);
    }

    //instance method
    public void attendClass(){
        System.out.println(name + " is attending class.");
    }
    //instance method
    public void study(){
        System.out.println(name + " is studying.");
    }




    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
