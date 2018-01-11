package Chapter3;

import java.util.Scanner;

/**
 * Program which allows the user to guess heads or tails and then preform a coin
 * flip
 *
 * @author Brian Charter
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Guess 0 or 1 for heads or tails: ");
        System.out.println(((int) (Math.random() * 2) == input.nextInt()) ? "Correct!" : "Incorrect");
    }
}
