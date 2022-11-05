package metoring.Shakhboz;

import java.util.Scanner;

public class SwitchCaseExample1 {
    public static void main(String[] args) {

        // Season Practice
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a season");
        int seasons = input.nextInt();

        if(seasons == 1){
            System.out.println("Spring");
        }
        switch (seasons){
            case 1:
            case 5:
                System.out.println("Spring");
                System.out.println("In spring has three months, March, April, May");
                break;
            case 2:
                System.out.println("Summer");
                System.out.println("In summer has three months, June, July, August");
                break;
            case 3:
                System.out.println("Autumn");
                System.out.println("In autumn has three months, September, October, November");
                break;
            case 4:
                System.out.println("Winter");
                System.out.println("In winter has three months, December, January, February");
                break;
            default:
                System.out.println("Season number is invalid");
        }


    }
}
