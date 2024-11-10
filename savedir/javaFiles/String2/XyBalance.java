package String2;
import String2.Testcases._XyBalance;

// https://codingbat.com/prob/p134250
// Difficulty: 224.0

public final class XyBalance
{
    /* We'll say that a String is xy-balanced if for all the 'x' chars in the string, 
    there exists a 'y' char somewhere later in the string. So "xxy" is balanced, 
    but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced. */

    /*______________________________
    |           Testcases           |
    |_______________________________|
    |    str (String)   |  returns  |
    |                   | (boolean) |
    |___________________|___________|
    |      "aaxbby"     |    true   |
    |      "aaxbb"      |   false   |
    |      "yaaxbb"     |   false   |
    |     "yaaxbby"     |    true   |
    |     "xaxxbby"     |    true   |
    |     "xaxxbbyx"    |   false   |
    |      "xxbxy"      |    true   |
    |       "xxbx"      |   false   |
    |       "bbb"       |    true   |
    |       "bxbb"      |   false   |
    |       "bxyb"      |    true   |
    |        "xy"       |    true   |
    |        "y"        |    true   |
    |        "x"        |   false   |
    |         ""        |    true   |
    |     "yxyxyxyx"    |   false   |
    |    "yxyxyxyxy"    |    true   |
    | "12xabxxydxyxyzz" |    true   |
    |___________________|__________*/

    public static final boolean xyBalance(String str)
    {
        return false;
    }

    public static final void main(String[] args) {
        //_XyBalance.printSuccesses = false;  // set 'false' to print failing tests only.
        //_XyBalance.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _XyBalance.Validate();
    }
}
