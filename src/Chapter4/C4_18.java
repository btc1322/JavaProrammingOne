package Chapter4;

import java.util.Scanner;

/**
 * Program which asks for a Major and grade code then outputs the corresponding
 * major and students grade
 *
 * @author Brian Charter
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String majorCode;

        System.out.print("Enter two characters: ");
        majorCode = input.next();

        if ((majorCode.charAt(0) == 'M' || majorCode.charAt(0) == 'C' || majorCode.charAt(0) == 'I')
                && (majorCode.charAt(1) == '1' || majorCode.charAt(1) == '2' || majorCode.charAt(1) == '3'
                || majorCode.charAt(1) == '4')) {
            switch (majorCode.charAt(1)) {
                case ('1'):
                    switch (majorCode.charAt(0)) {
                        case ('M'):
                            System.out.print("Mathematics ");
                            break;
                        case ('C'):
                            System.out.print("Computer Science ");

                            break;
                        case ('I'):
                            System.out.print("Information Technology ");
                            break;
                    }
                    System.out.println("Freshman");
                    break;
                case ('2'):
                    switch (majorCode.charAt(0)) {
                        case ('M'):
                            System.out.print("Mathematics ");
                            break;
                        case ('C'):
                            System.out.print("Computer Science ");
                            break;
                        case ('I'):
                            System.out.print("Information Technology ");
                            break;
                    }
                    System.out.println("Sophmore");
                    break;
                case ('3'):
                    switch (majorCode.charAt(0)) {
                        case ('M'):
                            System.out.print("Mathematics ");
                            break;
                        case ('C'):
                            System.out.print("Computer Science ");
                            break;
                        case ('I'):
                            System.out.print("Information Technology ");
                            break;
                    }
                    System.out.println("Junior");
                    break;
                case ('4'):
                    switch (majorCode.charAt(0)) {
                        case ('M'):
                            System.out.print("Mathematics ");
                            break;
                        case ('C'):
                            System.out.print("Computer Science ");
                            break;
                        case ('I'):
                            System.out.print("Information Technology ");
                            break;
                    }
                    System.out.println("Senior");
                    break;
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
