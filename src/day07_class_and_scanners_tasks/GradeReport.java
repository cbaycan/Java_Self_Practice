package day07_class_and_scanners_tasks;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        System.out.println("Enter your score:");
        int grade = score.nextInt();

        if (grade<=100 && grade>=70) {
            System.out.println("Your grade is A");
        } else if (grade<70 && grade >=40){
            System.out.println("Your grade is B");
        }else if (grade<40 && grade>=0){
            System.out.println("Your grade is C");
        } else {
            System.err.println("Invalid number");
        }

        score.close();

    }
}

/*
Create a class named GradeReport and write a program asking the user to enter their score and print the student's grade.

  If the user enters an invalid score (negative or more than 100), print "Invalid Score."

        Example:
             Enter your score:
             Input: 85

        Output:
             Your grade is B
 */