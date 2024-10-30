package Array2;
import Array2.Testcases._FizzArray3;

// https://codingbat.com/prob/p142539
// Difficulty: 265

public final class FizzArray3
{
    /* Given start and end numbers, return a new array containing the sequence of integers from start up to but not including end, 
    so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the start number. 
    Note that a length-0 array is valid. (See also: FizzBuzz Code) */

    /*_______________________________________________
    |                   Testcases                    |
    |________________________________________________|
    | start | end   | expected (int[])               |
    | (int) | (int) |                                |
    |_______|_______|________________________________|
    | 5     | 10    | {5, 6, 7, 8, 9}                |
    | 11    | 18    | {11, 12, 13, 14, 15, 16, 17}   |
    | 1     | 3     | {1, 2}                         |
    | 1     | 2     | {1}                            |
    | 1     | 1     | {}                             |
    | 1000  | 1005  | {1000, 1001, 1002, 1003, 1004} |
    |_______|_______|_______________________________*/

    public static final int[] fizzArray3(int start, int end)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        _FizzArray3.Validate(true);  // pass 'false' to print failed tests only.
    }
}
