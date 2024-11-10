package String2;
import String2.Testcases._GetSandwich;

// https://codingbat.com/prob/p129952
// Difficulty: 245.0

public final class GetSandwich
{
    /* A sandwich is two pieces of bread with something in between. 
    Return the string that is between the first and last appearance of "bread" in the given string, 
    or return the empty string "" if there are not two pieces of bread. */

    /*________________________________________
    |                Testcases                |
    |_________________________________________|
    |       str (String)       |   returns    |
    |                          |   (String)   |
    |__________________________|______________|
    |     "breadjambread"      |    "jam"     |
    |   "xxbreadjambreadyy"    |    "jam"     |
    |       "xxbreadyy"        |      ""      |
    | "xxbreadbreadjambreadyy" |  "breadjam"  |
    |      "breadAbread"       |     "A"      |
    |       "breadbread"       |      ""      |
    |        "abcbreaz"        |      ""      |
    |          "xyz"           |      ""      |
    |            ""            |      ""      |
    |    "breadbreaxbread"     |   "breax"    |
    |    "breaxbreadybread"    |     "y"      |
    |  "breadbreadbreadbread"  | "breadbread" |
    |__________________________|_____________*/

    public static final String getSandwich(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        //_GetSandwich.printSuccesses = false;  // set 'false' to print failing tests only.
        //_GetSandwich.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _GetSandwich.Validate();
    }
}
