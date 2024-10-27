package String2;
import String2.Testcases._XyzThere;

// https://codingbat.com/prob/p136594
// Difficulty: 218.0

public final class XyzThere
{
    /* Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). 
    So "xxyz" counts but "x.xyz" does not. */

    /*___________________________________
    |             Testcases              |
    |____________________________________|
    | xyzThere("abcxyz")         → true  |
    | xyzThere("abc.xyz")        → false |
    | xyzThere("xyz.abc")        → true  |
    | xyzThere("abcxy")          → false |
    | xyzThere("xyz")            → true  |
    | xyzThere("xy")             → false |
    | xyzThere("x")              → false |
    | xyzThere("")               → false |
    | xyzThere("abc.xyzxyz")     → true  |
    | xyzThere("abc.xxyz")       → true  |
    | xyzThere(".xyz")           → false |
    | xyzThere("12.xyz")         → false |
    | xyzThere("12xyz")          → true  |
    | xyzThere("1.xyz.xyz2.xyz") → false |
    |___________________________________*/

    public static final boolean xyzThere(String str)
    {
        return false;
    }

    public static final void main(String[] args) {
        _XyzThere.Validate(true);  // pass 'false' to print failed tests only.
    }
}
