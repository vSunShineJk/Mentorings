package CYDEO.day12_switch;

public class SwitchExample {
    public static void main(String[] args) {

        int day = 1; // number from 1 to 7, where 1 is monday and 7 is sunday

        switch (day){
            default: // acts like else, if no other case atches the default case will run
                System.out.println("Mot a valid day number");
                break;

            case 1: // if(day == 1)
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

        }

    }
}
