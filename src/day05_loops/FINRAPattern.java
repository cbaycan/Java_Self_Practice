package day05_loops;

public class FINRAPattern {
    public static void main(String[] args) {

        int n =20;
        int number=1;

        do {
            if (number % 3 == 0) {
                System.out.print("FIN ");
            } else if (number % 5 == 0) {
                System.out.print("RA ");
            } else if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FINRA ");
            } else {System.out.print(number + " ");
            }
            number++;
        } while(number<=n);
}
}



