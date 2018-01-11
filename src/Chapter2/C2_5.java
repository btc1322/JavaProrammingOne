package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate gratuity at a user specified rate and subtotal
 *
 * @author Brian Charter
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.print("Enter the subtotal and a gratuity rate: ");
        Scanner input = new Scanner(System.in);
        float subtotal = input.nextFloat();
        float gratuity = subtotal * (input.nextFloat() / 100);
        System.out.println("The gratuity is $" + gratuity + " and total is $" + (gratuity + subtotal));
    }
}
