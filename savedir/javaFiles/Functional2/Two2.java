package Functional2;
import Functional2.Testcases._Two2;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p148198
// Difficulty: 223

public final class Two2
{
    /* Given a list of non-negative integers, return a list of those numbers multiplied by 2, 
    omitting any of the resulting numbers that end in 2. */

    /*_________________________________________
    |                Testcases                 |
    |__________________________________________|
    |  nums (List<Integer>)  |     returns     |
    |                        | (List<Integer>) |
    |________________________|_________________|
    | [1, 2, 3]              | [4, 6]          |
    | [2, 6, 11]             | [4]             |
    | [0]                    | [0]             |
    | []                     | []              |
    | [1, 11, 111, 16]       | []              |
    | [2, 3, 5, 7, 11]       | [4, 6, 10, 14]  |
    | [3, 1, 4, 1, 6, 99, 0] | [6, 8, 198, 0]  |
    |________________________|________________*/

    public static final List<Integer> two2(List<Integer> nums)
    {
        return new ArrayList<Integer>();
    }

    public static final void main(String[] args) {
        _Two2.Validate(true);  // pass 'false' to print failed tests only.
    }
}
