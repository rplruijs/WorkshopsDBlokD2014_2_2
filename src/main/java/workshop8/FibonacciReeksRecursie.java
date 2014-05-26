

package workshop8;

/**
 *
 * @author remcoruijsenaars
 */
public class FibonacciReeksRecursie {
    //f1 = 1
    //f2 = 1
    //fn = f(n-1) + f(n-2)
    
    
    public static void main(String[] args){
        System.out.println(fibNonRec(8));
        //System.out.println(fibRec(45));
    }


    //TO DO Implement
    private static int fibRec(int getal){
        return 0;
    }
    
    public static long fibNonRec(int n)
    {  
         if (n <= 2) { return 1; } 
         else
         {
            long olderValue = 1;
            long oldValue = 1;
            long newValue = 0;
            for (int i = 3; i <= n; i++)
            {  
               newValue = oldValue + olderValue;
               olderValue = oldValue;
               oldValue = newValue;
            }
            return newValue;
         }
    }

    
}
