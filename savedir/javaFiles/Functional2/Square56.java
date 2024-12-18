package Functional2;
import Functional2.Testcases._Square56;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p132748
// Difficulty: 226

public final class Square56
{
    /* Given a list of integers, return a list of those numbers squared and the product added to 10, 
    omitting any of the resulting numbers that end in 5 or 6. */

    /*_________________________________________
    |                Testcases                 |
    |__________________________________________|
    |  nums (List<Integer>) |     returns      |
    |                       | (List<Integer>)  |
    |_______________________|__________________|
    | [3, 1, 4]             | [19, 11]         |
    | [1]                   | [11]             |
    | [2]                   | [14]             |
    | [3]                   | [19]             |
    | [4]                   | []               |
    | [5]                   | []               |
    | [6]                   | []               |
    | [7]                   | [59]             |
    | [1, 2, 3, 4, 5, 6, 7] | [11, 14, 19, 59] |
    | [3, -1, -4, 1, 5, 9]  | [19, 11, 11, 91] |
    |_______________________|_________________*/

    public static final List<Integer> square56(List<Integer> nums)
    {
        return new ArrayList<Integer>();
    }

    public static final void main(String[] args) {
        //_Square56.printSuccesses = false;  // set 'false' to print failing tests only.
        //_Square56.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _Square56.Validate();
    }
}
