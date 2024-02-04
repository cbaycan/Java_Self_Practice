package day05_loops;

public class NumberPattern {
    public static void main(String[] args) {


        for (int i = 1; i < 6; i++) {
            for (int column = 0; column < i; column++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
