package day11_practicetasks;

public class EmployeeClient {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Daniel",28, 'M', "Engineer", 200_000);

        System.out.println(employee1);
        System.out.println(employee1.work());

    }



}
