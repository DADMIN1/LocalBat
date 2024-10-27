package AP1;
import AP1.Testcases._CommonTwo;

// https://codingbat.com/prob/p100369
// Difficulty: 254.0

public final class CommonTwo
{
    /* Start with two arrays of strings, a and b, each in alphabetical order, 
    possibly with duplicates. Return the count of the number of strings which appear in both arrays. 
    The best "linear" solution makes a single pass over both arrays, 
    taking advantage of the fact that they are in alphabetical order. */

    /*_________________________________________________________________________
    |                                Testcases                                 |
    |__________________________________________________________________________|
    | commonTwo(["a", "c", "x"], ["b", "c", "d", "x"])                     → 2 |
    | commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"])                → 3 |
    | commonTwo(["a", "b", "c"], ["a", "b", "c"])                          → 3 |
    | commonTwo(["a", "a", "b", "b", "c"], ["a", "b", "c"])                → 3 |
    | commonTwo(["a", "a", "b", "b", "c"], ["a", "b", "b", "b", "c"])      → 3 |
    | commonTwo(["a", "a", "b", "b", "c"], ["a", "b", "b", "c", "c"])      → 3 |
    | commonTwo(["b", "b", "b", "b", "c"], ["a", "b", "b", "b", "c"])      → 2 |
    | commonTwo(["a", "b", "c", "c", "d"], ["a", "b", "b", "c", "d", "d"]) → 4 |
    | commonTwo(["a", "a", "b", "b", "c"], ["b", "b", "b"])                → 1 |
    | commonTwo(["a", "a", "b", "b", "c"], ["c", "c"])                     → 1 |
    | commonTwo(["a", "a", "b", "b", "c"], ["b", "b", "b", "x"])           → 1 |
    | commonTwo(["a", "a", "b", "b", "c"], ["b", "b"])                     → 1 |
    | commonTwo(["a"], ["a", "b"])                                         → 1 |
    | commonTwo(["a"], ["b"])                                              → 0 |
    | commonTwo(["a", "a"], ["b", "b"])                                    → 0 |
    | commonTwo(["a", "b"], ["a", "b"])                                    → 2 |
    |_________________________________________________________________________*/

    public static final int commonTwo(String[] a, String[] b)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _CommonTwo.Validate(true);  // pass 'false' to print failed tests only.
    }
}
