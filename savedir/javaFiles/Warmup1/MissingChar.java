package Warmup1;
import Warmup1.Testcases._MissingChar;

// https://codingbat.com/prob/p190570
// Difficulty: 130.0

public class MissingChar
{
    /* Given a non-empty string and an int n, return a new string where the char at index n has been removed. 
    The value of n will be a valid index of a char in the original string (i.e. 
    n will be in the range 0..str.length()-1 inclusive). */

    /*_________________________________________
    |                Testcases                 |
    |__________________________________________|
    | missingChar("kitten", 1)    → "ktten"    |
    | missingChar("kitten", 0)    → "itten"    |
    | missingChar("kitten", 4)    → "kittn"    |
    | missingChar("Hi", 0)        → "i"        |
    | missingChar("Hi", 1)        → "H"        |
    | missingChar("code", 0)      → "ode"      |
    | missingChar("code", 1)      → "cde"      |
    | missingChar("code", 2)      → "coe"      |
    | missingChar("code", 3)      → "cod"      |
    | missingChar("chocolate", 8) → "chocolat" |
    |_________________________________________*/

    public static String missingChar(String str, int n)
    {
        return "";
    }

    public static void main(String[] args) {
        _MissingChar.Validate(true);  // pass 'false' to print failed tests only.
    }
}
