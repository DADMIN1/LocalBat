package String2;
import String2.Testcases._GetSandwich;

// https://codingbat.com/prob/p129952
// Difficulty: 245.0

public final class GetSandwich
{
    /* A sandwich is two pieces of bread with something in between. 
    Return the string that is between the first and last appearance of "bread" in the given string, 
    or return the empty string "" if there are not two pieces of bread. */

    /*_____________________________________________________
    |                      Testcases                       |
    |______________________________________________________|
    | getSandwich("breadjambread")          → "jam"        |
    | getSandwich("xxbreadjambreadyy")      → "jam"        |
    | getSandwich("xxbreadyy")              → ""           |
    | getSandwich("xxbreadbreadjambreadyy") → "breadjam"   |
    | getSandwich("breadAbread")            → "A"          |
    | getSandwich("breadbread")             → ""           |
    | getSandwich("abcbreaz")               → ""           |
    | getSandwich("xyz")                    → ""           |
    | getSandwich("")                       → ""           |
    | getSandwich("breadbreaxbread")        → "breax"      |
    | getSandwich("breaxbreadybread")       → "y"          |
    | getSandwich("breadbreadbreadbread")   → "breadbread" |
    |_____________________________________________________*/

    public static final String getSandwich(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _GetSandwich.Validate(true);  // pass 'false' to print failed tests only.
    }
}
