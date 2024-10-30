package Recursion1;
import Recursion1.Testcases._StrCopies;

// https://codingbat.com/prob/p118182
// Difficulty: 387.0

public final class StrCopies
{
    /* Given a string and a non-empty substring sub, 
    compute recursively if at least n copies of sub appear in the string somewhere, 
    possibly with overlapping. N will be non-negative. */

    /*______________________________________________
    |                   Testcases                   |
    |_______________________________________________|
    | str (String)   | sub      | n     | expected  |
    |                | (String) | (int) | (boolean) |
    |________________|__________|_______|___________|
    | "catcowcat"    | "cat"    | 2     | true      |
    | "catcowcat"    | "cow"    | 2     | false     |
    | "catcowcat"    | "cow"    | 1     | true      |
    | "iiijjj"       | "i"      | 3     | true      |
    | "iiijjj"       | "i"      | 4     | false     |
    | "iiijjj"       | "ii"     | 2     | true      |
    | "iiijjj"       | "ii"     | 3     | false     |
    | "iiijjj"       | "x"      | 3     | false     |
    | "iiijjj"       | "x"      | 0     | true      |
    | "iiiiij"       | "iii"    | 3     | true      |
    | "iiiiij"       | "iii"    | 4     | false     |
    | "ijiiiiij"     | "iiii"   | 2     | true      |
    | "ijiiiiij"     | "iiii"   | 3     | false     |
    | "dogcatdogcat" | "dog"    | 2     | true      |
    |________________|__________|_______|__________*/

    public static final boolean strCopies(String str, String sub, int n)
    {
        return false;
    }

    public static final void main(String[] args) {
        _StrCopies.Validate(true);  // pass 'false' to print failed tests only.
    }
}
