// https://codingbat.com/prob/p134250
package String2;
import String2.Testcases._XyBalance;

public class XyBalance
{
    /* We'll say that a String is xy-balanced if for all the 'x' chars in the string, 
    there exists a 'y' char somewhere later in the string. So "xxy" is balanced, 
    but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced. */

    // xyBalance("aaxbby") → true
    // xyBalance("aaxbb") → false
    // xyBalance("yaaxbb") → false

    public static boolean xyBalance(String str)
    {
        
    }

    public static void main(String[] args) {
        _XyBalance.Validate(true);  // pass 'false' to print failed tests only.
    }
}
