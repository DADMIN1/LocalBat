package String1;
import String1.Testcases._Without2;

// https://codingbat.com/prob/p142247
// Difficulty: 187.0

public final class Without2
{
    /* Given a string, if a length 2 substring appears at both its beginning and end, 
    return a string without the substring at the beginning, 
    so "HelloHe" yields "lloHe". The substring may overlap with itself, 
    so "Hi" yields "". Otherwise, return the original string unchanged. */

    /*__________________________
    |         Testcases         |
    |___________________________|
    |     str     |   returns   |
    |   (String)  |   (String)  |
    |_____________|_____________|
    |  "HelloHe"  |   "lloHe"   |
    |  "HelloHi"  |  "HelloHi"  |
    |     "Hi"    |      ""     |
    | "Chocolate" | "Chocolate" |
    |    "xxx"    |     "x"     |
    |     "xx"    |      ""     |
    |     "x"     |     "x"     |
    |      ""     |      ""     |
    |   "Fruits"  |   "Fruits"  |
    |_____________|____________*/

    public static final String without2(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _Without2.Validate(true);  // pass 'false' to print failed tests only.
    }
}
