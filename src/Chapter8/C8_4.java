package Chapter8;

/**
 * Outputs a chart showing number of hours worked by each employee each day and the weekly amount of hours worked
 *
 * @author Brian Charter
 */
public class C8_4 {
       
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
    {
        int[][] hours = {{2,4,3,4,5,8,8},
                         {7,3,4,3,3,4,4},
                         {3,3,4,3,3,2,2},
                         {9,3,4,7,3,4,1},
                         {3,5,4,3,6,3,8},
                         {3,4,4,6,3,4,4},
                         {3,7,4,8,3,8,4},
                         {6,3,5,9,2,7,9}};
        
        System.out.println("            Su   M   T   W  Th   F  Sa   Total");
        
        for(int x = 0; x < hours.length; x++)
        {
            System.out.print("Employee " + x);
            int total = 0;
            for(int y = 0; y < hours[x].length; y++)
            {
                System.out.print("   " + hours[x][y]);
                total += hours[x][y];
            }
            System.out.println("   " + total);
        }
        
        
        
    }
    
}
