package Logic2;
import Logic2.Testcases._NoTeenSum;

// https://codingbat.com/prob/p182879
// Difficulty: 212.0

public final class NoTeenSum
{
    /* Given 3 int values, a b c, return their sum. However, 
    if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, 
    except 15 and 16 do not count as a teens. 
    Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule. 
    In this way, you avoid repeating the teen code 3 times (i.e. 
    "decomposition"). Define the helper below and at the same indent level as the main noTeenSum(). */

    /*______________________________________
    |               Testcases               |
    |_______________________________________|
    | a (int) | b (int) | c (int) | returns |
    |         |         |         |  (int)  |
    |_________|_________|_________|_________|
    |    1    |    2    |    3    |    6    |
    |    2    |    13   |    1    |    3    |
    |    2    |    1    |    14   |    3    |
    |    2    |    1    |    15   |    18   |
    |    2    |    1    |    16   |    19   |
    |    2    |    1    |    17   |    3    |
    |    17   |    1    |    2    |    3    |
    |    2    |    15   |    2    |    19   |
    |    16   |    17   |    18   |    16   |
    |    17   |    18   |    19   |    0    |
    |    15   |    16   |    1    |    32   |
    |    15   |    15   |    19   |    30   |
    |    15   |    19   |    16   |    31   |
    |    5    |    17   |    18   |    5    |
    |    17   |    18   |    16   |    16   |
    |    17   |    19   |    18   |    0    |
    |_________|_________|_________|________*/

    public static final int noTeenSum(int a, int b, int c)
    {
        return 0;
    }

    public static final void main(String[] args) {
        //_NoTeenSum.printSuccesses = false;  // set 'false' to print failing tests only.
        //_NoTeenSum.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _NoTeenSum.Validate();
    }
}
