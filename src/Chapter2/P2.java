package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate subtotal, sales tax, tip and total price of a meal
 *
 * @author Brian Charter
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        float mealPrice, drinkPrice, dessertPrice, foodPrice, tax, tip, total;
        final float TAX_RATE = .1f;
        final float TIP_RATE = .15f;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of the meal: ");
        mealPrice = input.nextFloat();

        System.out.print("Enter the price of the drinks: ");
        drinkPrice = input.nextFloat();

        System.out.print("Enter the price of the dessert: ");
        dessertPrice = input.nextFloat();

        foodPrice = mealPrice + drinkPrice + dessertPrice;
        tax = foodPrice * TAX_RATE;
        tip = TIP_RATE * (foodPrice + tax);
        total = foodPrice + tax + tip;

        System.out.println("Food Price = $" + foodPrice);
        System.out.println("Sales Tax = $" + tax);
        System.out.println("Tip = $" + tip);
        System.out.println("Total = $" + total);
    }
}
