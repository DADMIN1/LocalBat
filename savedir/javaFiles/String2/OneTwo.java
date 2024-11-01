package String2;
import String2.Testcases._OneTwo;

// https://codingbat.com/prob/p122943
// Difficulty: 250

public final class OneTwo
{
    /* Given a string, compute a new string by moving the first char to come after the next two chars, 
    so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, 
    so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end. */

    /*_________________________________________________________________________________
    |                                    Testcases                                     |
    |__________________________________________________________________________________|
    |               str (String)              |            returns (String)            |
    |_________________________________________|________________________________________|
    |                  "abc"                  |                 "bca"                  |
    |                  "tca"                  |                 "cat"                  |
    |                 "tcagdo"                |                "catdog"                |
    |               "chocolate"               |              "hocolctea"               |
    |               "1234567890"              |              "231564897"               |
    |         "xabxabxabxabxabxabxab"         |        "abxabxabxabxabxabxabx"         |
    |                "abcdefx"                |                "bcaefd"                |
    |                "abcdefxy"               |                "bcaefd"                |
    |               "abcdefxyz"               |              "bcaefdyzx"               |
    |                    ""                   |                   ""                   |
    |                   "x"                   |                   ""                   |
    |                   "xy"                  |                   ""                   |
    |                  "xyz"                  |                 "yzx"                  |
    | "abcdefghijklkmnopqrstuvwxyz1234567890" | "bcaefdhigkljmnkpqostrvwuyzx231564897" |
    |  "abcdefghijklkmnopqrstuvwxyz123456789" | "bcaefdhigkljmnkpqostrvwuyzx231564897" |
    |  "abcdefghijklkmnopqrstuvwxyz12345678"  |  "bcaefdhigkljmnkpqostrvwuyzx231564"   |
    |_________________________________________|_______________________________________*/

    public static final String oneTwo(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _OneTwo.Validate(true);  // pass 'false' to print failed tests only.
    }
}
