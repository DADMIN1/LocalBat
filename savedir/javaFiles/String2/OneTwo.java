package String2;
import String2.Testcases._OneTwo;

// https://codingbat.com/prob/p122943
// Difficulty: 250

public class OneTwo
{
    /* Given a string, compute a new string by moving the first char to come after the next two chars, 
    so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, 
    so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end. */

    /*_________________________________________________________________________________________
    |                                        Testcases                                         |
    |__________________________________________________________________________________________|
    | oneTwo("abc")                                   → "bca"                                  |
    | oneTwo("tca")                                   → "cat"                                  |
    | oneTwo("tcagdo")                                → "catdog"                               |
    | oneTwo("chocolate")                             → "hocolctea"                            |
    | oneTwo("1234567890")                            → "231564897"                            |
    | oneTwo("xabxabxabxabxabxabxab")                 → "abxabxabxabxabxabxabx"                |
    | oneTwo("abcdefx")                               → "bcaefd"                               |
    | oneTwo("abcdefxy")                              → "bcaefd"                               |
    | oneTwo("abcdefxyz")                             → "bcaefdyzx"                            |
    | oneTwo("")                                      → ""                                     |
    | oneTwo("x")                                     → ""                                     |
    | oneTwo("xy")                                    → ""                                     |
    | oneTwo("xyz")                                   → "yzx"                                  |
    | oneTwo("abcdefghijklkmnopqrstuvwxyz1234567890") → "bcaefdhigkljmnkpqostrvwuyzx231564897" |
    | oneTwo("abcdefghijklkmnopqrstuvwxyz123456789")  → "bcaefdhigkljmnkpqostrvwuyzx231564897" |
    | oneTwo("abcdefghijklkmnopqrstuvwxyz12345678")   → "bcaefdhigkljmnkpqostrvwuyzx231564"    |
    |_________________________________________________________________________________________*/

    public static String oneTwo(String str)
    {
        return "";
    }

    public static void main(String[] args) {
        _OneTwo.Validate(true);  // pass 'false' to print failed tests only.
    }
}
