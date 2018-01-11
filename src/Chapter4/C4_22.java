package Chapter4;

import java.util.Scanner;

/**
 * Program which states if 1 string is the substring of another.
 *
 * @author Brian Charter
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s1, s2;
        System.out.print("Enter string s1: ");
        s1 = input.next();
        System.out.print("Enter string s2: ");
        s2 = input.next();

        if (s1.contains(s2)) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring of " + s1);
        }
    }
}
