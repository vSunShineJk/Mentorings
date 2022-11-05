package CYDEO.day12_switch;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        number from 1 to 5
//        convert the number to number word
//        1 -> one
//        2 -> two
//        ...
//        5 -> five
//
//         default case

        System.out.println("Enter a number between 1 to 5");
        int number = scan.nextInt();

        switch (number) {
            case 5:
                System.out.println("five");
                break;
            case 4:
                System.out.println("four");
                break;
            case 3:
                System.out.println("three");
                break;
            case 2:
                System.out.println("two");
                break;
            case 1:
                System.out.println("one");
                break;
            default:
                System.out.println("Number should be between 1 and 5");
        }

    }
}
