package day05_loops;

public class BranchingStatementsPractice {
    public static void main(String[] args) {

        int number=0;
        while (number<15) {
            number++;
            if (number<=5) {
                System.out.println("skipping number " + number);
                break;
            }
        }
    }
}
