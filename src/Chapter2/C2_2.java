package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate the area and volume of a cylinder
 *
 * @author Brian Charter
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.print("Enter the radius and length of a cylinder: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius * radius * 3.1415;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + (area * length));
    }
}
