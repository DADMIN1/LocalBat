package Warmup1;
import Warmup1.Testcases._StartOz;

// https://codingbat.com/prob/p199720
// Difficulty: 166.0

public class StartOz
{
    /* Given a string, return a string made of the first 2 chars (if present), 
    however include first char only if it is 'o' and include the second only if it is 'z', 
    so "ozymandias" yields "oz". */

    /*_____________________________
    |          Testcases           |
    |______________________________|
    | startOz("ozymandias") → "oz" |
    | startOz("bzoo")       → "z"  |
    | startOz("oxx")        → "o"  |
    | startOz("oz")         → "oz" |
    | startOz("ounce")      → "o"  |
    | startOz("o")          → "o"  |
    | startOz("abc")        → ""   |
    | startOz("")           → ""   |
    | startOz("zoo")        → ""   |
    | startOz("aztec")      → "z"  |
    | startOz("zzzz")       → "z"  |
    | startOz("oznic")      → "oz" |
    |_____________________________*/

    public static String startOz(String str)
    {
        return "";
    }

    public static void main(String[] args) {
        _StartOz.Validate(true);  // pass 'false' to print failed tests only.
    }
}
