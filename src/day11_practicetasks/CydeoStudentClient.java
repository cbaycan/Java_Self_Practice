package day11_practicetasks;

public class CydeoStudentClient {
    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent();
        student1.setInfo("Jennifer", 20, 12345, 'A', 36, 2);

        CydeoStudent student2 = new CydeoStudent();
        student2.setInfo("Kara", 30, 23456, 'B', 34, 4);

        System.out.println(student1);
        System.out.println(student1.study());
        System.out.println(student1.attendClass());
        System.out.println(student1.printschoolName());
        System.out.println(student1.printProgrammingLanguage());

        System.out.println(student2);
        System.out.println(student2.study());
        System.out.println(student2.attendClass());
        System.out.println(student2.printschoolName());
        System.out.println(student2.printProgrammingLanguage());


    }
}
