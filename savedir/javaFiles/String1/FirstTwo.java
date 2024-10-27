package String1;
import String1.Testcases._FirstTwo;

// https://codingbat.com/prob/p163411
// Difficulty: 118.0

public final class FirstTwo
{
    /* Given a string, return the string made of its first two chars, 
    so the String "Hello" yields "He". If the string is shorter than length 2, 
    return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". 
    Note that str.length() returns the length of a string. */

    /*___________________________
    |         Testcases          |
    |____________________________|
    | firstTwo("Hello")   → "He" |
    | firstTwo("abcdefg") → "ab" |
    | firstTwo("ab")      → "ab" |
    | firstTwo("a")       → "a"  |
    | firstTwo("")        → ""   |
    | firstTwo("Kitten")  → "Ki" |
    | firstTwo("hi")      → "hi" |
    | firstTwo("hiya")    → "hi" |
    |___________________________*/

    public static final String firstTwo(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _FirstTwo.Validate(true);  // pass 'false' to print failed tests only.
    }
}
