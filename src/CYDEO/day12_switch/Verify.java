package CYDEO.day12_switch;

import java.util.Scanner;

public class Verify {
    /*

     */
    public static void main(String[] args) {

        int systemPin = 1234;
        int systemSsn = 1111;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your pincode:");
        int inputPin = input.nextInt();
        System.out.print("Please enter your last 4 digits of ssn:");
        int inputSsn = input.nextInt();

        if (systemPin == inputPin && systemSsn == inputSsn){
            System.out.println("Pin code is correct!");
        } else {
            if (systemSsn != inputSsn){
                System.out.println("Last 4 SSN numbers are incorrect");
            }

            if (systemPin != inputPin) {
                System.out.println("Pin code is incorrect");
            }
        }

    }

}
