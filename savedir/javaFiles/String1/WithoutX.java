package String1;
import String1.Testcases._WithoutX;

// https://codingbat.com/prob/p151940
// Difficulty: 196.0

public final class WithoutX
{
    /* Given a string, if the first or last chars are 'x', return the string without those 'x' chars, 
    and otherwise return the string unchanged. */

    /*____________________
    |      Testcases      |
    |_____________________|
    |   str    | returns  |
    | (String) | (String) |
    |__________|__________|
    |  "xHix"  |   "Hi"   |
    |  "xHi"   |   "Hi"   |
    |  "Hxix"  |  "Hxi"   |
    |   "Hi"   |   "Hi"   |
    |  "xxHi"  |  "xHi"   |
    |  "Hix"   |   "Hi"   |
    | "xaxbx"  |  "axb"   |
    |   "xx"   |    ""    |
    |   "x"    |    ""    |
    |    ""    |    ""    |
    | "Hello"  | "Hello"  |
    | "Hexllo" | "Hexllo" |
    |__________|_________*/

    public static final String withoutX(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _WithoutX.Validate(true);  // pass 'false' to print failed tests only.
    }
}
