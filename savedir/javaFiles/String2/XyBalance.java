package String2;
import String2.Testcases._XyBalance;

// https://codingbat.com/prob/p134250
// Difficulty: 224.0

public final class XyBalance
{
    /* We'll say that a String is xy-balanced if for all the 'x' chars in the string, 
    there exists a 'y' char somewhere later in the string. So "xxy" is balanced, 
    but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced. */

    /*_____________________________________
    |              Testcases               |
    |______________________________________|
    | xyBalance("aaxbby")          → true  |
    | xyBalance("aaxbb")           → false |
    | xyBalance("yaaxbb")          → false |
    | xyBalance("yaaxbby")         → true  |
    | xyBalance("xaxxbby")         → true  |
    | xyBalance("xaxxbbyx")        → false |
    | xyBalance("xxbxy")           → true  |
    | xyBalance("xxbx")            → false |
    | xyBalance("bbb")             → true  |
    | xyBalance("bxbb")            → false |
    | xyBalance("bxyb")            → true  |
    | xyBalance("xy")              → true  |
    | xyBalance("y")               → true  |
    | xyBalance("x")               → false |
    | xyBalance("")                → true  |
    | xyBalance("yxyxyxyx")        → false |
    | xyBalance("yxyxyxyxy")       → true  |
    | xyBalance("12xabxxydxyxyzz") → true  |
    |_____________________________________*/

    public static final boolean xyBalance(String str)
    {
        return false;
    }

    public static final void main(String[] args) {
        _XyBalance.Validate(true);  // pass 'false' to print failed tests only.
    }
}
