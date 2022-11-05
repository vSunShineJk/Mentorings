package CYDEO.day11_nested;

public class Diver {
    public static void main(String[] args) {
        int tank = 444;
        String message = "";

        if (tank > 90){
            message = "Your tank is full";
        } else if (tank > 80) {
            message = "Still OK";
        } else if (tank > 70) {
            message = "Don`t go too far";
        } else if (tank > 60) {
            message = "Start to head back";
        } else if (tank > 50) {
            message = "Be careful now you at 50%";
        }

        System.out.println(message);



    }
}
