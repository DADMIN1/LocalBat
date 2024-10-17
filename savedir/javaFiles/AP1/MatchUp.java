// https://codingbat.com/prob/p139677
package AP1;
import AP1.Testcases._MatchUp;

public class MatchUp
{
    /* Given 2 arrays that are the same length containing strings, 
    compare the 1st string in one array to the 1st string in the other array, 
    the 2nd to the 2nd and so on. Count the number of times that the 2 strings are non-empty and start with the same char. 
    The strings may be any length, including 0. */

    /*______________________________________________________
    |                      Testcases                       |
    |______________________________________________________|
    | matchUp(["aa", "bb", "cc"], ["aaa", "xx", "bb"]) → 1 |
    | matchUp(["aa", "bb", "cc"], ["aaa", "b", "bb"])  → 2 |
    | matchUp(["aa", "bb", "cc"], ["", "", "ccc"])     → 1 |
    |_____________________________________________________*/

    public static int matchUp(String[] a, String[] b)
    {
        
    }

    public static void main(String[] args) {
        _MatchUp.Validate(true);  // pass 'false' to print failed tests only.
    }
}
