package Chapter4;

import java.util.Scanner;

/**
 * Program which takes bids and states which bidder is the winner
 *
 * @author Brian Charter
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name1, name2;
        double hours1, hours2, rate1, rate2, cost1, cost2;

        System.out.println("First Bidder:");
        System.out.print("Enter your name: ");
        name1 = input.next();
        System.out.print("Enter the number of hours:");
        hours1 = input.nextDouble();
        System.out.print("Enter the charge per hour:");
        rate1 = input.nextDouble();
        System.out.println("\nSecond Bidder:");
        System.out.print("Enter your name: ");
        name2 = input.next();
        System.out.print("Enter the number of hours:");
        hours2 = input.nextDouble();
        System.out.print("Enter the charge per hour:");
        rate2 = input.nextDouble();

        cost1 = hours1 * rate1;
        cost2 = hours2 * rate2;

        if (cost1 < cost2) {
            System.out.printf("The Winner is %s \n The cost is $%.2f", name1, cost1);
        } else if (cost2 < cost1) {
            System.out.printf("The Winner is %s \n The cost is $%.2f", name2, cost2);
        } else if (cost1 == cost2 && hours1 < hours2) {
            System.out.printf("The Winner is %s \n The cost is $%.2f\nTotal hours is %d", name1, cost1, (int) hours1);
        } else if (cost1 == cost2 && hours1 > hours2) {
            System.out.printf("The Winner is %s \n The cost is $%.2f\nTotal hours is %d", name2, cost2, (int) hours2);
        } else if (cost1 == cost2 && hours1 == hours2) {
            System.out.printf("Both %s and %s have identical bids.\n", name1, name2);
            System.out.printf("Number of hours:\n First Bidder=%d Second Bidder=%d\n", (int) hours1, (int) hours2);
            System.out.printf("Cost per hour:\n First Bidder=$%.2f Second Bidder=$%.2f\n", rate1, rate2);
            System.out.printf("Total Cost:\n First Bidder=$%.2f Second Bidder=$%.2f", cost1, cost2);
        }
    }
}
