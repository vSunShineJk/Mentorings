package CYDEO.day10_if_statement;

public class IfWithNoBrackets {
    public static void main(String[] args) {

        if (3<9){
            System.out.println("First");
            System.out.println("Second");
        }

        if (3>9) System.out.println("Third"); // this is the line executed when the if statement


            System.out.println("Fourth"); //this is not a part of the if statement


            System.out.println("------------------");

            if (5 % 2 == 0)
                System.out.println("even");
            else
                System.out.println("odd");

            System.out.println("------------------");
            char a = 'a';

            if (a == 'a')
                System.out.println("letter a");
            else if (a == 'c')
                System.out.println("letter = c");
            else
                System.out.println("other");


        }
    }

