package Chapter6;

import java.util.Scanner;

/**
 * Allows user to vote yes or no multiple times until they quit voting at which
 * point the program outputs the final vote tally.
 *
 * @author Brian Charter
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        String password;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password: ");
        password = input.next();

        System.out.println(validPassword(password));
    }

    /**
     * ValidPassword
     *
     * @param password User inputted password
     * @return the programs output stating whether the password is valid or
     * invalid
     */
    public static String validPassword(String password) {
        int x = 0;
        if (!(password.length() >= 8)) {
            return "A password must have at least eight characters\nInvalid Password";
        }

        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetterOrDigit(password.charAt(i))) {
                if (Character.isDigit(password.charAt(i))) {
                    ++x;
                }
            } else {
                return "A password must consist of only letters and digits\nInvalid Password";
            }
        }

        if (!(x >= 2)) {
            return "A password must contain at least two digits\nInvalid Password";
        }

        return "Valid Password";
    }
}
