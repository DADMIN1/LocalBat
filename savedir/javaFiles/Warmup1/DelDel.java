package Warmup1;
import Warmup1.Testcases._DelDel;

// https://codingbat.com/prob/p100905
// Difficulty: 160.0

public final class DelDel
{
    /* Given a string, if the string "del" appears starting at index 1, 
    return a string where that "del" has been deleted. Otherwise, 
    return the string unchanged. */

    /*________________________________
    |            Testcases            |
    |_________________________________|
    | delDel("adelbc")    → "abc"     |
    | delDel("adelHello") → "aHello"  |
    | delDel("adedbc")    → "adedbc"  |
    | delDel("abcdel")    → "abcdel"  |
    | delDel("add")       → "add"     |
    | delDel("ad")        → "ad"      |
    | delDel("a")         → "a"       |
    | delDel("")          → ""        |
    | delDel("del")       → "del"     |
    | delDel("adel")      → "a"       |
    | delDel("aadelbb")   → "aadelbb" |
    |________________________________*/

    public static final String delDel(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _DelDel.Validate(true);  // pass 'false' to print failed tests only.
    }
}
