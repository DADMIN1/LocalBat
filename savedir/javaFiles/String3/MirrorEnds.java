package String3;
import String3.Testcases._MirrorEnds;

// https://codingbat.com/prob/p139411
// Difficulty: 324.0

public final class MirrorEnds
{
    /* Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. 
    In other words, zero or more characters at the very begining of the given string, 
    and at the very end of the string in reverse order (possibly overlapping). 
    For example, the string "abXYZba" has the mirror end "ab". */

    /*_____________________________
    |          Testcases           |
    |______________________________|
    |  string (String)  | returns  |
    |                   | (String) |
    |___________________|__________|
    |     "abXYZba"     |   "ab"   |
    |       "abca"      |   "a"    |
    |       "aba"       |  "aba"   |
    |       "abab"      |    ""    |
    |       "xxx"       |  "xxx"   |
    |      "xxYxx"      | "xxYxx"  |
    |    "Hi and iH"    |  "Hi "   |
    |        "x"        |   "x"    |
    |         ""        |    ""    |
    | "123and then 321" |  "123"   |
    |    "band andab"   |   "ba"   |
    |___________________|_________*/

    public static final String mirrorEnds(String string)
    {
        return "";
    }

    public static final void main(String[] args) {
        _MirrorEnds.Validate(true);  // pass 'false' to print failed tests only.
    }
}
