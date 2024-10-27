package Recursion1;
import Recursion1.Testcases._ChangePi;

// https://codingbat.com/prob/p170924
// Difficulty: 339.0

public final class ChangePi
{
    /* Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14". */

    /*_______________________________
    |           Testcases            |
    |________________________________|
    | changePi("xpix")  → "x3.14x"   |
    | changePi("pipi")  → "3.143.14" |
    | changePi("pip")   → "3.14p"    |
    | changePi("pi")    → "3.14"     |
    | changePi("hip")   → "hip"      |
    | changePi("p")     → "p"        |
    | changePi("x")     → "x"        |
    | changePi("")      → ""         |
    | changePi("pixx")  → "3.14xx"   |
    | changePi("xyzzy") → "xyzzy"    |
    |_______________________________*/

    public static final String changePi(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _ChangePi.Validate(true);  // pass 'false' to print failed tests only.
    }
}
