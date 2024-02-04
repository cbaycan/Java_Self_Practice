package day06_methods_tasks;

import javax.swing.*;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        System.out.println(max(200, 300));
        double result = max(10, 40);
        System.out.println(result);
        System.out.println(min(25.6,74.4));
        double result2 = min(22.3, 24.4);
        System.out.println(result2);
    }

    public static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static double max(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static int min(int num1, int num2) {
    if (num1<num2){
        return num1;
    } else {
        return num2;
    }
    }

    public static double min(double num1,double num2){
        if (num1<num2){
            return num1;
        } else {
            return num2;
        }
    }


}
