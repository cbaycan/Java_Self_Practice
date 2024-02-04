package day08_string_practice_tasks;

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {

        Scanner words = new Scanner(System.in);
        System.out.println("Enter Word-1 :");
        String word1 = words.next();
        System.out.println("Enter Word-2 :");
        String word2 = words.next();


        String newWord = word1.substring(1) + word2.substring(1);
        System.out.println(newWord);
        words.close();


    }
}




        /*char word1 = words.next();
        System.out.println("Enter Word-2 :");
        String word2 = words.nextLine();
        word1 = word1.charAt(1);




    }

}
/*
2. Create a class named WithoutFirstChar. Ask the user to enter two words. Print the first word without its
first character, then print the second word without its first character.

        Example:
              Inputs:
                  apple
                  banana

              Output:
                   ppleanana

 */