package day05_practice_tasks;

public class FactorialNumber {

    public static void main(String[] args) {
                        /*
        int i = 1;
        while (i>=5) {
            i= i * (i+1);
            System.out.println(i);
             i++;
        }  
                                  */
        int number =5;
        int factorialNumber =1;
        for (int j = 1; j<=number ; j++) {
            factorialNumber*= j;
            System.out.println(factorialNumber);
        }

       System.out.println(factorialNumber);




















    }
}
