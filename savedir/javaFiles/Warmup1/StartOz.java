package Warmup1;
import Warmup1.Testcases._StartOz;

// https://codingbat.com/prob/p199720
// Difficulty: 166.0

public final class StartOz
{
    /* Given a string, return a string made of the first 2 chars (if present), 
    however include first char only if it is 'o' and include the second only if it is 'z', 
    so "ozymandias" yields "oz". */

    /*________________________
    |        Testcases        |
    |_________________________|
    | str (String) | expected |
    |              | (String) |
    |______________|__________|
    | "ozymandias" | "oz"     |
    | "bzoo"       | "z"      |
    | "oxx"        | "o"      |
    | "oz"         | "oz"     |
    | "ounce"      | "o"      |
    | "o"          | "o"      |
    | "abc"        | ""       |
    | ""           | ""       |
    | "zoo"        | ""       |
    | "aztec"      | "z"      |
    | "zzzz"       | "z"      |
    | "oznic"      | "oz"     |
    |______________|_________*/

    public static final String startOz(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _StartOz.Validate(true);  // pass 'false' to print failed tests only.
    }
}
