package Warmup1;
import Warmup1.Testcases._EveryNth;

// https://codingbat.com/prob/p196441
// Difficulty: 190.0

public class EveryNth
{
    /* Given a non-empty string and an int N, return the string made starting with char 0, 
    and then every Nth char of the string. So if N is 3, use char 0, 
    3, 6, ... and so on. N is 1 or more. */

    /*_____________________________________
    |              Testcases               |
    |______________________________________|
    | everyNth("Miracle", 2)      → "Mrce" |
    | everyNth("abcdefg", 2)      → "aceg" |
    | everyNth("abcdefg", 3)      → "adg"  |
    | everyNth("Chocolate", 3)    → "Cca"  |
    | everyNth("Chocolates", 3)   → "Ccas" |
    | everyNth("Chocolates", 4)   → "Coe"  |
    | everyNth("Chocolates", 100) → "C"    |
    |_____________________________________*/

    public static String everyNth(String str, int n)
    {
        return "";
    }

    public static void main(String[] args) {
        _EveryNth.Validate(true);  // pass 'false' to print failed tests only.
    }
}
