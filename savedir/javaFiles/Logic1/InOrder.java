// https://codingbat.com/prob/p154188
package Logic1;
import Logic1.Testcases._InOrder;

public class InOrder
{
    /* Given three ints, a b c, return true if b is greater than a, 
    and c is greater than b. However, with the exception that if "bOk" is true, 
    b does not need to be greater than a. */

    // inOrder(1, 2, 4, false) → true
    // inOrder(1, 2, 1, false) → false
    // inOrder(1, 1, 2, true) → true

    public static boolean inOrder(int a, int b, int c, boolean bOk)
    {
        
    }

    public static void main(String[] args) {
        _InOrder.Validate(true);  // pass 'false' to print failed tests only.
    }
}
