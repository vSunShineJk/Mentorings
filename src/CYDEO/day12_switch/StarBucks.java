package CYDEO.day12_switch;

public class StarBucks {
    /*
        drink:
            price
            calories
        tall:
            2.50
            100

         grande:
            4.00
            150

         venti
            4.50
            200
     */

    public static void main(String[] args) {

        String size = "venti"; // input.nextLine();
        double price = 0;
        int calories = 0;

        switch (size){

            case "tall":
                price = 2.50;
                calories = 100;
                break;
            case "grade":
                price = 4.00;
                calories = 150;
                break;
            case "venti":
                price = 4.50;
                calories = 200;
                break;

        }
        System.out.println("Size: " + size + " is " + calories + " calories and cost $" + price );


    }

}
