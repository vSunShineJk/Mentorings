package CYDEO.day11_nested;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int validPasscode = 7021;
        System.out.println("Welcome to the ATM. Enter your card and enter your passcode");
        int userPasscode = input.nextInt(); // passcode the user inputs

        if (userPasscode == validPasscode){
            System.out.println("Logged In!\nSelect a number\n\t1)Check Balance\n\t2)Withdraw\n\t3)Deposit");
            int selection = input.nextInt();

            if (selection == 1){
                System.out.println("Your balance is: $1.000.000");
            } else if (selection == 2) {
                System.out.println("How much do you want to withdraw?");
                System.out.println("Withdraw $" + input.nextInt());
            }else if (selection == 3) {
                System.out.println("Enter the amount you want to deposit");
                System.out.println("Deposit $" + input.nextInt());
            }
        }

    }
}
