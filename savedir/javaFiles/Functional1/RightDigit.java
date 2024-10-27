package Functional1;
import Functional1.Testcases._RightDigit;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p152194
// Difficulty: 220

public final class RightDigit
{
    /* Given a list of non-negative integers, return an integer list of the rightmost digits. 
    (Note: use %) */

    /*_________________________________________________________________________________________
    |                                        Testcases                                         |
    |__________________________________________________________________________________________|
    | rightDigit([1, 22, 93])                              → [1, 2, 3]                         |
    | rightDigit([16, 8, 886, 8, 1])                       → [6, 8, 6, 8, 1]                   |
    | rightDigit([10, 0])                                  → [0, 0]                            |
    | rightDigit([])                                       → []                                |
    | rightDigit([5, 10])                                  → [5, 0]                            |
    | rightDigit([5, 50, 500, 5000, 5000])                 → [5, 0, 0, 0, 0]                   |
    | rightDigit([6, 23, 12, 23, 4, 1, 19, 1119, 2, 3, 2]) → [6, 3, 2, 3, 4, 1, 9, 9, 2, 3, 2] |
    |_________________________________________________________________________________________*/

    public static final List<Integer> rightDigit(List<Integer> nums)
    {
        return new ArrayList<Integer>();
    }

    public static final void main(String[] args) {
        _RightDigit.Validate(true);  // pass 'false' to print failed tests only.
    }
}
