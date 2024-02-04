package day05_practice_tasks;

public class FINRA {
    public static void main(String[] args) {

        int number = 100;

        for (int i = 1; i <=number ; i++) {

            if (i%3==0 && i%5==0) {
                System.out.print("FINRA ");
            } else if (i%3==0) {
                System.out.print("FIN ");
            } else if (i%5==0) {
                System.out.print("RA"+" ");
            } else System.out.print(i+ " ");

        }

    }
}
