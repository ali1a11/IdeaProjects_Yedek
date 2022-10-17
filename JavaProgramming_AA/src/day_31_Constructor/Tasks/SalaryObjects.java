package day_31_Constructor.Tasks;

public class SalaryObjects {
    public static void main(String[] args) {

        SalaryCalculator salary1 = new SalaryCalculator(24.5, 0.04, 0.10, 40);

        double salary1Total = salary1.salary();
        System.out.println("salary1Total = " + salary1Total);
        

        double statetaxTotal = salary1.stateTax();
        System.out.println("statetaxTotal = " + statetaxTotal);
        
        double netSalary1 = salary1.salaryAfterTax();
        System.out.println("netSalary1 = " + netSalary1);

        System.out.println(salary1);

    }
}
