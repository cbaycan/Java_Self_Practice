package day08_string_practice_tasks;

import java.util.Scanner;

public class ChangeUpperLowerCase_Task6 {

    public static void main(String[] args) {
        Scanner correctLetter= new Scanner(System.in);
        System.out.println("Enter the first name = ");
        String firstName = correctLetter.next();
        System.out.println("Enter the last name = ");
        String lastName = correctLetter.next();

        System.out.println(firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase()
        + " " +lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase());



        }





        }






/*

6. Write a program that asks the user to enter first and last names and then prints the full name in regular format
(first character in uppercase).

        Example:
              Input:
                  firstName = "cyDEo";
                  lastName = "SCHOOL";

              Output:
                   Cydeo School
 */