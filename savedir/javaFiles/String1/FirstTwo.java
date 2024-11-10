package String1;
import String1.Testcases._FirstTwo;

// https://codingbat.com/prob/p163411
// Difficulty: 118.0

public final class FirstTwo
{
    /* Given a string, return the string made of its first two chars, 
    so the String "Hello" yields "He". If the string is shorter than length 2, 
    return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". 
    Note that str.length() returns the length of a string. */

    /*_____________________
    |      Testcases       |
    |______________________|
    |    str    | returns  |
    |  (String) | (String) |
    |___________|__________|
    |  "Hello"  |   "He"   |
    | "abcdefg" |   "ab"   |
    |    "ab"   |   "ab"   |
    |    "a"    |   "a"    |
    |     ""    |    ""    |
    |  "Kitten" |   "Ki"   |
    |    "hi"   |   "hi"   |
    |   "hiya"  |   "hi"   |
    |___________|_________*/

    public static final String firstTwo(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        //_FirstTwo.printSuccesses = false;  // set 'false' to print failing tests only.
        //_FirstTwo.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _FirstTwo.Validate();
    }
}
