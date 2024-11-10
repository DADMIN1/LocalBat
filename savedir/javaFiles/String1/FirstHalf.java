package String1;
import String1.Testcases._FirstHalf;

// https://codingbat.com/prob/p172267
// Difficulty: 121.0

public final class FirstHalf
{
    /* Given a string of even length, return the first half. So the string "WooHoo" yields "Woo". */

    /*________________________
    |        Testcases        |
    |_________________________|
    | str (String) | returns  |
    |              | (String) |
    |______________|__________|
    |   "WooHoo"   |  "Woo"   |
    | "HelloThere" | "Hello"  |
    |   "abcdef"   |  "abc"   |
    |     "ab"     |   "a"    |
    |      ""      |    ""    |
    | "0123456789" | "01234"  |
    |   "kitten"   |  "kit"   |
    |______________|_________*/

    public static final String firstHalf(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        //_FirstHalf.printSuccesses = false;  // set 'false' to print failing tests only.
        //_FirstHalf.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _FirstHalf.Validate();
    }
}
