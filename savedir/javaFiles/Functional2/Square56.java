package Functional2;
import Functional2.Testcases._Square56;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p132748
// Difficulty: 226

public final class Square56
{
    /* Given a list of integers, return a list of those numbers squared and the product added to 10, 
    omitting any of the resulting numbers that end in 5 or 6. */

    /*___________________________________________________
    |                     Testcases                      |
    |____________________________________________________|
    | square56([3, 1, 4])             → [19, 11]         |
    | square56([1])                   → [11]             |
    | square56([2])                   → [14]             |
    | square56([3])                   → [19]             |
    | square56([4])                   → []               |
    | square56([5])                   → []               |
    | square56([6])                   → []               |
    | square56([7])                   → [59]             |
    | square56([1, 2, 3, 4, 5, 6, 7]) → [11, 14, 19, 59] |
    | square56([3, -1, -4, 1, 5, 9])  → [19, 11, 11, 91] |
    |___________________________________________________*/

    public static final List<Integer> square56(List<Integer> nums)
    {
        return new ArrayList<Integer>();
    }

    public static final void main(String[] args) {
        _Square56.Validate(true);  // pass 'false' to print failed tests only.
    }
}
