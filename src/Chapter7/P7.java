package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Finds the average number in an user inputted array.
 *
 * @author Brian Charter
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will be read: ");

        int[] array = new int[input.nextInt()];

        fillArray(array);

        System.out.println("The average is: " + averageArray(array));

        printArray(array);
    }

    /**
     * Method that fills array
     *
     * @param array User inputted Integer array
     */
    public static void fillArray(int[] array) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 elements: ");
        for (int x = 0; x < array.length; x++) {
            array[x] = input.nextInt();
        }
    }

    /**
     * Method that averages an array
     *
     * @param array User inputted Integer array
     * @return returns average of the array
     */
    public static double averageArray(int[] array) {
        int total = 0;
        for (int x = 0; x < array.length; x++) {
            total += array[x];
        }

        return (double) total / array.length;
    }

    /**
     * Method that prints array
     *
     * @param array User inputted Integer array
     */
    public static void printArray(int[] array) {
        System.out.println("The contents of the array: \n" + Arrays.toString(array));
    }

}
