package Chapter2;

import java.util.Scanner;

/**
 * Program to convert Celsius to Fahrenheit
 *
 * @author Brian Charter
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.print("Enter a degree in Celsius: ");
        Scanner input = new Scanner(System.in);
        double celsius = input.nextDouble();
        System.out.println(celsius + " Celsius is " + (((9.0 / 5) * celsius) + 32) + "Fahrenheit");
    }
}
