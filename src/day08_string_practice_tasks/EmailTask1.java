package day08_string_practice_tasks;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {

        Scanner emailTask = new Scanner(System.in);
        System.out.println("Enter the email address");
        String emailAddress = emailTask.next();

if (emailAddress.contains("_")) {
    String name = emailAddress.substring(0, emailAddress.indexOf("_"));
    String lastName = emailAddress.substring(emailAddress.indexOf("_") + 1, emailAddress.indexOf("@"));
    System.out.println(lastName + "_" + name + "@gmail.com");
} else {
    System.out.println(emailAddress);
}
        emailTask.close();
    }
}

/*
4. Create a class called EmailTask1. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that can swap the first name with the last name in the email
(separated by an underscore). If the email doesn't contain an underscore, print the given input email.

        Example:
              Input:
                 mike_tyson@gmail.com

              Output:
                  tyson_mike@gmail.com
 */