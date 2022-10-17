package day_04_Variables;

import java.util.Arrays;

public class SalaryCalculator {
    public static void main(String[] args) {
        // hourly aate, weekly hours
        int hourlyRate = 50;
        int weeklyHours =40;
        int weeklySalary = hourlyRate*weeklyHours;

        System.out.println(weeklySalary);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklySalary = $" + weeklySalary);


    }
}
