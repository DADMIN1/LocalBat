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

    /*______________________________________________________
    |                       Testcases                       |
    |_______________________________________________________|
    | nums (List<Integer>)              | expected          |
    |                                   | (List<Integer>)   |
    |___________________________________|___________________|
    | new ArrayList<>(Arrays.asList(1   | 2                 |
    | new ArrayList<>(Arrays.asList(6   | 8                 |
    | new ArrayList<>(Arrays.asList())  | Arrays.asList()   |
    | new ArrayList<>(Arrays.asList(5)) | Arrays.asList(10) |
    | new ArrayList<>(Arrays.asList(5   | 10))              |
    | new ArrayList<>(Arrays.asList(8   | -5                |
    | new ArrayList<>(Arrays.asList(6   | -3                |
    | new ArrayList<>(Arrays.asList(3   | 1                 |
    |___________________________________|__________________*/

    public static final List<Integer> doubling(List<Integer> nums)
    {
        return new ArrayList<Integer>();
    }

    public static final void main(String[] args) {
        _Doubling.Validate(true);  // pass 'false' to print failed tests only.
    }
}
