package Array3;
import Array3.Testcases._LinearIn;

// https://codingbat.com/prob/p134022
// Difficulty: 315.0

public final class LinearIn
{
    /* Given two arrays of ints sorted in increasing order, outer and inner, 
    return true if all of the numbers in inner appear in outer. 
    The best solution makes only a single "linear" pass of both arrays, 
    taking advantage of the fact that both arrays are already in sorted order. */

    /*___________________________________________________________
    |                         Testcases                          |
    |____________________________________________________________|
    | linearIn([1, 2, 4, 6], [2, 4])                     → true  |
    | linearIn([1, 2, 4, 6], [2, 3, 4])                  → false |
    | linearIn([1, 2, 4, 4, 6], [2, 4])                  → true  |
    | linearIn([2, 2, 4, 4, 6, 6], [2, 4])               → true  |
    | linearIn([2, 2, 2, 2, 2], [2, 2])                  → true  |
    | linearIn([2, 2, 2, 2, 2], [2, 4])                  → false |
    | linearIn([2, 2, 2, 2, 4], [2, 4])                  → true  |
    | linearIn([1, 2, 3], [2])                           → true  |
    | linearIn([1, 2, 3], [-1])                          → false |
    | linearIn([1, 2, 3], [])                            → true  |
    | linearIn([-1, 0, 3, 3, 3, 10, 12], [-1, 0, 3, 12]) → true  |
    | linearIn([-1, 0, 3, 3, 3, 10, 12], [0, 3, 12, 14]) → false |
    | linearIn([-1, 0, 3, 3, 3, 10, 12], [-1, 10, 11])   → false |
    |___________________________________________________________*/

    public static final boolean linearIn(int[] outer, int[] inner)
    {
        return false;
    }

    public static final void main(String[] args) {
        _LinearIn.Validate(true);  // pass 'false' to print failed tests only.
    }
}
