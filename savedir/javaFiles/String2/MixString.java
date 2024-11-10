package String2;
import String2.Testcases._MixString;

// https://codingbat.com/prob/p125185
// Difficulty: 227.0

public final class MixString
{
    /* Given two strings, a and b, create a bigger string made of the first char of a, 
    the first char of b, the second char of a, the second char of b, 
    and so on. Any leftover chars go at the end of the result. */

    /*_________________________________________
    |                Testcases                 |
    |__________________________________________|
    | a (String) |  b (String) |    returns    |
    |            |             |    (String)   |
    |____________|_____________|_______________|
    |   "abc"    |    "xyz"    |    "axbycz"   |
    |    "Hi"    |   "There"   |   "HTihere"   |
    |   "xxxx"   |   "There"   |  "xTxhxexre"  |
    |   "xxx"    |     "X"     |     "xXxx"    |
    |    "2/"    | "27 around" | "22/7 around" |
    |     ""     |   "Hello"   |    "Hello"    |
    |   "Abc"    |      ""     |     "Abc"     |
    |     ""     |      ""     |       ""      |
    |    "a"     |     "b"     |      "ab"     |
    |    "ax"    |     "b"     |     "abx"     |
    |    "a"     |     "bx"    |     "abx"     |
    |    "So"    |    "Long"   |    "SLoong"   |
    |   "Long"   |     "So"    |    "LSoong"   |
    |____________|_____________|______________*/

    public static final String mixString(String a, String b)
    {
        return "";
    }

    public static final void main(String[] args) {
        //_MixString.printSuccesses = false;  // set 'false' to print failing tests only.
        //_MixString.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _MixString.Validate();
    }
}
