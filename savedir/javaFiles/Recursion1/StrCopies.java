// https://codingbat.com/prob/p118182
package Recursion1;
import Recursion1.Testcases._StrCopies;

public class StrCopies
{
    /* Given a string and a non-empty substring sub, 
    compute recursively if at least n copies of sub appear in the string somewhere, 
    possibly with overlapping. N will be non-negative. */

    /*_________________________________________
    |                Testcases                 |
    |__________________________________________|
    | strCopies("catcowcat", "cat", 2) → true  |
    | strCopies("catcowcat", "cow", 2) → false |
    | strCopies("catcowcat", "cow", 1) → true  |
    |_________________________________________*/

    public static boolean strCopies(String str, String sub, int n)
    {
        
    }

    public static void main(String[] args) {
        _StrCopies.Validate(true);  // pass 'false' to print failed tests only.
    }
}
