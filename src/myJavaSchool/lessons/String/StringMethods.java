package myJavaSchool.lessons.String;

public class StringMethods {
    public static void main(String[] args) {

        System.out.println("---------------- .concat() method ----------------");
        String firstName = "Umid ";
        String LastName = "Muminov";
        System.out.println(firstName.concat(LastName)); // .concat() method is the same as "+" operator which uses between Strings to combine them this is CONCATENATION

        System.out.println("---------------- double/single quote & backslash ----------------");
        System.out.println("\'hello mom\' said sister");
        System.out.println("\"hello mom\" said sister");
        System.out.println("\\hello mom\\ said sister");

        System.out.println("---------------- \\n, \\t, \\b, \\r ----------------");
        System.out.println("hello world!");
        System.out.println("hello\nworld!");
        System.out.println("hello\rworld!");
        System.out.println("hello\bworld");
        System.out.println("hello\tworld");

        System.out.println("---------------- if statement short version ----------------");
        boolean iBig = (70 > 80) ? true : false;
        System.out.println(iBig);
        String isLong = ("helloWorld!".length() < "hello world!".length()) ? "firs one is longer" : "second one is longer";
        System.out.println(isLong);

        System.out.println("---------------- break; & continue; in loops ----------------");
        for (int i = 1; i <= 4; i++ ){
            if (i == 2){
                continue;
            }
            System.out.println(i);
        }

        // continue in while loop
        int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

    }
}
