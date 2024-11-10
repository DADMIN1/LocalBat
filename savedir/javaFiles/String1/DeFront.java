package String1;
import String1.Testcases._DeFront;

// https://codingbat.com/prob/p110141
// Difficulty: 190.0

public final class DeFront
{
    /* Given a string, return a version without the first 2 chars. 
    Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
    The string may be any length. Harder than it looks. */

    /*____________________
    |      Testcases      |
    |_____________________|
    |   str    | returns  |
    | (String) | (String) |
    |__________|__________|
    | "Hello"  |  "llo"   |
    |  "java"  |   "va"   |
    |  "away"  |  "aay"   |
    |  "axy"   |   "ay"   |
    |  "abc"   |  "abc"   |
    |  "xby"   |   "by"   |
    |   "ab"   |   "ab"   |
    |   "ax"   |   "a"    |
    |  "axb"   |   "ab"   |
    |  "aaa"   |   "aa"   |
    |  "xbc"   |   "bc"   |
    |  "bbb"   |   "bb"   |
    |  "bazz"  |   "zz"   |
    |   "ba"   |    ""    |
    | "abxyz"  | "abxyz"  |
    |   "hi"   |    ""    |
    |  "his"   |   "s"    |
    |   "xz"   |    ""    |
    |  "zzz"   |   "z"    |
    |__________|_________*/

    public static final String deFront(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        //_DeFront.printSuccesses = false;  // set 'false' to print failing tests only.
        //_DeFront.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _DeFront.Validate();
    }
}
