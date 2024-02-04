package day04_selection_statements;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 18;
        int b = 15;
        int c = 17;
        boolean aIsMedian= (a>b && a<c) || (a>c && a<b) ;
        boolean bIsMedian=(b > c && b < a) || (b > a && b < c);;


        if (aIsMedian) {
            System.out.println(a + " is the median number");
        } else if (bIsMedian) {
            System.out.println(b+ " is the median number");
        } else
            System.out.println(c+ " is the median number");
        {
    }}}


/*
Create a class named MedianNumber. Write a program that finds the median number between
three DIFFERENT given integers (Assume that the given three integers are distinct numbers).

			Example:
				   a = 10;
				   b = 15;
				   c = 20;

			Output:
				  15 is the median number


 */