
package Chapter7;
import java.util.Scanner;

/**
 * Asks the user for a list of numbers and outputs the lowest number in the list
 *
 * @author Brian Charter
 */
public class C7_9 {
    
     /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);

        double[] array = new double[10];

        System.out.print("Enter ten numbers: ");

        for(int x = 0; x < array.length; x++){
            array[x] = input.nextDouble();
        }
        
        System.out.println("The minimum number is: " + min(array));
    }
    
     /**
     * Min method
     *
     * @param array double array that takes the user inputted list of numbers
     * @return the smallest double in the list
     */
    public static double min(double[] array){
        
        double smallest;
        smallest = array[0];
        for(int x = 0; x < array.length; x++){
            if (array[x] < smallest)
                smallest = array[x];
        }
        return smallest;
    }
    
}
