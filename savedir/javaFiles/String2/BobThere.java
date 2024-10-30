package String2;
import String2.Testcases._BobThere;

// https://codingbat.com/prob/p175762
// Difficulty: 221.0

public final class BobThere
{
    /* Return true if the given string contains a "bob" string, 
    but where the middle 'o' char can be any char. */

    /*______________________________
    |           Testcases           |
    |_______________________________|
    | str (String)      | expected  |
    |                   | (boolean) |
    |___________________|___________|
    | "abcbob"          | true      |
    | "b9b"             | true      |
    | "bac"             | false     |
    | "bbb"             | true      |
    | "abcdefb"         | false     |
    | "123abcbcdbabxyz" | true      |
    | "b12"             | false     |
    | "b1b"             | true      |
    | "b12b1b"          | true      |
    | "bbc"             | false     |
    | "bbb"             | true      |
    | "bb"              | false     |
    | "b"               | false     |
    |___________________|__________*/

    public static final boolean bobThere(String str)
    {
        return false;
    }

    public static final void main(String[] args) {
        _BobThere.Validate(true);  // pass 'false' to print failed tests only.
    }
}
