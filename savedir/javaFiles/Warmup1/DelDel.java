package Warmup1;
import Warmup1.Testcases._DelDel;

// https://codingbat.com/prob/p100905
// Difficulty: 160.0

public final class DelDel
{
    /* Given a string, if the string "del" appears starting at index 1, 
    return a string where that "del" has been deleted. Otherwise, 
    return the string unchanged. */

    /*________________________
    |        Testcases        |
    |_________________________|
    | str         | expected  |
    | (String)    | (String)  |
    |_____________|___________|
    | "adelbc"    | "abc"     |
    | "adelHello" | "aHello"  |
    | "adedbc"    | "adedbc"  |
    | "abcdel"    | "abcdel"  |
    | "add"       | "add"     |
    | "ad"        | "ad"      |
    | "a"         | "a"       |
    | ""          | ""        |
    | "del"       | "del"     |
    | "adel"      | "a"       |
    | "aadelbb"   | "aadelbb" |
    |_____________|__________*/

    public static final String delDel(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _DelDel.Validate(true);  // pass 'false' to print failed tests only.
    }
}
