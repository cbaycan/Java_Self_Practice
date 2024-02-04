package day01_day08_additional_practice_tasks;

import java.util.Scanner;

public class ATMSimulationApp {
    public static void main(String[] args) {

        int accountBalance = 30_000;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your pin number:");
        int pin = input.nextInt();
        int pinNumber = 2222;

        if (!(pin == pinNumber)) {
            for (int i = 1; i < 3; i++) {
                System.err.println("Incorrect pin number , please re-enter: ");
                input.nextInt();
            }
            System.err.println("Your card is locked. Please contact with your local bank.");
            input.close();
        }

        System.out.println("Please select one of the following options: (CB:Check balance, DM:Deposit Money, WM:Withdraw Money");
        String selection = input.next();
        while (!(selection.equalsIgnoreCase("cb") || selection.equalsIgnoreCase("dm") || selection.equalsIgnoreCase("wm"))) {
            System.err.println("Invalid choice. Exiting the ATM. Thank you for using our services!");
            return;
        }

        if (selection.equalsIgnoreCase("cb")) {
            System.out.println("Your account balance is : $" + accountBalance);
        }

        if (selection.equalsIgnoreCase("dm") ) {
            System.out.println("Enter the amount to deposit");
            int deposit = input.nextInt();
            if (deposit<=0){
                System.err.println("Depositing amount cannot be zero or negative, please try again later.");
            } else if(deposit>0){
                int amount = accountBalance + deposit;
                System.out.println("Your new balance is :$" + amount);
            } else {
                return;
            } ;

            if (selection.equalsIgnoreCase("wm")) {
                System.out.println();
            }




            }


        }
    }


    // int deposit = input.nextInt();
    //int theNewBalance =





