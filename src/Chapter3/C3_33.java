package Chapter3;

import java.util.Scanner;

/**
 * Program to tell user the best deal from inputted weight and price of 2
 * different rice packages.
 *
 * @author Brian Charter
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight and price for package 1: ");
        int weight = input.nextInt();
        double price = input.nextDouble();

        System.out.print("Enter weight and price for package 2: ");
        int weight2 = input.nextInt();
        double price2 = input.nextDouble();

        if (price / weight < price2 / weight2) {
            System.out.println("Package 1 has a better price.");
        } else if (price / weight > price2 / weight2) {
            System.out.println("Package 2 has a better price.");
        } else {
            System.out.println("Package 1 and 2 have the same price.");
        }
    }
}
