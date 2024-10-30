package String2;
import String2.Testcases._RepeatSeparator;

// https://codingbat.com/prob/p109637
// Difficulty: 236.0

public final class RepeatSeparator
{
    /* Given two strings, word and a separator sep, return a big string made of count occurrences of the word, 
    separated by the separator string. */

    /*_______________________________________________
    |                   Testcases                    |
    |________________________________________________|
    | word     | sep      | count | expected         |
    | (String) | (String) | (int) | (String)         |
    |__________|__________|_______|__________________|
    | "Word"   | "X"      | 3     | "WordXWordXWord" |
    | "This"   | "And"    | 2     | "ThisAndThis"    |
    | "This"   | "And"    | 1     | "This"           |
    | "Hi"     | "-n-"    | 2     | "Hi-n-Hi"        |
    | "AAA"    | ""       | 1     | "AAA"            |
    | "AAA"    | ""       | 0     | ""               |
    | "A"      | "B"      | 5     | "ABABABABA"      |
    | "abc"    | "XX"     | 3     | "abcXXabcXXabc"  |
    | "abc"    | "XX"     | 2     | "abcXXabc"       |
    | "abc"    | "XX"     | 1     | "abc"            |
    | "XYZ"    | "a"      | 2     | "XYZaXYZ"        |
    |__________|__________|_______|_________________*/

    public static final String repeatSeparator(String word, String sep, int count)
    {
        return "";
    }

    public static final void main(String[] args) {
        _RepeatSeparator.Validate(true);  // pass 'false' to print failed tests only.
    }
}
