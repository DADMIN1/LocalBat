package AP1;
import AP1.Testcases._ScoresClump;

// https://codingbat.com/prob/p194530
// Difficulty: 209.0

public class ScoresClump
{
    /* Given an array of scores sorted in increasing order, 
    return true if the array contains 3 adjacent scores that differ from each other by at most 2, 
    such as with {3, 4, 5} or {3, 5, 5}. */

    /*_____________________________________
    |              Testcases               |
    |______________________________________|
    | scoresClump([3, 4, 5])       → true  |
    | scoresClump([3, 4, 6])       → false |
    | scoresClump([1, 3, 5, 5])    → true  |
    | scoresClump([2, 4, 5, 6])    → true  |
    | scoresClump([2, 4, 5, 7])    → false |
    | scoresClump([2, 4, 4, 7])    → true  |
    | scoresClump([3, 3, 6, 7, 9]) → false |
    | scoresClump([3, 3, 7, 7, 9]) → true  |
    | scoresClump([4, 5, 8])       → false |
    |_____________________________________*/

    public static boolean scoresClump(int[] scores)
    {
        return false;
    }

    public static void main(String[] args) {
        _ScoresClump.Validate(true);  // pass 'false' to print failed tests only.
    }
}
