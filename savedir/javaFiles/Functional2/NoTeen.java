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

    /*_________________________________________________________
    |                        Testcases                         |
    |__________________________________________________________|
    | nums (List<Integer>)                | expected           |
    |                                     | (List<Integer>)    |
    |_____________________________________|____________________|
    | new ArrayList<>(Arrays.asList(12    | 13                 |
    | new ArrayList<>(Arrays.asList(1     | 14                 |
    | new ArrayList<>(Arrays.asList(15))  | Arrays.asList()    |
    | new ArrayList<>(Arrays.asList(-15)) | Arrays.asList(-15) |
    | new ArrayList<>(Arrays.asList())    | Arrays.asList()    |
    | new ArrayList<>(Arrays.asList(0     | 1                  |
    | new ArrayList<>(Arrays.asList(15    | 17                 |
    | new ArrayList<>(Arrays.asList(-16   | 2                  |
    |_____________________________________|___________________*/

    public static final List<Integer> noTeen(List<Integer> nums)
    {
        return new ArrayList<Integer>();
    }

    public static final void main(String[] args) {
        _NoTeen.Validate(true);  // pass 'false' to print failed tests only.
    }
}
