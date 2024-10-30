package String2;
import String2.Testcases._XyzThere;

// https://codingbat.com/prob/p136594
// Difficulty: 218.0

public final class XyzThere
{
    /* Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). 
    So "xxyz" counts but "x.xyz" does not. */

    /*_____________________________
    |          Testcases           |
    |______________________________|
    | str (String)     | expected  |
    |                  | (boolean) |
    |__________________|___________|
    | "abcxyz"         | true      |
    | "abc.xyz"        | false     |
    | "xyz.abc"        | true      |
    | "abcxy"          | false     |
    | "xyz"            | true      |
    | "xy"             | false     |
    | "x"              | false     |
    | ""               | false     |
    | "abc.xyzxyz"     | true      |
    | "abc.xxyz"       | true      |
    | ".xyz"           | false     |
    | "12.xyz"         | false     |
    | "12xyz"          | true      |
    | "1.xyz.xyz2.xyz" | false     |
    |__________________|__________*/

    public static final boolean xyzThere(String str)
    {
        return false;
    }

    public static final void main(String[] args) {
        _XyzThere.Validate(true);  // pass 'false' to print failed tests only.
    }
}
