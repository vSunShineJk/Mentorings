package CYDEO.day10_if_statement;

public class CampusTime {
    public static void main(String[] args) {

        int time = 33;

        if (time >= 6 && time <= 11){
            System.out.println("Good morning");
        } else if (time >= 12 && time <= 16) {
            System.out.println("Good evening");
        } else if ((time >= 17 && time <= 23) || (time >= 0 && time <= 5)) {
            System.out.println("Good night");
        } else {
            System.out.println("Not in 24h range");
        }
    }
}
