package Array1;
import Array1.Testcases._SameFirstLast;

// https://codingbat.com/prob/p118976
// Difficulty: 106.0

public final class SameFirstLast
{
    /* Given an array of ints, return true if the array is length 1 or more, 
    and the first element and the last element are equal. */

    /*____________________________________________
    |                  Testcases                  |
    |_____________________________________________|
    | sameFirstLast([1, 2, 3])            → false |
    | sameFirstLast([1, 2, 3, 1])         → true  |
    | sameFirstLast([1, 2, 1])            → true  |
    | sameFirstLast([7])                  → true  |
    | sameFirstLast([])                   → false |
    | sameFirstLast([1, 2, 3, 4, 5, 1])   → true  |
    | sameFirstLast([1, 2, 3, 4, 5, 13])  → false |
    | sameFirstLast([13, 2, 3, 4, 5, 13]) → true  |
    | sameFirstLast([7, 7])               → true  |
    |____________________________________________*/

    public static final boolean sameFirstLast(int[] nums)
    {
        return false;
    }

    public static final void main(String[] args) {
        _SameFirstLast.Validate(true);  // pass 'false' to print failed tests only.
    }
}
