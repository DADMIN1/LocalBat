package Functional2;
import Functional2.Testcases._NoNeg;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p103456
// Difficulty: 200

public final class NoNeg
{
    /* Given a list of integers, return a list of the integers, 
    omitting any that are less than 0. */

    /*_____________________________________________________
    |                      Testcases                       |
    |______________________________________________________|
    | nums (List<Integer>)               | expected        |
    |                                    | (List<Integer>) |
    |____________________________________|_________________|
    | [1, -2]                            | [1]             |
    | [-3, -3, 3, 3]                     | [3, 3]          |
    | [-1, -1, -1]                       | []              |
    | []                                 | []              |
    | [0, 1, 2]                          | [0, 1, 2]       |
    | [3, -10, 1, -1, 4, -400]           | [3, 1, 4]       |
    | [-1, 3, 1, -1, -10, -100, -111, 5] | [3, 1, 5]       |
    |____________________________________|________________*/

    public static final List<Integer> noNeg(List<Integer> nums)
    {
        return new ArrayList<Integer>();
    }

    public static final void main(String[] args) {
        _NoNeg.Validate(true);  // pass 'false' to print failed tests only.
    }
}
