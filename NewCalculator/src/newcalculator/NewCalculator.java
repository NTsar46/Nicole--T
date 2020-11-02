package newcalculator;

import java.util.Scanner;

public class NewCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide first number");
        int x = sc.nextInt();

        System.out.println("Please provide second number");
        int y = sc.nextInt();

        System.out.println("What operation should I perform?");
        String op = sc.next();

        if (op.equals("+")) {
            System.out.println("Your result is: " + (x + y));
        }
        if (op.equals("-")) {
            System.out.println("Your result is: " + (x - y));
        }
        if (op.equals("*")) {
            System.out.println("Your result is: " + (x * y));
        }
        if (op.equals("/")) {
            System.out.println("Your result is: " + (x / y));
        }
    }

}
