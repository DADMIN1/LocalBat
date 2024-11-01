package Array2;
import Array2.Testcases._TripleUp;

// https://codingbat.com/prob/p137874
// Difficulty: 263.0

public final class TripleUp
{
    /* Return true if the array contains, somewhere, three increasing adjacent numbers like .... 
    4, 5, 6, ... or 23, 24, 25. */

    /*____________________________________________
    |                  Testcases                  |
    |_____________________________________________|
    | nums (int[])                    | expected  |
    |                                 | (boolean) |
    |_________________________________|___________|
    | {1, 4, 5, 6, 2}                 | true      |
    | {1, 2, 3}                       | true      |
    | {1, 2, 4}                       | false     |
    | {1, 2, 4, 5, 7, 6, 5, 6, 7, 6}  | true      |
    | {1, 2, 4, 5, 7, 6, 5, 7, 7, 6}  | false     |
    | {1, 2}                          | false     |
    | {1}                             | false     |
    | {}                              | false     |
    | {10, 9, 8, -100, -99, -98, 100} | true      |
    | {10, 9, 8, -100, -99, 99, 100}  | false     |
    | {-100, -99, -99, 100, 101, 102} | true      |
    | {2, 3, 5, 6, 8, 9, 2, 3}        | false     |
    |_________________________________|__________*/

    public static final boolean tripleUp(int[] nums)
    {
        return false;
    }

    public static final void main(String[] args) {
        _TripleUp.Validate(true);  // pass 'false' to print failed tests only.
    }
}
