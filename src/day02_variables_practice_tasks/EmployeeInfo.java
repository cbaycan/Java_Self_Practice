package day02_variables_practice_tasks;

public class EmployeeInfo {
    public static void main(String[] args) {
        String employeeName;
        employeeName = "Shay";
        int age;
        age = 24;
        char gender;
        gender = 'F';
        String companyName;
        companyName = "Apple Inc";
        String jobTitle;
        jobTitle = "SDET";
        double yearsofExperience;
        yearsofExperience = 2.5;
        int salary;
        salary = 120_000;
        boolean isFullTime;
        isFullTime = true;
        boolean isMarried;
        isMarried = false;
        String employeeId;
        employeeId = "B101";

        System.out.println("Employee Name: " + employeeName);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Company Name: " + companyName);
        System.out.println("Full time: " + isFullTime);
        System.out.println("Years of work experience: " + yearsofExperience);
        System.out.println("Salary: $" + salary +".0");
        System.out.println("Married: " + isMarried);


    }
}
