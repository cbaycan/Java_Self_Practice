package day03_operators_tasks;

public class SalaryCalculator {
    public static void main(String[] args) {

        double hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate = 6;
        double federalTaxRate = 26;

        double grossPay = hourlyRate*weeklyHours*52;
        double federalTax = grossPay*0.26;
        double stateTax = grossPay*0.06;
        double totalTax = federalTax+stateTax;


        System.out.println("Gross pay is: $" + grossPay);
        System.out.println("Federal tax is $" + federalTax);
        System.out.println("State tax is: $" + stateTax);
        System.out.println("Total tax is: $" + totalTax);
        System.out.println("Net income is: $" + (grossPay-totalTax));


    }
}
