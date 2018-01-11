package Chapter5;

import java.util.Scanner;

/**
 * Allows user to vote yes or no multiple times until they quit voting at which
 * point the program outputs the final vote tally.
 *
 * @author Brian Charter
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        int yes = 0, no = 0, invalid = 0;
        boolean quit = true;
        String input;

        while (quit) {
            System.out.print("Enter 'Y' to vote yes, 'N' to vote no, or 'Q' to quit voting: ");
            Scanner scanner = new Scanner(System.in);

            input = scanner.next();

            if (input.equals("Y") || input.equals("y")) {
                ++yes;
            } else if (input.equals("N") || input.equals("n")) {
                ++no;
            } else if (input.equals("Q") || input.equals("q")) {
                quit = false;
            } else {
                System.out.print("INVALID CODE: ");
                ++invalid;
            }
        }
        System.out.println("Yes votes: " + yes);
        System.out.println("No votes: " + no);
        System.out.println("Invalid votes: " + invalid);
        System.out.println("Yes votes: " + (yes + no + invalid));
    }
}
