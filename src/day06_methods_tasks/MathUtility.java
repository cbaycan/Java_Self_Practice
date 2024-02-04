package day06_methods_tasks;

public class MathUtility {
    public static void main(String[] args) {
        int result = operator(2, '+', 5);
        System.out.println(result);
        int numSquare = square(result);
        System.out.println(numSquare);
        int numCube = cube(result);
        System.out.println(numCube);
        double resultDouble = operator(2.2, '+', 3.3);
        System.out.println(resultDouble);
        double resultDoubleSquare = square(resultDouble);
        System.out.println(resultDoubleSquare);
        double resultDoubleCube = cube(resultDouble);
        System.out.println(resultDoubleCube);

    }

    public static int operator(int num1, char mathOperator, int num2) {

        switch (mathOperator) {
            case '+':
                int sum = num1 + num2;
                return sum;
            case '-':
                int minus = num1 - num2;
                return minus;
            case '/':
                int divide = num1 / num2;
                return divide;
            case '*':
                int multiply = num1 * num2;
                return multiply;
            default:
                return 0;
        }

    }

    public static double operator(double num1, char mathOperator, double num2) {

        switch (mathOperator) {
            case '+':
                double sum = num1 + num2;
                return sum;
            case '-':
                double minus = num1 - num2;
                return minus;
            case '/':
                double divide = num1 / num2;
                return divide;
            case '*':
                double multiply = num1 * num2;
                return multiply;
            default:
                return 0;
        }
    }

    public static int square(int num) {
        int square = num * num;
        return square;
    }

    public static double square(double num2){
        double square = num2*num2;
        return square;
    }

    public static int cube(int num3){
        int cube = num3*num3*num3;
        return cube;
    }

    public static double cube(double num3){
        double cube = num3*num3*num3;
        return cube;
    }

}


