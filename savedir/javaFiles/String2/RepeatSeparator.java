package String2;
import String2.Testcases._RepeatSeparator;

// https://codingbat.com/prob/p109637
// Difficulty: 236.0

public class RepeatSeparator
{
    /* Given two strings, word and a separator sep, return a big string made of count occurrences of the word, 
    separated by the separator string. */

    /*_____________________________________________________
    |                      Testcases                       |
    |______________________________________________________|
    | repeatSeparator("Word", "X", 3)   → "WordXWordXWord" |
    | repeatSeparator("This", "And", 2) → "ThisAndThis"    |
    | repeatSeparator("This", "And", 1) → "This"           |
    | repeatSeparator("Hi", "-n-", 2)   → "Hi-n-Hi"        |
    | repeatSeparator("AAA", "", 1)     → "AAA"            |
    | repeatSeparator("AAA", "", 0)     → ""               |
    | repeatSeparator("A", "B", 5)      → "ABABABABA"      |
    | repeatSeparator("abc", "XX", 3)   → "abcXXabcXXabc"  |
    | repeatSeparator("abc", "XX", 2)   → "abcXXabc"       |
    | repeatSeparator("abc", "XX", 1)   → "abc"            |
    | repeatSeparator("XYZ", "a", 2)    → "XYZaXYZ"        |
    |_____________________________________________________*/

    public static String repeatSeparator(String word, String sep, int count)
    {
        return "";
    }

    public static void main(String[] args) {
        _RepeatSeparator.Validate(true);  // pass 'false' to print failed tests only.
    }
}
