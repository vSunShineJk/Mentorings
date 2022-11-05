package CYDEO.day10_if_statement;

public class LetterType {
    public static void main(String[] args) {
        char c = '0';

        boolean isLetter = (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z');
        boolean isNumber = c >= '0' && c <= '9';

        if(isLetter){
            System.out.println(c + " is a letter");
        }

        if (isNumber){
            System.out.println(c + " is a number");
        }

        if (!isLetter && !isNumber){
            System.out.println(c + " is a special character");
        }

    }
}
