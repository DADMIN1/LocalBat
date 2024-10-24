package String2;
import String2.Testcases._CountCode;

// https://codingbat.com/prob/p123614
// Difficulty: 212.0

public class CountCode
{
    /* Return the number of times that the string "code" appears anywhere in the given string, 
    except we'll accept any letter for the 'd', so "cope" and "cooe" count. */

    /*_______________________________________
    |               Testcases                |
    |________________________________________|
    | countCode("aaacodebbb")            → 1 |
    | countCode("codexxcode")            → 2 |
    | countCode("cozexxcope")            → 2 |
    | countCode("cozfxxcope")            → 1 |
    | countCode("xxcozeyycop")           → 1 |
    | countCode("cozcop")                → 0 |
    | countCode("abcxyz")                → 0 |
    | countCode("code")                  → 1 |
    | countCode("ode")                   → 0 |
    | countCode("c")                     → 0 |
    | countCode("")                      → 0 |
    | countCode("AAcodeBBcoleCCccoreDD") → 3 |
    | countCode("AAcodeBBcoleCCccorfDD") → 2 |
    | countCode("coAcodeBcoleccoreDD")   → 3 |
    |_______________________________________*/

    public static int countCode(String str)
    {
        return 0;
    }

    public static void main(String[] args) {
        _CountCode.Validate(true);  // pass 'false' to print failed tests only.
    }
}
