package Functional2;
import Functional2.Testcases._No9;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p124510
// Difficulty: 203

public final class No9
{
    /* Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. 
    (Note: % by 10) */

    /*___________________________________________________
    |                     Testcases                      |
    |____________________________________________________|
    |     nums (List<Integer>)     |       returns       |
    |                              |   (List<Integer>)   |
    |______________________________|_____________________|
    | [1, 2, 19]                   | [1, 2]              |
    | [9, 19, 29, 3]               | [3]                 |
    | [1, 2, 3]                    | [1, 2, 3]           |
    | [45, 99, 90, 28, 13, 999, 0] | [45, 90, 28, 13, 0] |
    | []                           | []                  |
    | [9]                          | []                  |
    | [0, 9, 0]                    | [0, 0]              |
    |______________________________|____________________*/

    public static final List<Integer> no9(List<Integer> nums)
    {
        return new ArrayList<Integer>();
    }

    public static final void main(String[] args) {
        //_No9.printSuccesses = false;  // set 'false' to print failing tests only.
        //_No9.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _No9.Validate();
    }
}
