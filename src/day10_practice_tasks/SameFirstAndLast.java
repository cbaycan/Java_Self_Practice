package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class SameFirstAndLast {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Anna", "Canada", "Bob",
                "David", "Lan", "Abida", "Ebrahim", "Farida"));

        // list.removeIf( p ->  p.toLowerCase().charAt(0) == p.toLowerCase().charAt(p.length()-1));
        list.removeIf( i -> (""+i.charAt(0)).equalsIgnoreCase( ""+i.charAt(i.length()-1) ) );

        System.out.println(list);


    }

}

/*
Write a program that can remove string elements from an arraylist if the first and last characters of the string are same
    ex:
        list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

    output:
        ["Canada", "Lan", "Ebrahim", "Farida"]

 */