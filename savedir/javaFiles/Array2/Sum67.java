package Array2;
import Array2.Testcases._Sum67;

// https://codingbat.com/prob/p111327
// Difficulty: 215.0

public final class Sum67
{
    /* Return the sum of the numbers in the array, 
    except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). 
    Return 0 for no numbers. */

    /*_______________________________________________
    |                   Testcases                    |
    |________________________________________________|
    | nums (int[])                        | expected |
    |                                     | (int)    |
    |_____________________________________|__________|
    | {1, 2, 2}                           | 5        |
    | {1, 2, 2, 6, 99, 99, 7}             | 5        |
    | {1, 1, 6, 7, 2}                     | 4        |
    | {1, 6, 2, 2, 7, 1, 6, 99, 99, 7}    | 2        |
    | {1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7} | 2        |
    | {2, 7, 6, 2, 6, 7, 2, 7}            | 18       |
    | {2, 7, 6, 2, 6, 2, 7}               | 9        |
    | {1, 6, 7, 7}                        | 8        |
    | {6, 7, 1, 6, 7, 7}                  | 8        |
    | {6, 8, 1, 6, 7}                     | 0        |
    | {}                                  | 0        |
    | {6, 7, 11}                          | 11       |
    | {11, 6, 7, 11}                      | 22       |
    | {2, 2, 6, 7, 7}                     | 11       |
    |_____________________________________|_________*/

    public static final int sum67(int[] nums)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _Sum67.Validate(true);  // pass 'false' to print failed tests only.
    }
}
