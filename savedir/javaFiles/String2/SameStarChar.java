package String2;
import String2.Testcases._SameStarChar;

// https://codingbat.com/prob/p194491
// Difficulty: 248.0

public final class SameStarChar
{
    /* Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, 
    they are the same. */

    /*_________________________
    |        Testcases         |
    |__________________________|
    | str (String) |  returns  |
    |              | (boolean) |
    |______________|___________|
    |   "xy*yzz"   |    true   |
    |   "xy*zzz"   |   false   |
    |   "*xa*az"   |    true   |
    |   "*xa*bz"   |   false   |
    |   "*xa*a*"   |    true   |
    |      ""      |    true   |
    |  "*xa*a*a"   |    true   |
    |  "*xa*a*b"   |   false   |
    |  "*12*2*2"   |    true   |
    |  "12*2*3*"   |   false   |
    |   "abcDEF"   |    true   |
    | "XY*YYYY*Z*" |   false   |
    | "XY*YYYY*Y*" |    true   |
    |  "12*2*3*"   |   false   |
    |     "*"      |    true   |
    |     "**"     |    true   |
    |______________|__________*/

    public static final boolean sameStarChar(String str)
    {
        return false;
    }

    public static final void main(String[] args) {
        _SameStarChar.Validate(true);  // pass 'false' to print failed tests only.
    }
}
