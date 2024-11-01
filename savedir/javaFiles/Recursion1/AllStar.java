package Recursion1;
import Recursion1.Testcases._AllStar;

// https://codingbat.com/prob/p183394
// Difficulty: 354.0

public final class AllStar
{
    /* Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*". */

    /*__________________________________
    |             Testcases             |
    |___________________________________|
    |     str     |   returns (String)  |
    |   (String)  |                     |
    |_____________|_____________________|
    |   "hello"   |     "h*e*l*l*o"     |
    |    "abc"    |       "a*b*c"       |
    |     "ab"    |        "a*b"        |
    |     "a"     |         "a"         |
    |      ""     |          ""         |
    |    "3.14"   |      "3*.*1*4"      |
    | "Chocolate" | "C*h*o*c*o*l*a*t*e" |
    |    "1234"   |      "1*2*3*4"      |
    |_____________|____________________*/

    public static final String allStar(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _AllStar.Validate(true);  // pass 'false' to print failed tests only.
    }
}
