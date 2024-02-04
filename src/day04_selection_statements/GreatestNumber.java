package day04_selection_statements;

public class GreatestNumber {
    public static void main(String[] args) {

        int x = 10;
        int y = 10;

        if (x>y) {
            System.out.println("Greatest number is x = " + x);
        }
        else if (y>x)
            System.out.println("Greatest number is y = " + y);
        else System.out.println("x = y = " + x);


    }
}
