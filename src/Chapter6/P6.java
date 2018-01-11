package Chapter6;

import java.util.Scanner;

/**
 * Allows user to vote yes or no multiple times until they quit voting at which
 * point the program outputs the final vote tally.
 *
 * @author Brian Charter
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double dollarToEuro, dollarToPound, dollarToYen, dollars;
        boolean convert = true;
        String conversion, continueConvert;

        System.out.print("How many Euros does a dollar buy? ");
        dollarToEuro = input.nextDouble();
        System.out.print("How many Pound Sterling does a dollar buy? ");
        dollarToPound = input.nextDouble();
        System.out.print("How many Yen does a dollar buy? ");
        dollarToYen = input.nextDouble();

        while (convert) {
            System.out.print("Please enter the number of dollars you want to convert: $");
            dollars = input.nextDouble();
            System.out.print("Enter \"E\" to buy Euros, \"P\" to buy Pounds or \"Y\" to buy Yen: ");

            conversion = input.next().toLowerCase();
            switch (conversion) {
                case "e":
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Euros.\n", dollars, convertCurrency(dollars, dollarToEuro));
                    break;
                case "p":
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Pounds.\n", dollars, convertCurrency(dollars, dollarToPound));
                    break;
                case "y":
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Yen.\n", dollars, convertCurrency(dollars, dollarToYen));
                    break;
            }

            boolean exit = true;
            while (exit) {
                System.out.print("Are there more conversions to perform? ");
                continueConvert = input.next().toLowerCase();

                if (continueConvert.equals("yes")) {
                    exit = false;
                } else if (continueConvert.equals("no")) {
                    convert = false;
                    exit = false;
                }
            }

        }
    }

    /**
     * convertCurrency
     *
     * @param total The amount of original currency to convert into new currency
     * @param conversionRate The conversion rate between the original and final
     * currency
     * @return the equivalent currency
     */
    public static double convertCurrency(double total, double conversionRate) {
        double converted;

        converted = total * conversionRate;
        if (total <= 100) {
            converted = converted * .9;
        } else {
            converted = converted * .95;
        }

        return converted;
    }

}
