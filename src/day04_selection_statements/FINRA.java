package day04_selection_statements;

public class FINRA {
    public static void main(String[] args) {
        int num1= 15;


        if (num1%3==0 && num1%5==0) {
            System.out.println("FINRA");
        } else if (num1%5==0) {
            System.out.println("RA");
        } else if (num1%3==0) {
            System.out.println("FIN");
        } else System.out.println("invalid");
    }
}
