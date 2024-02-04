package day04_selection_statements;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 55;
        boolean validAge = age>=0 && age<=150;
        String result = "";
        if (validAge) {
            if (age >= 55) {
                result = "Senior";
            } else if (age >= 20) {
                result = "Adult";
            } else {
                result = "Teenage";
            }
        } else {
            result = "Invalid";
        }
        System.out.println(result);
    }
    }


/*
Create a class named AgeGroups. An integer variable named age is given.
	Write a program that can determine the age group of a person. The age groups are:

		Teenager (0 ~ 20)
		Adult   (21 ~ 55)
      Senior  (55 or older)

		If the age is negative or greater than 150, print "Invalid."


			Example:
				   age = 42

			Output:
				  Young Middle-Aged Adult
 */