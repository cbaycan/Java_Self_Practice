package day05_loops;

public class FibonacciSeries {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        // compute the next numbers in the series


        for (int i = 0; i <=9; i++) {

            System.out.print(num1 + " ");
            sum = num1+num2;
            num1=num2;
            num2 = sum;

        }

    }
}
