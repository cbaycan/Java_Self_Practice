package day04_selection_statements;

public class Grade {
    public static void main(String[] args) {

        double math = 90.0;
        double chemistry = 90.0;
        double biology = 90.0;

        double grade = (math+chemistry+biology)/3;

        if (grade>=90 && grade<=100) {
            System.out.println("Your average grade is A");
        }else if (grade>=80 && grade<=89) {
            System.out.println("Your average grade is B");
        }else if (grade>=70 && grade<=79) {
            System.out.println("Your average grade is C");
        }else if (grade>=60 && grade<=69) {
            System.out.println("Your average grade is D");
        }else
            System.out.println("Your average grade is F");

            }
        }

