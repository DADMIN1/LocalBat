package Warmup1;
import Warmup1.Testcases._Front3;

// https://codingbat.com/prob/p136351
// Difficulty: 136.0

public final class Front3
{
    /* Given a string, we'll say that the front is the first 3 chars of the string. 
    If the string length is less than 3, the front is whatever is there. 
    Return a new string which is 3 copies of the front. */

    /*__________________________
    |         Testcases         |
    |___________________________|
    |     str     |   returns   |
    |   (String)  |   (String)  |
    |_____________|_____________|
    |    "Java"   | "JavJavJav" |
    | "Chocolate" | "ChoChoCho" |
    |    "abc"    | "abcabcabc" |
    |   "abcXYZ"  | "abcabcabc" |
    |     "ab"    |   "ababab"  |
    |     "a"     |    "aaa"    |
    |      ""     |      ""     |
    |_____________|____________*/

    public static final String front3(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        //_Front3.printSuccesses = false;  // set 'false' to print failing tests only.
        //_Front3.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _Front3.Validate();
    }
}
