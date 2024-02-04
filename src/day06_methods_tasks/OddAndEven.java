package day06_methods_tasks;

public class OddAndEven {
    public static void main(String[] args) {
        String result = isOdd(105);
        System.out.println(result);
        boolean result2 = isEven(200);
        System.out.println(result2);
    }
    public static String isOdd(int number) {
        if (number % 2 == 1) {
            return "true";
        } else {
            return "false";
        }
    }
    public static boolean isEven(int number2){
        if (number2 %2 ==0){
            return true;
        }else {
            return false;
        }

    }

}












/*
1. Create a class named OddAndEven:

	1.1 Create a method named isOdd that returns true if a number is odd. Otherwise, it returns false.

			Example:
				boolean result = isOdd(100);

			Output:
				false

	1.2 Create a method named isEven that returns true if a number is even. Otherwise, it returns false.

			Example:
				boolean result = isEven(100);

			Output:
				true
 */