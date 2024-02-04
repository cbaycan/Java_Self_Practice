package day05_loops;

public class SquarePattern {
    public static void main(String[] args) {

        int givenNum= 6;
        for (int i = 1; i <= givenNum; i++) {
            for (int j = 1; j <= givenNum ; j++) {
                System.out.print("*" + "  ");
            }
            System.out.println();
        }
    }
}
