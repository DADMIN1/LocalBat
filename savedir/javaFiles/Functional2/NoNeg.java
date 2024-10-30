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

    /*___________________________________________________
    |                     Testcases                      |
    |____________________________________________________|
    | nums (List<Integer>)             | expected        |
    |                                  | (List<Integer>) |
    |__________________________________|_________________|
    | new ArrayList<>(Arrays.asList(1  | -2))            |
    | new ArrayList<>(Arrays.asList(-3 | -3              |
    | new ArrayList<>(Arrays.asList(-1 | -1              |
    | new ArrayList<>(Arrays.asList()) | Arrays.asList() |
    | new ArrayList<>(Arrays.asList(0  | 1               |
    | new ArrayList<>(Arrays.asList(3  | -10             |
    | new ArrayList<>(Arrays.asList(-1 | 3               |
    |__________________________________|________________*/

    public static final List<Integer> noNeg(List<Integer> nums)
    {
        return new ArrayList<Integer>();
    }

    public static final void main(String[] args) {
        _NoNeg.Validate(true);  // pass 'false' to print failed tests only.
    }
}
