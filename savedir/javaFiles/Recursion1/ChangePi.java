package Recursion1;
import Recursion1.Testcases._ChangePi;

// https://codingbat.com/prob/p170924
// Difficulty: 339.0

public final class ChangePi
{
    /* Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14". */

    /*______________________
    |       Testcases       |
    |_______________________|
    |   str    |  returns   |
    | (String) |  (String)  |
    |__________|____________|
    |  "xpix"  |  "x3.14x"  |
    |  "pipi"  | "3.143.14" |
    |  "pip"   |  "3.14p"   |
    |   "pi"   |   "3.14"   |
    |  "hip"   |   "hip"    |
    |   "p"    |    "p"     |
    |   "x"    |    "x"     |
    |    ""    |     ""     |
    |  "pixx"  |  "3.14xx"  |
    | "xyzzy"  |  "xyzzy"   |
    |__________|___________*/

    public static final String changePi(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _ChangePi.Validate(true);  // pass 'false' to print failed tests only.
    }
}
