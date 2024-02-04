package day08_string_practice_tasks;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No Split? : (Yes/No)");
        String answer = input.next();

        input.nextLine();
        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
            System.err.println("Invalid entry! Please enter yes or no :");
            answer = input.nextLine().toLowerCase();
        }
        System.out.println("Enter the number of people :");
        int people = input.nextInt();
        System.out.println("Enter the check amount");
        double checkAmount = input.nextDouble();
        System.out.println("How was the service quality ?(Excellent, great, good, fair, bad)");
        String rating = input.next();

        double serviceQuality = (rating.equalsIgnoreCase("excellent")) ? 0.25 : (rating.equalsIgnoreCase("great")) ? 0.20 :
                rating.equalsIgnoreCase("good") ? 0.15 : rating.equalsIgnoreCase("fair") ? 0.10 : 0.05;
        double totalToPay = (checkAmount * serviceQuality) + checkAmount;
        double totalTip = (checkAmount * serviceQuality);
        double totalPerPerson = totalToPay / people;
        double tipPerPerson = totalTip / people;

        System.out.println("Number of people entered: " + people +
                "\nTotal to pay: " + totalToPay +
                "\nTotal tip: " + totalTip);
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Total per person: " + totalPerPerson +
                    "\nTip per person: " + tipPerPerson);
        }
        input.close();
    }
}


//System.out.println("Split or No split? (Yes/No");





/*
7. Create a class called TipCalculator and write a program for a tip calculator. There will be different service
quality benchmarks that will determine the tip given. There will also be the ability to calculate based on the
number of people in the party and whether there is a split of the bill.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

      The program should ask the user to enter:
          - Split or No split (Yes or No),
          - Enter the number of people (number)
          - Enter the check amount (number)
          - Service Quality (String)

      And display the output in the following format:

            Example:
                  Split or No Split (Yes or No)?
                  Input: Yes
                  Enter the number of people:
                  Input: 4
                  Enter the check amount:
                  Input: 476
                  How was the service quality? (Excellent/Great/Good/Fair/Poor)
                  Input: Excellent

            Output:
                 Number of people entered: 4
                 Total to pay: 595.0
                 Total tip: 119.0
                 Total per person: 148.75
                 Tip per person: 29.75


 */