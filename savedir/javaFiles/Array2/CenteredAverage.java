package Array2;
import Array2.Testcases._CenteredAverage;

// https://codingbat.com/prob/p136585
// Difficulty: 209.0

public final class CenteredAverage
{
    /* Return the "centered" average of an array of ints, which we'll say is the mean average of the values, 
    except ignoring the largest and smallest values in the array. 
    If there are multiple copies of the smallest value, ignore just one copy, 
    and likewise for the largest value. Use int division to produce the final average. 
    You may assume that the array is length 3 or more. */

    /*___________________________________
    |             Testcases              |
    |____________________________________|
    |       nums (int[])       | returns |
    |                          |  (int)  |
    |__________________________|_________|
    | {1, 2, 3, 4, 100}        |    3    |
    | {1, 1, 5, 5, 10, 8, 7}   |    5    |
    | {-10, -4, -2, -4, -2, 0} |    -3   |
    | {5, 3, 4, 6, 2}          |    4    |
    | {5, 3, 4, 0, 100}        |    4    |
    | {100, 0, 5, 3, 4}        |    4    |
    | {4, 0, 100}              |    4    |
    | {0, 2, 3, 4, 100}        |    3    |
    | {1, 1, 100}              |    1    |
    | {7, 7, 7}                |    7    |
    | {1, 7, 8}                |    7    |
    | {1, 1, 99, 99}           |    50   |
    | {1000, 0, 1, 99}         |    50   |
    | {4, 4, 4, 4, 5}          |    4    |
    | {4, 4, 4, 1, 5}          |    4    |
    | {6, 4, 8, 12, 3}         |    6    |
    |__________________________|________*/

    public static final int centeredAverage(int[] nums)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _CenteredAverage.Validate(true);  // pass 'false' to print failed tests only.
    }
}
