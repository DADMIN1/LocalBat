package Array2;
import Array2.Testcases._HaveThree;

// https://codingbat.com/prob/p109783
// Difficulty: 254.0

public final class HaveThree
{
    /* Given an array of ints, return true if the value 3 appears in the array exactly 3 times, 
    and no 3's are next to each other. */

    /*_______________________________________
    |               Testcases                |
    |________________________________________|
    | nums (int[])               | expected  |
    |                            | (boolean) |
    |____________________________|___________|
    | { 3, 1, 3, 1, 3 }          | true      |
    | { 3, 1, 3, 3 }             | false     |
    | { 3, 4, 3, 3, 4 }          | false     |
    | { 1, 3, 1, 3, 1, 2 }       | false     |
    | { 1, 3, 1, 3, 1, 3 }       | true      |
    | { 1, 3, 3, 1, 3 }          | false     |
    | { 1, 3, 1, 3, 1, 3, 4, 3 } | false     |
    | { 3, 4, 3, 4, 3, 4, 4 }    | true      |
    | { 3, 3, 3 }                | false     |
    | { 1, 3 }                   | false     |
    | { 3 }                      | false     |
    | { 1 }                      | false     |
    |____________________________|__________*/

    public static final boolean haveThree(int[] nums)
    {
        return false;
    }

    public static final void main(String[] args) {
        _HaveThree.Validate(true);  // pass 'false' to print failed tests only.
    }
}
