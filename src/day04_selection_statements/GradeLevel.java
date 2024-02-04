package day04_selection_statements;

public class GradeLevel {
    public static void main(String[] args) {

        byte gradeLevel = 15;

        boolean validGrade = (1<gradeLevel && gradeLevel<18);

        String result;

        if (validGrade) {


        if (1<=gradeLevel && gradeLevel<=5) {
            System.out.println("Elementary School");
        } else if (6<=gradeLevel && gradeLevel<=8) {
            System.out.println("Middle school");
        }else if (9<=gradeLevel && gradeLevel<=12) {
            System.out.println("High school");
        }else if (13<=gradeLevel && gradeLevel<=16) {
            System.out.println("College");
        }else if (17<=gradeLevel && gradeLevel<=18) {
            System.out.println("Grad School");
        }
        }else System.out.println("Invalid Grade");

    }
}
/*
Create a class called GradeLevel. Given a number (byte) gradeLevel, determine and print which
	school type someone is in. The grade levels and types are:

		1-5: Elementary school
		6-8: Middle school
		9-12: High school
		13-16: College
		17-18: Grad School
		For any other grade level, print "Invalid grade level."

			Example:
				   gradeLevel = 8

			Output:
				  Middle school
 */