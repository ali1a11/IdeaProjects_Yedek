package day_32_CustomClass_Constructor;

public class EmployeeObject {
    public static void main(String[] args) {
        
        Employee employee1 = new Employee("Aaron");

        System.out.println("employee1 = " + employee1); // employee1 = Employee{name='Aaron', gender= , jobTitle='null', salary=0.0}
        
        Employee employee2 = new Employee("John", 'F');

        System.out.println("employee2 = " + employee2); // employee2 = Employee{name='John', gender=F, jobTitle='null', salary=0.0}
        
        Employee employee3 = new Employee("Tom", 'M', "SDET"); // employee3 = Employee{name='Tom', gender=M, jobTitle='SDET', salary=0.0}

        System.out.println("employee3 = " + employee3);
    }
}
