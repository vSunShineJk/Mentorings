package CYDEO.day10_if_statement;

public class SalessBonus {
    /*
    create a sales amount variable
 use the sales amount to dermine thr bonus you get at end of the month

    if your sales amount is less than 10000 you don`t get any bonus

    if your sales amount is more than oe equal to 10000 and less than 15000 you get a bonus of 5000

    if your sales amount is more than or equal to 15000 you get a bonus 7000

    print your bonus

    */

    public static void main(String[] args) {
        int sales = 70000;
        int bonus = 0;

        if (sales >= 10000 && sales < 15000){
            bonus = 5000;
        }

        if (sales >= 15000){
            bonus = 7000;
        }

        System.out.println("Sales: " + sales);
        System.out.println("Bonus: " + bonus);

    }
}



