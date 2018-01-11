package Chapter5;

import java.util.Scanner;

/**
 * Program which allows user to enter a string which will output reversed
 *
 * @author Brian Charter
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String original;
        String reverse = "";

        System.out.print("Enter a string: ");
        original = input.nextLine();
        for (int x = original.length(); x > 0; x--) {
            reverse += original.charAt(x - 1);
        }

        System.out.println("The reversed string is " + reverse);
    }
}
