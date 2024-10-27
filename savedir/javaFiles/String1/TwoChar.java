package String1;
import String1.Testcases._TwoChar;

// https://codingbat.com/prob/p144623
// Difficulty: 154.0

public final class TwoChar
{
    /* Given a string and an index, return a string length 2 starting at the given index. 
    If the index is too big or too small to define a string length 2, 
    use the first 2 chars. The string length will be at least 2. */

    /*____________________________
    |          Testcases          |
    |_____________________________|
    | twoChar("java", 0)   → "ja" |
    | twoChar("java", 2)   → "va" |
    | twoChar("java", 3)   → "ja" |
    | twoChar("java", 4)   → "ja" |
    | twoChar("java", -1)  → "ja" |
    | twoChar("Hello", 0)  → "He" |
    | twoChar("Hello", 1)  → "el" |
    | twoChar("Hello", 99) → "He" |
    | twoChar("Hello", 3)  → "lo" |
    | twoChar("Hello", 4)  → "He" |
    | twoChar("Hello", 5)  → "He" |
    | twoChar("Hello", -7) → "He" |
    | twoChar("Hello", 6)  → "He" |
    | twoChar("Hello", -1) → "He" |
    | twoChar("yay", 0)    → "ya" |
    |____________________________*/

    public static final String twoChar(String str, int index)
    {
        return "";
    }

    public static final void main(String[] args) {
        _TwoChar.Validate(true);  // pass 'false' to print failed tests only.
    }
}
