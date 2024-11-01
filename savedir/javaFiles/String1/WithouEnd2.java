package String1;
import String1.Testcases._WithouEnd2;

// https://codingbat.com/prob/p174254
// Difficulty: 142.0

public final class WithouEnd2
{
    /* Given a string, return a version without both the first and last char of the string. 
    The string may be any length, including 0. */

    /*________________________
    |        Testcases        |
    |_________________________|
    |     str     |  returns  |
    |   (String)  |  (String) |
    |_____________|___________|
    |   "Hello"   |   "ell"   |
    |    "abc"    |    "b"    |
    |     "ab"    |     ""    |
    |     "a"     |     ""    |
    |      ""     |     ""    |
    |   "coldy"   |   "old"   |
    | "java code" | "ava cod" |
    |_____________|__________*/

    public static final String withouEnd2(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _WithouEnd2.Validate(true);  // pass 'false' to print failed tests only.
    }
}
