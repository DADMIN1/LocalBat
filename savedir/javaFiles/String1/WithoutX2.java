package String1;
import String1.Testcases._WithoutX2;

// https://codingbat.com/prob/p151359
// Difficulty: 199.0

public final class WithoutX2
{
    /* Given a string, if one or both of the first 2 chars is 'x', 
    return the string without those 'x' chars, and otherwise return the string unchanged. 
    This is a little harder than it looks. */

    /*____________________
    |      Testcases      |
    |_____________________|
    |   str    | returns  |
    | (String) | (String) |
    |__________|__________|
    |  "xHi"   |   "Hi"   |
    |  "Hxi"   |   "Hi"   |
    |   "Hi"   |   "Hi"   |
    |  "xxHi"  |   "Hi"   |
    |  "Hix"   |  "Hix"   |
    |  "xaxb"  |  "axb"   |
    |   "xx"   |    ""    |
    |   "x"    |    ""    |
    |    ""    |    ""    |
    | "Hello"  | "Hello"  |
    | "Hexllo" | "Hexllo" |
    | "xHxllo" | "Hxllo"  |
    |__________|_________*/

    public static final String withoutX2(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        //_WithoutX2.printSuccesses = false;  // set 'false' to print failing tests only.
        //_WithoutX2.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _WithoutX2.Validate();
    }
}
