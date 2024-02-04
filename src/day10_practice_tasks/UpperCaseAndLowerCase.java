package day10_practice_tasks;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {


        String str = "JAVA java";

        int upperCase = 0;
        int lowerCase = 0;

        for (char each : str.toCharArray()) {
            if (Character.isLetter(each) ){


                if (Character.isLowerCase(each)) {
                    lowerCase++;
                } else {
                    upperCase++;
                }
            }
            System.out.println("lowerCase = " + lowerCase);
            System.out.println("upperCase = " + upperCase);
        }

    }


}



/*
2. Create a class called UpperCaseAndLowerCase and write a program with the following specifications:
   2.1 Given a string, return true if the total number of uppercase characters is equal to the total number of lowercase characters.

	        Eamplex:
	            str = "JAVA java";

	        output:
	            true
 */