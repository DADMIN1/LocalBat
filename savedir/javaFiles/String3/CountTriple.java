package String3;
import String3.Testcases._CountTriple;

// https://codingbat.com/prob/p195714
// Difficulty: 315.0

public class CountTriple
{
    /* We'll say that a "triple" in a string is a char appearing three times in a row. 
    Return the number of triples in the given string. The triples may overlap. */

    /*__________________________________
    |             Testcases             |
    |___________________________________|
    | countTriple("abcXXXabc")      → 1 |
    | countTriple("xxxabyyyycd")    → 3 |
    | countTriple("a")              → 0 |
    | countTriple("")               → 0 |
    | countTriple("XXXabc")         → 1 |
    | countTriple("XXXXabc")        → 2 |
    | countTriple("XXXXXabc")       → 3 |
    | countTriple("222abyyycdXXX")  → 3 |
    | countTriple("abYYYabXXXXXab") → 4 |
    | countTriple("abYYXabXXYXXab") → 0 |
    | countTriple("abYYXabXXYXXab") → 0 |
    | countTriple("122abhhh2")      → 1 |
    |__________________________________*/

    public static int countTriple(String str)
    {
        return 0;
    }

    public static void main(String[] args) {
        _CountTriple.Validate(true);  // pass 'false' to print failed tests only.
    }
}
