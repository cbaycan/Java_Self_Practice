package day07_class_and_scanners_tasks;

public class EmployeeClients {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Neil Apak";
        employee1.jobTitle = "Geophysicist";
        employee1.gender = 'M';
        employee1.age = 50;
        employee1.salary = 150000;

        Employee employee2 = new Employee();
        employee2.name = "Volker Koehler";
        employee2.jobTitle = "Petroleum Engineer";
        employee2.gender = 'M';
        employee2.age = 55;
        employee2.salary = 1900000;

        System.out.println(employee1);
        System.out.println(employee2);

        employee1.work();
        employee2.work();


    }
}
