/*package day01_day08_additional_practice_tasks;

public class ATMSimulation {

    public int accountBalance = 30_000;
    public int





        System.out.println("Please select one of the following options: (CB:Check balance, DM:Deposit Money, WM:Withdraw Money");
    String money = input.next();
        while (!(money.equalsIgnoreCase("cb") || money.equalsIgnoreCase("dm") || money.equalsIgnoreCase("wm"))) {
        System.err.println("Invalid choice. Exiting the ATM. Thank you for using our services!");
        return;
    }

       if (money.equalsIgnoreCase("cb")){
        int accountBalance= 30_000;
        System.out.println("Your account balance is : $" + accountBalance );
    } else {
        input.close();
    }

        System.out.println("Enter the amount to deposit");
    int balance = 30_000;
    int deposit = input.nextInt();
    int amount = balance+deposit;

        System.out.println("Your new balance is :$"+amount);
if (amount<=0){
        System.err.println("Depositing amount cannot be zero or negative, please try again later."
        );
    } return;

}
*/