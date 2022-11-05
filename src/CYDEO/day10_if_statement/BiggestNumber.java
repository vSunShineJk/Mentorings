package CYDEO.day10_if_statement;

public class BiggestNumber {
    public static void main(String[] args) {
         int first = 13;
         int second = 33;
         int third = 50;
         int biggest;

         // you don`t need both options
         if (first > second && first > third){
//             System.out.println(first + " is the biggest");
             biggest = first;
         } else if (second > first && second > third) {
//             System.out.println(second + " is the biggest");
             biggest = second;
         } else {
//             System.out.println(third + " is biggest");
             biggest = third;
         }

        System.out.println(biggest + " is the biggest");

    }
}
