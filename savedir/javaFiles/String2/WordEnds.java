package String2;
import String2.Testcases._WordEnds;

// https://codingbat.com/prob/p147538
// Difficulty: 260.0

public final class WordEnds
{
    /* Given a string and a non-empty word string, 
    return a string made of each char just before and just after every appearance of the word in the string. 
    Ignore cases where there is no char before or after the word, 
    and a char may be included twice if it is between two words. */

    /*___________________________________________
    |                 Testcases                  |
    |____________________________________________|
    | wordEnds("abcXY123XYijk", "XY") → "c13i"   |
    | wordEnds("XY123XY", "XY")       → "13"     |
    | wordEnds("XY1XY", "XY")         → "11"     |
    | wordEnds("XYXY", "XY")          → "XY"     |
    | wordEnds("XY", "XY")            → ""       |
    | wordEnds("Hi", "XY")            → ""       |
    | wordEnds("", "XY")              → ""       |
    | wordEnds("abc1xyz1i1j", "1")    → "cxziij" |
    | wordEnds("abc1xyz1", "1")       → "cxz"    |
    | wordEnds("abc1xyz11", "1")      → "cxz11"  |
    | wordEnds("abc1xyz1abc", "abc")  → "11"     |
    | wordEnds("abc1xyz1abc", "b")    → "acac"   |
    | wordEnds("abc1abc1abc", "abc")  → "1111"   |
    |___________________________________________*/

    public static final String wordEnds(String str, String word)
    {
        return "";
    }

    public static final void main(String[] args) {
        _WordEnds.Validate(true);  // pass 'false' to print failed tests only.
    }
}
