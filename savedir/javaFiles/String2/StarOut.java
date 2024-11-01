package String2;
import String2.Testcases._StarOut;

// https://codingbat.com/prob/p139564
// Difficulty: 254.0

public final class StarOut
{
    /* Return a version of the given string, 
    where for every star (*) in the string the star and the chars immediately to its left and right are gone. 
    So "ab*cd" yields "ad" and "ab**cd" also yields "ad". */

    /*_________________________
    |        Testcases         |
    |__________________________|
    |  str (String) | returns  |
    |               | (String) |
    |_______________|__________|
    |    "ab*cd"    |   "ad"   |
    |    "ab**cd"   |   "ad"   |
    |   "sm*eilly"  | "silly"  |
    |  "sm*eil*ly"  |  "siy"   |
    |  "sm**eil*ly" |  "siy"   |
    | "sm***eil*ly" |  "siy"   |
    |   "stringy*"  | "string" |
    |   "*stringy"  | "tringy" |
    |  "*str*in*gy" |   "ty"   |
    |     "abc"     |  "abc"   |
    |     "a*bc"    |   "c"    |
    |      "ab"     |   "ab"   |
    |     "a*b"     |    ""    |
    |      "a"      |   "a"    |
    |      "a*"     |    ""    |
    |      "*a"     |    ""    |
    |      "*"      |    ""    |
    |       ""      |    ""    |
    |_______________|_________*/

    public static final String starOut(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _StarOut.Validate(true);  // pass 'false' to print failed tests only.
    }
}
