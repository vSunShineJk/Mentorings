package CYDEO.day10_if_statement;

import java.util.Scanner;

public class CampusTime2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a yime from 0-23 in 24h format, wheri 0 is midnight");
        int time = input.nextInt();
        String massage = ""; // declaring and assigning a String with value empty space "". Default starting value


        if (time >= 6 && time <= 11){
            massage = "Good morning";
        } else if (time >= 12 && time <= 16) {
            massage = "Good morning";
        } else if ((time >= 17 && time <= 23) || (time >= 0 && time <= 5)) {
            massage = "Good morning";
        } else {
            massage = "Good morning";
        }

        System.out.println(massage);
    }
}
