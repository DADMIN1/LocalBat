package Warmup1;
import Warmup1.Testcases._BackAround;

// https://codingbat.com/prob/p161642
// Difficulty: 139.0

public final class BackAround
{
    /* Given a string, take the last char and return a new string with the last char added at the front and back, 
    so "cat" yields "tcatt". The original string will be length 1 or more. */

    /*________________________________
    |            Testcases            |
    |_________________________________|
    | backAround("cat")   → "tcatt"   |
    | backAround("Hello") → "oHelloo" |
    | backAround("a")     → "aaa"     |
    | backAround("abc")   → "cabcc"   |
    | backAround("read")  → "dreadd"  |
    | backAround("boo")   → "obooo"   |
    |________________________________*/

    public static final String backAround(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _BackAround.Validate(true);  // pass 'false' to print failed tests only.
    }
}
