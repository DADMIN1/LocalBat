package Array3;
import Array3.Testcases._MaxSpan;

// https://codingbat.com/prob/p189576
// Difficulty: 303.0

public final class MaxSpan
{
    /* Consider the leftmost and righmost appearances of some value in an array. 
    We'll say that the "span" is the number of elements between the two inclusive. 
    A single value has a span of 1. Returns the largest span found in the given array. 
    (Efficiency is not a priority.) */

    /*________________________________
    |            Testcases            |
    |_________________________________|
    |      nums (int[])     | returns |
    |                       |  (int)  |
    |_______________________|_________|
    | {1, 2, 1, 1, 3}       |    4    |
    | {1, 4, 2, 1, 4, 1, 4} |    6    |
    | {1, 4, 2, 1, 4, 4, 4} |    6    |
    | {3, 3, 3}             |    3    |
    | {3, 9, 3}             |    3    |
    | {3, 9, 9}             |    2    |
    | {3, 9}                |    1    |
    | {3, 3}                |    2    |
    | {}                    |    0    |
    | {1}                   |    1    |
    |_______________________|________*/

    public static final int maxSpan(int[] nums)
    {
        return 0;
    }

    public static final void main(String[] args) {
        //_MaxSpan.printSuccesses = false;  // set 'false' to print failing tests only.
        //_MaxSpan.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _MaxSpan.Validate();
    }
}
