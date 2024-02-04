package day09_practice_tasks;

public class EvenOddNumbers {

    public static void main(String[] args) {

        int[] evenOddNumbers = {1, 2, 3, 4, 5, 6, 7};

        int evens = 0;
        int odds = 0;

        for (int i=0 ; i< evenOddNumbers.length ; i++) {
            if (evenOddNumbers[i] % 2 == 0) {
                evens = evens+1;
            } else  {
                odds = odds+1;
            }
        }
        System.out.println("The array has " +evens+ " evens and " + odds + " odds.");

    }


}

