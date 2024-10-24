package Warmup2;
import Warmup2.Testcases._FrontTimes;

// https://codingbat.com/prob/p101475
// Difficulty: 206.0

public class FrontTimes
{
    /* Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, 
    or whatever is there if the string is less than length 3. 
    Return n copies of the front; */

    /*_________________________________________
    |                Testcases                 |
    |__________________________________________|
    | frontTimes("Chocolate", 2) → "ChoCho"    |
    | frontTimes("Chocolate", 3) → "ChoChoCho" |
    | frontTimes("Abc", 3)       → "AbcAbcAbc" |
    | frontTimes("Ab", 4)        → "AbAbAbAb"  |
    | frontTimes("A", 4)         → "AAAA"      |
    | frontTimes("", 4)          → ""          |
    | frontTimes("Abc", 0)       → ""          |
    |_________________________________________*/

    public static String frontTimes(String str, int n)
    {
        return "";
    }

    public static void main(String[] args) {
        _FrontTimes.Validate(true);  // pass 'false' to print failed tests only.
    }
}
