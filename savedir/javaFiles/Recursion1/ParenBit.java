package Recursion1;
import Recursion1.Testcases._ParenBit;

// https://codingbat.com/prob/p137918
// Difficulty: 378.0

public class ParenBit
{
    /* Given a string that contains a single pair of parenthesis, 
    compute recursively a new string made of only of the parenthesis and their contents, 
    so "xyz(abc)123" yields "(abc)". */

    /*____________________________________________________
    |                      Testcases                      |
    |_____________________________________________________|
    | parenBit("xyz(abc)123")            → "(abc)"        |
    | parenBit("x(hello)")               → "(hello)"      |
    | parenBit("(xy)1")                  → "(xy)"         |
    | parenBit("not really (possible)")  → "(possible)"   |
    | parenBit("(abc)")                  → "(abc)"        |
    | parenBit("(abc)xyz")               → "(abc)"        |
    | parenBit("(abc)x")                 → "(abc)"        |
    | parenBit("(x)")                    → "(x)"          |
    | parenBit("()")                     → "()"           |
    | parenBit("res (ipsa) loquitor")    → "(ipsa)"       |
    | parenBit("hello(not really)there") → "(not really)" |
    | parenBit("ab(ab)ab")               → "(ab)"         |
    |____________________________________________________*/

    public static String parenBit(String str)
    {
        return "";
    }

    public static void main(String[] args) {
        _ParenBit.Validate(true);  // pass 'false' to print failed tests only.
    }
}
