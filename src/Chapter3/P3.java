package Chapter3;

import java.util.Scanner;

/**
 * Program which asks for a students points earned and total points of an
 * assignment and states whether it creates a valid fraction and outputs the
 * corresponding letter grade
 *
 * @author Brian Charter
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double x, y;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        x = input.nextDouble();
        System.out.print("Enter a second number: ");
        y = input.nextDouble();

        if (x < y) {
            System.out.println("The first number is less than the second");
        }

        if (x > y) {
            System.out.println("The first number is greater than the second");
        }

        if (x == y) {
            System.out.println("The first number is equal to the second");
        }

        if (x <= y) {
            System.out.println("The first number is less than or equal to the second");
        }

        if (x != y) {
            System.out.println("The first number is not equal to the second");
        }

        if (y == 0) {
            System.out.println("Cannot divide by zero");
        } else if (x / y < 1) {
            System.out.println("proper fraction");
        } else {
            System.out.println("improper fraction");
        }

        if (x >= 90) {
            System.out.println("A");
        } else if (x >= 80) {
            System.out.println("B");
        } else if (x >= 70) {
            System.out.println("C");
        } else if (x >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        if (y >= 1 && y <= 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }
}
