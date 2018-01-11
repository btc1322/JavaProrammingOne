package Chapter3;

import java.util.Scanner;

/**
 * Program which allows the user to input an integer and then output whether it
 * is divisible by 5 or 6
 *
 * @author Brian Charter
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int integer = input.nextInt();
        if (integer % 5 == 0 ^ integer % 6 == 0) {
            System.out.println("Is " + integer + " divisible by 5 and 6? false\nIs " + integer + " divisible by 5 or 6? true\nIs " + integer + " divisible by 5 or 6, but not both? true");
        } else if (integer % 5 == 0 && integer % 6 == 0) {
            System.out.println("Is " + integer + " divisible by 5 and 6? true\nIs " + integer + " divisible by 5 or 6? true\nIs " + integer + " divisible by 5 or 6, but not both? false");
        } else {
            System.out.println("Is " + integer + " divisible by 5 and 6? false\nIs " + integer + " divisible by 5 or 6? false\nIs " + integer + " divisible by 5 or 6, but not both? false");
        }
    }
}
