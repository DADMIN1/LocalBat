package Functional2;
import Functional2.Testcases._NoTeen;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p137274
// Difficulty: 203

public final class NoTeen
{
    /* Given a list of integers, return a list of those numbers, 
    omitting any that are between 13 and 19 inclusive. */

    /*__________________________________________
    |                 Testcases                 |
    |___________________________________________|
    |   nums (List<Integer>)  |     returns     |
    |                         | (List<Integer>) |
    |_________________________|_________________|
    | [12, 13, 19, 20]        | [12, 20]        |
    | [1, 14, 1]              | [1, 1]          |
    | [15]                    | []              |
    | [-15]                   | [-15]           |
    | []                      | []              |
    | [0, 1, 2, -3]           | [0, 1, 2, -3]   |
    | [15, 17, 19, 21, 19]    | [21]            |
    | [-16, 2, 15, 3, 16, 25] | [-16, 2, 3, 25] |
    |_________________________|________________*/

    public static final List<Integer> noTeen(List<Integer> nums)
    {
        return new ArrayList<Integer>();
    }

    public static final void main(String[] args) {
        _NoTeen.Validate(true);  // pass 'false' to print failed tests only.
    }
}
