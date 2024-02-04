package day07_class_and_scanners_tasks;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {

        Scanner cent = new Scanner(System.in);
        System.out.println("Enter the cents:");
        int centInput = cent.nextInt();
        int dollar = centInput / 100;
        centInput = centInput - (dollar *100);
        System.out.println(dollar + " dollars and " + centInput + " cents ");



    }
}
/*
8. Create a class named CentsToDollars and write a program that asks the user to enter the number of cents and
convert the given cents to dollars. Include any remainder in the result.

        Example:
             Enter the cents:
             Input: 225

        Output:
             225 cents is equal to 2 dollars and 25 cents

 */