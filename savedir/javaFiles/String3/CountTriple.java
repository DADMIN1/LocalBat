package String3;
import String3.Testcases._CountTriple;

// https://codingbat.com/prob/p195714
// Difficulty: 315.0

public final class CountTriple
{
    /* We'll say that a "triple" in a string is a char appearing three times in a row. 
    Return the number of triples in the given string. The triples may overlap. */

    /*___________________________
    |         Testcases          |
    |____________________________|
    |   str (String)   | returns |
    |                  |  (int)  |
    |__________________|_________|
    |   "abcXXXabc"    |    1    |
    |  "xxxabyyyycd"   |    3    |
    |       "a"        |    0    |
    |        ""        |    0    |
    |     "XXXabc"     |    1    |
    |    "XXXXabc"     |    2    |
    |    "XXXXXabc"    |    3    |
    | "222abyyycdXXX"  |    3    |
    | "abYYYabXXXXXab" |    4    |
    | "abYYXabXXYXXab" |    0    |
    | "abYYXabXXYXXab" |    0    |
    |   "122abhhh2"    |    1    |
    |__________________|________*/

    public static final int countTriple(String str)
    {
        return 0;
    }

    public static final void main(String[] args) {
        //_CountTriple.printSuccesses = false;  // set 'false' to print failing tests only.
        //_CountTriple.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _CountTriple.Validate();
    }
}
