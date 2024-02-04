package day05_loops;

import org.w3c.dom.ls.LSOutput;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        //for loop solution
       /* int sumEven = 0;

        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            }
        }
        System.out.println(sumEven);

        */

        //While Loop Solution

        int num= 0 ;
        int sumEven=0;
        while (num<=10){
            if (num%2==0) {
                sumEven=sumEven+num;
            }
            num ++;

        }
        System.out.println("sum of the numbers " + sumEven);
    }

}
