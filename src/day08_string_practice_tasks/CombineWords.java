package day08_string_practice_tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {
        Scanner words = new Scanner(System.in);
        System.out.println("Enter Word-1 :");
        String word1 = words.next();
        System.out.println("Enter Word-2 :");
        String word2 = words.next();

        if (word1.charAt((word1.length())-1) == word2.charAt(0)) {
            String result1 = word1 + word2.substring(1);
            System.out.println(result1);

        } else {
            StringBuilder result = new StringBuilder(word1);
            result.append(word2);
            System.out.println(result);
        }

    }
}
/*
3. Create a class named CombineWords. Ask the user to enter two words. Then, add them together and print. But if the
last letter of the first word and the first letter of the second word are the same, print that character once.

        Example:
              Input:
                 one
                 eight

              Output:
                   oneight
 */