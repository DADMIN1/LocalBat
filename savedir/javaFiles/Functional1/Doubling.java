package Functional1;
import Functional1.Testcases._Doubling;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p117665
// Difficulty: 200

public final class Doubling
{
    /* Given a list of integers, return a list where each integer is multiplied by 2. */

    /*_________________________________________________________________________________
    |                                    Testcases                                     |
    |__________________________________________________________________________________|
    | nums (List<Integer>)                   | expected (List<Integer>)                |
    |________________________________________|_________________________________________|
    | [1, 2, 3]                              | [2, 4, 6]                               |
    | [6, 8, 6, 8, -1]                       | [12, 16, 12, 16, -2]                    |
    | []                                     | []                                      |
    | [5]                                    | [10]                                    |
    | [5, 10]                                | [10, 20]                                |
    | [8, -5, 7, 3, 109]                     | [16, -10, 14, 6, 218]                   |
    | [6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2] | [12, -6, 24, 46, 8, 2, 38, 22, 4, 6, 4] |
    | [3, 1, 4, 1, 5, 9]                     | [6, 2, 8, 2, 10, 18]                    |
    |________________________________________|________________________________________*/

    public static final List<Integer> doubling(List<Integer> nums)
    {
        return new ArrayList<Integer>();
    }

    public static final void main(String[] args) {
        _Doubling.Validate(true);  // pass 'false' to print failed tests only.
    }
}
