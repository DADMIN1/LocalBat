package Recursion1;
import Recursion1.Testcases._ParenBit;

// https://codingbat.com/prob/p137918
// Difficulty: 378.0

public final class ParenBit
{
    /* Given a string that contains a single pair of parenthesis, 
    compute recursively a new string made of only of the parenthesis and their contents, 
    so "xyz(abc)123" yields "(abc)". */

    /*__________________________________________
    |                 Testcases                 |
    |___________________________________________|
    |       str (String)       |    returns     |
    |                          |    (String)    |
    |__________________________|________________|
    |      "xyz(abc)123"       |    "(abc)"     |
    |        "x(hello)"        |   "(hello)"    |
    |         "(xy)1"          |     "(xy)"     |
    | "not really (possible)"  |  "(possible)"  |
    |         "(abc)"          |    "(abc)"     |
    |        "(abc)xyz"        |    "(abc)"     |
    |         "(abc)x"         |    "(abc)"     |
    |          "(x)"           |     "(x)"      |
    |           "()"           |      "()"      |
    |  "res (ipsa) loquitor"   |    "(ipsa)"    |
    | "hello(not really)there" | "(not really)" |
    |        "ab(ab)ab"        |     "(ab)"     |
    |__________________________|_______________*/

    public static final String parenBit(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        //_ParenBit.printSuccesses = false;  // set 'false' to print failing tests only.
        //_ParenBit.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _ParenBit.Validate();
    }
}
