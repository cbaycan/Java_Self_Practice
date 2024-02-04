package day06_methods_tasks;

public class SalaryCalculator {

    public static void main(String[] args) {
        double  salary = salary(45,40);
        System.out.println(salary);
    }

    public static double salary (double hourlyRate, int weeklyHours){
        double salary = hourlyRate*weeklyHours*52;
        return salary;
    }


}
