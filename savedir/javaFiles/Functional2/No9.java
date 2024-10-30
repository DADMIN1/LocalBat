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

    /*____________________________________________________
    |                      Testcases                      |
    |_____________________________________________________|
    | nums (List<Integer>)              | expected        |
    |                                   | (List<Integer>) |
    |___________________________________|_________________|
    | new ArrayList<>(Arrays.asList(1   | 2               |
    | new ArrayList<>(Arrays.asList(9   | 19              |
    | new ArrayList<>(Arrays.asList(1   | 2               |
    | new ArrayList<>(Arrays.asList(45  | 99              |
    | new ArrayList<>(Arrays.asList())  | Arrays.asList() |
    | new ArrayList<>(Arrays.asList(9)) | Arrays.asList() |
    | new ArrayList<>(Arrays.asList(0   | 9               |
    |___________________________________|________________*/

    public static final List<Integer> no9(List<Integer> nums)
    {
        return new ArrayList<Integer>();
    }

    public static final void main(String[] args) {
        _No9.Validate(true);  // pass 'false' to print failed tests only.
    }
}
