package day07_class_and_scanners_tasks;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of Circle");
        double radius = input.nextDouble();


        double perimeter = 2*3.14*radius;
        double area = 3.14*radius*radius;

        System.out.println("Perimeter is " + perimeter);
        System.out.println("Area is " + area);

        input.close();



    }
}
/*
Create a class named Circle and write a program that asks the user to enter the radius of the Circle and calculate
the area and perimeter of the Circle.

        Example:
             Enter the radius:
             Input: 5

        Output:
             The area of the Circle is 78.5
             The perimeter of the Circle is 31.4
 */