package String2;
import String2.Testcases._CountCode;

// https://codingbat.com/prob/p123614
// Difficulty: 212.0

public final class CountCode
{
    /* Return the number of times that the string "code" appears anywhere in the given string, 
    except we'll accept any letter for the 'd', so "cope" and "cooe" count. */

    /*__________________________________
    |             Testcases             |
    |___________________________________|
    |       str (String)      | returns |
    |                         |  (int)  |
    |_________________________|_________|
    |       "aaacodebbb"      |    1    |
    |       "codexxcode"      |    2    |
    |       "cozexxcope"      |    2    |
    |       "cozfxxcope"      |    1    |
    |      "xxcozeyycop"      |    1    |
    |         "cozcop"        |    0    |
    |         "abcxyz"        |    0    |
    |          "code"         |    1    |
    |          "ode"          |    0    |
    |           "c"           |    0    |
    |            ""           |    0    |
    | "AAcodeBBcoleCCccoreDD" |    3    |
    | "AAcodeBBcoleCCccorfDD" |    2    |
    |  "coAcodeBcoleccoreDD"  |    3    |
    |_________________________|________*/

    public static final int countCode(String str)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _CountCode.Validate(true);  // pass 'false' to print failed tests only.
    }
}
