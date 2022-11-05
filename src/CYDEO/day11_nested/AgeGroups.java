package CYDEO.day11_nested;

public class AgeGroups {
    public static void main(String[] args) {

        /*
          age should be between 0 - 120

          <1 baby
          2 - 5 toddler
          6 - 13 young adult
          19 - 30 adult
          31 - 65 middle age adult
          > senior

        */

        int age = -8;

        if (age >= 0 && age <= 120){
            // valid ages

            if (age <= 1){
                System.out.println("Baby");
            } else if (age <= 5) {
                System.out.println("Toddler");
            } else if (age <= 13) {
                System.out.println("Kid");
            } else if (age <= 18) {
                System.out.println("Teenager");
            } else if (age <= 40) {
                System.out.println("Adult");
            } else if (age <= 65) {
                System.out.println("Senior");
            }

        } else {
            // invalid ages
            if (age < 0) {
                System.out.println("Age cannot be negative");
            } else {
                System.out.println("Ages cannot be moe than 120");
            }
        }

    }
}
