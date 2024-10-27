package String2;
import String2.Testcases._DoubleChar;

// https://codingbat.com/prob/p165312
// Difficulty: 203.0

public final class DoubleChar
{
    /* Given a string, return a string where for every char in the original, 
    there are two chars. */

    /*____________________________________________
    |                  Testcases                  |
    |_____________________________________________|
    | doubleChar("The")      → "TThhee"           |
    | doubleChar("AAbb")     → "AAAAbbbb"         |
    | doubleChar("Hi-There") → "HHii--TThheerree" |
    | doubleChar("Word!")    → "WWoorrdd!!"       |
    | doubleChar("!!")       → "!!!!"             |
    | doubleChar("")         → ""                 |
    | doubleChar("a")        → "aa"               |
    | doubleChar(".")        → ".."               |
    | doubleChar("aa")       → "aaaa"             |
    |____________________________________________*/

    public static final String doubleChar(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _DoubleChar.Validate(true);  // pass 'false' to print failed tests only.
    }
}
