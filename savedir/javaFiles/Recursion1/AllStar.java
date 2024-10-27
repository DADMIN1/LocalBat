package Recursion1;
import Recursion1.Testcases._AllStar;

// https://codingbat.com/prob/p183394
// Difficulty: 354.0

public final class AllStar
{
    /* Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*". */

    /*___________________________________________
    |                 Testcases                  |
    |____________________________________________|
    | allStar("hello")     → "h*e*l*l*o"         |
    | allStar("abc")       → "a*b*c"             |
    | allStar("ab")        → "a*b"               |
    | allStar("a")         → "a"                 |
    | allStar("")          → ""                  |
    | allStar("3.14")      → "3*.*1*4"           |
    | allStar("Chocolate") → "C*h*o*c*o*l*a*t*e" |
    | allStar("1234")      → "1*2*3*4"           |
    |___________________________________________*/

    public static final String allStar(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _AllStar.Validate(true);  // pass 'false' to print failed tests only.
    }
}
