// https://codingbat.com/prob/p140272
package Logic1;
import Logic1.Testcases._InOrderEqual;

public class InOrderEqual
{
    /* Given three ints, a b c, return true if they are in strict increasing order, 
    such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, 
    with the exception that if "equalOk" is true, equality is allowed, 
    such as 5 5 7 or 5 5 5. */

    /*_______________________________________
    |               Testcases               |
    _________________________________________
    | inOrderEqual(2, 5, 11, false) → true  |
    | inOrderEqual(5, 7, 6, false)  → false |
    | inOrderEqual(5, 5, 7, true)   → true  |
    _______________________________________*/

    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk)
    {
        
    }

    public static void main(String[] args) {
        _InOrderEqual.Validate(true);  // pass 'false' to print failed tests only.
    }
}
