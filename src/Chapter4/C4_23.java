package Chapter4;

import java.util.Scanner;

/**
 * Program which calculates grossPay, federalWitholding, stateWitholding and
 * netPay of an individual
 *
 * @author Brian Charter
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        double hours, hourlyRate, grossPay, stateWitholdingRate, federalWitholdingRate, federalWitholding, stateWitholding, netPay;
        System.out.print("Enter employee's name: ");
        name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        hourlyRate = input.nextDouble();
        System.out.print("Enter federal tax witholding rate: ");
        federalWitholdingRate = input.nextDouble();
        System.out.print("Enter state tax witholding rate: ");
        stateWitholdingRate = input.nextDouble();

        grossPay = hours * hourlyRate;
        federalWitholding = grossPay * federalWitholdingRate;
        stateWitholding = grossPay * stateWitholdingRate;
        netPay = grossPay - federalWitholding - stateWitholding;

        System.out.printf("\nEmployee Name: %s", name);
        System.out.printf("\nHours Worked: %.2f", hours);
        System.out.printf("\nPayRate: $%.2f", hourlyRate);
        System.out.printf("\nGross Pay: $%.2f", grossPay);
        System.out.printf("\nDeductions:\n Federal Witholding (%.2f%%): $%.2f\n State Witholding(%.2f%%): $ % .2f\n Total Deduction:$ % .2f", (federalWitholdingRate * 100), federalWitholding, (stateWitholdingRate * 100), stateWitholding, (stateWitholding + federalWitholding));
        System.out.printf("\nNet Pay: $%.2f", netPay);
    }
}
