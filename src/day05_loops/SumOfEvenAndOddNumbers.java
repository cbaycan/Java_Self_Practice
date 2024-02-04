package day05_loops;

public class SumOfEvenAndOddNumbers {

    public static void main(String[] args) {

        int sumEven = 0;
        int sumOdd = 0;


        for (int i = 1; i < 10; i+=2) {
            sumOdd += i ;
        }
        System.out.println();
        for (int i = 2; i <= 10; i+=2) {
           sumEven += i;
        }

        System.out.println("Sum of even number is " + sumEven);
            System.out.println("Sum of odd number is " + sumOdd);

    }
}

/*
sum of 
 */