package from_Short_Videos.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.setName("John");
        employee1.setSalary(85000);

        employee2.setName("Karen");
        employee2.setSalary(96000);


        System.out.println("employee2.getName() = " + employee2.getName());
        System.out.println("employee2.getSalary() = " + employee2.getSalary());

    }
}
