package Functional1;
import Functional1.Testcases._Math1;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p103869
// Difficulty: 215

public final class Math1
{
    /* Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10. */

    /*___________________________________________________________________________________________
    |                                         Testcases                                          |
    |____________________________________________________________________________________________|
    |          nums (List<Integer>)          |              returns (List<Integer>)              |
    |________________________________________|___________________________________________________|
    | [1, 2, 3]                              | [20, 30, 40]                                      |
    | [6, 8, 6, 8, 1]                        | [70, 90, 70, 90, 20]                              |
    | [10]                                   | [110]                                             |
    | []                                     | []                                                |
    | [5, 10]                                | [60, 110]                                         |
    | [-1, -2, -3, -2, -1]                   | [0, -10, -20, -10, 0]                             |
    | [6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2] | [70, -20, 130, 240, 50, 20, 200, 120, 30, 40, 30] |
    |________________________________________|__________________________________________________*/

    public static final List<Integer> math1(List<Integer> nums)
    {
        return new ArrayList<Integer>();
    }

    public static final void main(String[] args) {
        //_Math1.printSuccesses = false;  // set 'false' to print failing tests only.
        //_Math1.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _Math1.Validate();
    }
}
