package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {

        ArrayList<String> arr1 = new ArrayList<>();
        arr1.addAll(Arrays.asList("A", "B", "C"));
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.addAll(Arrays.asList("D", "E", "F", "G"));
        ArrayList<String> arr3 = new ArrayList<>();
       arr3.addAll(arr1);
       arr3.addAll(arr2);
        System.out.println("result = " + arr3);



    }
}
/*
4. Create a class called CombineTwoArrays and write a program with the following specifications:
   4.1 Given two String arrays, combine them into one ArrayList.

                Example:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};

                Output:
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */