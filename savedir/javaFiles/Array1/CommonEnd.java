package Array1;
import Array1.Testcases._CommonEnd;

// https://codingbat.com/prob/p191991
// Difficulty: 112.0

public final class CommonEnd
{
    /* Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. 
    Both arrays will be length 1 or more. */

    /*________________________________________
    |                Testcases                |
    |_________________________________________|
    | commonEnd([1, 2, 3], [7, 3])    → true  |
    | commonEnd([1, 2, 3], [7, 3, 2]) → false |
    | commonEnd([1, 2, 3], [1, 3])    → true  |
    | commonEnd([1, 2, 3], [1])       → true  |
    | commonEnd([1, 2, 3], [2])       → false |
    |________________________________________*/

    public static final boolean commonEnd(int[] a, int[] b)
    {
        return false;
    }

    public static final void main(String[] args) {
        _CommonEnd.Validate(true);  // pass 'false' to print failed tests only.
    }
}
