package Functional1;
import Functional1.Testcases._Square;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p139586
// Difficulty: 203

public final class Square
{
    /* Given a list of integers, return a list where each integer is multiplied with itself. */

    /*_____________________________________________________________________________________________
    |                                          Testcases                                           |
    |______________________________________________________________________________________________|
    | square([1, 2, 3])                              → [1, 4, 9]                                   |
    | square([6, 8, -6, -8, 1])                      → [36, 64, 36, 64, 1]                         |
    | square([])                                     → []                                          |
    | square([12])                                   → [144]                                       |
    | square([5, 10])                                → [25, 100]                                   |
    | square([6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2]) → [36, 9, 144, 529, 16, 1, 361, 121, 4, 9, 4] |
    |_____________________________________________________________________________________________*/

    public static final List<Integer> square(List<Integer> nums)
    {
        return new ArrayList<Integer>();
    }

    public static final void main(String[] args) {
        _Square.Validate(true);  // pass 'false' to print failed tests only.
    }
}
