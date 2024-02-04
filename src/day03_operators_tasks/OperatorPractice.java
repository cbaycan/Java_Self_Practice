package day03_operators_tasks;

public class OperatorPractice {
    public static void main(String[] args) {

        int b = 2 ;
        boolean result = (++b == 2 || b == 2) && --b == 2;
        // (3==2 || 3==2) && 2==2 , b=3 b will stay 3 because Java is not gonna check --b
        // (false || false) && -----
        // false && ----
        // false

        System.out.println("result is =" + result);
        System.out.println("b= " + b);

    }
}
