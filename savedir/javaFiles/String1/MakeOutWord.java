package String1;
import String1.Testcases._MakeOutWord;

// https://codingbat.com/prob/p184030
// Difficulty: 112.0

public final class MakeOutWord
{
    /* Given an "out" string length 4, such as "<<>>", and a word, 
    return a new string where the word is in the middle of the out string, e.g. "<<word>>". 
    Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j. */

    /*___________________________________
    |             Testcases              |
    |____________________________________|
    |   out    |   word   |   returns    |
    | (String) | (String) |   (String)   |
    |__________|__________|______________|
    |  "<<>>"  |  "Yay"   |  "<<Yay>>"   |
    |  "<<>>"  | "WooHoo" | "<<WooHoo>>" |
    |  "[[]]"  |  "word"  |  "[[word]]"  |
    |  "HHoo"  | "Hello"  | "HHHellooo"  |
    |  "abyz"  |  "YAY"   |  "abYAYyz"   |
    |__________|__________|_____________*/

    public static final String makeOutWord(String out, String word)
    {
        return "";
    }

    public static final void main(String[] args) {
        _MakeOutWord.Validate(true);  // pass 'false' to print failed tests only.
    }
}
