package Chapter7;
import java.util.Scanner;

/**
 * Compares two lists and outputs whether or not they are identical
 *
 * @author Brian Charter
 */
public class C7_26 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()];
        for(int i = 0; i < list1.length; i++ )
        {
            list1[i] = input.nextInt();
        }
        
        System.out.print("Enter list2: ");
        int[] list2 = new int[input.nextInt()];
        for(int i = 0; i < list2.length; i++ )
        {
            list2[i] = input.nextInt();
        }
        
        if(list1.length != list2.length)
        {
            System.out.println("Two lists are not strictly identical");   
        }
        else
        {
            boolean equal = true;
            for(int i = 0; i < list1.length; i++ )
            {
                if(list1[i] != list2[i])
                    equal = false;
            }
            if(equal)
                System.out.println("Two lists are strictly identical");
            else
                System.out.println("Two lists are not strictly identical");   
        }
        
    }
    
}
