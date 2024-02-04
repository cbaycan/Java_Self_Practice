package day05_loops;

public class SumofEvenOddNumbers2 {
    public static void main(String[] args) {

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i <= 10; i++) {

            if (i%2 == 0) {
               sumEven+=i ;
            } else {
                sumOdd+=i;
            }

        }


        System.out.println("Sum of even number is " + sumEven);
        System.out.println("Sum of odd number is " + sumOdd);
    }
    }

