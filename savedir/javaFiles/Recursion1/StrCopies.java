package Recursion1;
import Recursion1.Testcases._StrCopies;

// https://codingbat.com/prob/p118182
// Difficulty: 387.0

public class StrCopies
{
    /* Given a string and a non-empty substring sub, 
    compute recursively if at least n copies of sub appear in the string somewhere, 
    possibly with overlapping. N will be non-negative. */

    /*____________________________________________
    |                  Testcases                  |
    |_____________________________________________|
    | strCopies("catcowcat", "cat", 2)    → true  |
    | strCopies("catcowcat", "cow", 2)    → false |
    | strCopies("catcowcat", "cow", 1)    → true  |
    | strCopies("iiijjj", "i", 3)         → true  |
    | strCopies("iiijjj", "i", 4)         → false |
    | strCopies("iiijjj", "ii", 2)        → true  |
    | strCopies("iiijjj", "ii", 3)        → false |
    | strCopies("iiijjj", "x", 3)         → false |
    | strCopies("iiijjj", "x", 0)         → true  |
    | strCopies("iiiiij", "iii", 3)       → true  |
    | strCopies("iiiiij", "iii", 4)       → false |
    | strCopies("ijiiiiij", "iiii", 2)    → true  |
    | strCopies("ijiiiiij", "iiii", 3)    → false |
    | strCopies("dogcatdogcat", "dog", 2) → true  |
    |____________________________________________*/

    public static boolean strCopies(String str, String sub, int n)
    {
        return false;
    }

    public static void main(String[] args) {
        _StrCopies.Validate(true);  // pass 'false' to print failed tests only.
    }
}
