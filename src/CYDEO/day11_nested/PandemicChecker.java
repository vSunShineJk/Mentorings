package CYDEO.day11_nested;

import java.util.Scanner;

public class PandemicChecker {
    public static void main(String[] args) {
        //TODO: complete the ranges
        Scanner input = new Scanner(System.in);
        System.out.println("What year would you check?");
        int year = input.nextInt();

        if (year >= 1346 && year <= 1353){
            System.out.println("The Black Death");
        } else if (year == 1665 || year == 1666) {
            System.out.println("Great Plague of London");
        } else if (year >= 1770 && year <= 1772) {
            System.out.println("Russian plague");
        } else {
            System.out.println("No Pandemic");
        }

    }
}
