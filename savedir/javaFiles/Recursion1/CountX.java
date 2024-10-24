package Recursion1;
import Recursion1.Testcases._CountX;

// https://codingbat.com/prob/p170371
// Difficulty: 330.0

public class CountX
{
    /* Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string. */

    /*_________________________
    |        Testcases         |
    |__________________________|
    | countX("xxhixx")     → 4 |
    | countX("xhixhix")    → 3 |
    | countX("hi")         → 0 |
    | countX("h")          → 0 |
    | countX("x")          → 1 |
    | countX("")           → 0 |
    | countX("hihi")       → 0 |
    | countX("hiAAhi12hi") → 0 |
    |_________________________*/

    public static int countX(String str)
    {
        return 0;
    }

    public static void main(String[] args) {
        _CountX.Validate(true);  // pass 'false' to print failed tests only.
    }
}
