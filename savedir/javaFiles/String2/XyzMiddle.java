// https://codingbat.com/prob/p159772
package String2;
import String2.Testcases._XyzMiddle;

public class XyzMiddle
{
    /* Given a string, does "xyz" appear in the middle of the string? To define middle, 
    we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. 
    This problem is harder than it looks. */

    /*_____________________________
    |          Testcases           |
    |______________________________|
    | xyzMiddle("AAxyzBB") → true  |
    | xyzMiddle("AxyzBB")  → true  |
    | xyzMiddle("AxyzBBB") → false |
    |_____________________________*/

    public static boolean xyzMiddle(String str)
    {
        
    }

    public static void main(String[] args) {
        _XyzMiddle.Validate(true);  // pass 'false' to print failed tests only.
    }
}
