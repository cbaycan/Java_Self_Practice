package day08_string_practice_tasks;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input :");
        String word = input.next();
        String newWord = word.replaceFirst("x","a");
        System.out.println(newWord);

        /*
        if (word.startsWith("x")){
            String newWord = word.replaceFirst("x","a");
            System.out.println(newWord);
        } else {
            return;
        }

         */

        input.close();

    }

}


/*
1. Create a class named StartsWithX and write a program that asks the user to enter a word.
If the word starts with 'x,' replace it with 'a'.

        Example:
              Input:
                 xcodex

              Output:
                 acodex
 */