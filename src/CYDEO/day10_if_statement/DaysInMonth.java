package CYDEO.day10_if_statement;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of month from 1-12");
        int month = input.nextInt();
        int day = 0;

        boolean has31Days = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;

        // multi branch is determining the number of days in each month
        if (has31Days){
            day = 31;
        } else if (has30Days) {
            day = 30;
        } else if (month == 2) {
            day = 28;
        }

        // determine the output of my program
        if (day > 0){
            System.out.println("Month: " + month);
            System.out.println("Days in the month: " + day);
        } else {
            System.out.println(month + " is not a valid data");
        }
    }
}
