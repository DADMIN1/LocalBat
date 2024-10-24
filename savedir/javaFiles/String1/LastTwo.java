package String1;
import String1.Testcases._LastTwo;

// https://codingbat.com/prob/p194786
// Difficulty: 172.0

public class LastTwo
{
    /* Given a string of any length, return a new string where the last 2 chars, 
    if present, are swapped, so "coding" yields "codign". */

    /*_____________________________
    |          Testcases           |
    |______________________________|
    | lastTwo("coding") → "codign" |
    | lastTwo("cat")    → "cta"    |
    | lastTwo("ab")     → "ba"     |
    | lastTwo("a")      → "a"      |
    | lastTwo("")       → ""       |
    |_____________________________*/

    public static String lastTwo(String str)
    {
        return "";
    }

    public static void main(String[] args) {
        _LastTwo.Validate(true);  // pass 'false' to print failed tests only.
    }
}
