package day05_loops;

public class StairPattern {
    public static void main(String[] args) {

        for (int row = 0;row <=6; row++) {
            for (int column = 0; column <=row; column++) {
                System.out.print(" ");
            }
            System.out.println("#");
        }
    }
}
