package String1;
import String1.Testcases._MakeOutWord;

// https://codingbat.com/prob/p184030
// Difficulty: 112.0

public class MakeOutWord
{
    /* Given an "out" string length 4, such as "<<>>", and a word, 
    return a new string where the word is in the middle of the out string, e.g. "<<word>>". 
    Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j. */

    /*_____________________________________________
    |                  Testcases                   |
    |______________________________________________|
    | makeOutWord("<<>>", "Yay")    → "<<Yay>>"    |
    | makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>" |
    | makeOutWord("[[]]", "word")   → "[[word]]"   |
    | makeOutWord("HHoo", "Hello")  → "HHHellooo"  |
    | makeOutWord("abyz", "YAY")    → "abYAYyz"    |
    |_____________________________________________*/

    public static String makeOutWord(String out, String word)
    {
        return "";
    }

    public static void main(String[] args) {
        _MakeOutWord.Validate(true);  // pass 'false' to print failed tests only.
    }
}
