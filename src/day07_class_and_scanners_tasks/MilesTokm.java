package day07_class_and_scanners_tasks;

import java.util.Scanner;

public class MilesTokm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the miles: ");
        double miles = input.nextDouble();
        double km = miles * 1.60934;
        System.out.println(miles+ " miles is equal to " + km + " kilometers.");

        input.close();

    }

}

/*
Create a class named MilesToKM and write a program that asks the user to enter the number of miles and
convert it to kilometers.

        Example:
             Enter the miles:
             Input: 10.0

        Output:
             10.0 miles is equal to 16.09 kilometers


 */