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

    /*_____________________________________________________
    |                      Testcases                       |
    |______________________________________________________|
    | nums (List<Integer>)              | expected         |
    |                                   | (List<Integer>)  |
    |___________________________________|__________________|
    | new ArrayList<>(Arrays.asList(1   | 2                |
    | new ArrayList<>(Arrays.asList(2   | 6                |
    | new ArrayList<>(Arrays.asList(0)) | Arrays.asList(0) |
    | new ArrayList<>(Arrays.asList())  | Arrays.asList()  |
    | new ArrayList<>(Arrays.asList(1   | 11               |
    | new ArrayList<>(Arrays.asList(2   | 3                |
    | new ArrayList<>(Arrays.asList(3   | 1                |
    |___________________________________|_________________*/

    public static final List<Integer> two2(List<Integer> nums)
    {
        return new ArrayList<Integer>();
    }

    public static final void main(String[] args) {
        _Two2.Validate(true);  // pass 'false' to print failed tests only.
    }
}
