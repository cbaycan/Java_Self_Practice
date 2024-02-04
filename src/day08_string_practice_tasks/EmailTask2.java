package day08_string_practice_tasks;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {

        Scanner emailTask2 = new Scanner(System.in);
        System.out.println("Enter your email address : ");
        String emailAddress = emailTask2.nextLine();

        String firstName = emailAddress.substring(0, 1).toUpperCase()+
                emailAddress.substring(1, emailAddress.indexOf("_")).toLowerCase();
        String lastName = emailAddress.substring(emailAddress.indexOf("_")+1, emailAddress.indexOf("_")+2).toUpperCase()+
                emailAddress.substring(emailAddress.indexOf("_")+2, emailAddress.indexOf("@")).toLowerCase();
String domain = emailAddress.substring(emailAddress.indexOf("@")+1,emailAddress.indexOf("."));



        System.out.println("First name \t: " + firstName);
        System.out.println("Last name \t: " + lastName);
        System.out.println("Domain \t\t: " +domain);




    }

}

/*
5. Create a class called EmailTask2. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that will print out information about the user based on the email.
Print the first name, last name, and domain. First and last names should be printed with the proper format.
(uppercase first letter and remaining lowercase)

        Example:
              Input:
                 craig_federighi@apple.com

              Output:
                   First name: Craig
                   Last name: Federighi
                   Domain: apple
 */