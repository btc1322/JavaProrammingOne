package Chapter8;

import java.util.Scanner;

/**
 * Accepts sales for 4 different salesman and outputs the total amount of sales
 * per day
 *
 * @author Brian Charter
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] salesmen = {"A", "B", "C", "D"};
        double[][] salesArray = new double[4][5];
        boolean done = true;

        char ID = ' ';

        while (done) {
            int index = 0, index2 = 0;
            System.out.print("Enter the salesman ID as A, B, C, or D: ");
            switch (input.next()) {
                case "A":
                    index = 0;
                    break;
                case "B":
                    index = 1;
                    break;
                case "C":
                    index = 2;
                    break;
                case "D":
                    index = 3;
                    break;
            }
            System.out.print("Enter the day as M, T, W, H, or F: ");
            switch (input.next()) {
                case "M":
                    index2 = 0;
                    break;
                case "T":
                    index2 = 1;
                    break;
                case "W":
                    index2 = 2;
                    break;
                case "H":
                    index2 = 3;
                    break;
                case "F":
                    index2 = 4;
                    break;
            }

            System.out.print("Enter the amount of the sale: ");
            salesArray[index][index2] += input.nextDouble();

            System.out.print("More data? Enter Y for more or N to stop. ");

            switch (input.next()) {
                case "Y":
                    done = true;
                    break;
                case "N":
                    done = false;
                    break;

            }
        }

        System.out.println("Salesman   M     T     W    H     AF");

        for (int x = 0; x < salesArray.length; x++) {
            System.out.print("       " + salesmen[x]);
            for (int y = 0; y < salesArray[x].length; y++) {
                System.out.print("   " + salesArray[x][y]);
            }
            System.out.println();
        }

    }

}
