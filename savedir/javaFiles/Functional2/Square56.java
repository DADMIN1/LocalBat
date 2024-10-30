package Functional2;
import Functional2.Testcases._Square56;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p132748
// Difficulty: 226

public final class Square56
{
    /* Given a list of integers, return a list of those numbers squared and the product added to 10, 
    omitting any of the resulting numbers that end in 5 or 6. */

    /*______________________________________________________
    |                       Testcases                       |
    |_______________________________________________________|
    | nums (List<Integer>)              | expected          |
    |                                   | (List<Integer>)   |
    |___________________________________|___________________|
    | new ArrayList<>(Arrays.asList(3   | 1                 |
    | new ArrayList<>(Arrays.asList(1)) | Arrays.asList(11) |
    | new ArrayList<>(Arrays.asList(2)) | Arrays.asList(14) |
    | new ArrayList<>(Arrays.asList(3)) | Arrays.asList(19) |
    | new ArrayList<>(Arrays.asList(4)) | Arrays.asList()   |
    | new ArrayList<>(Arrays.asList(5)) | Arrays.asList()   |
    | new ArrayList<>(Arrays.asList(6)) | Arrays.asList()   |
    | new ArrayList<>(Arrays.asList(7)) | Arrays.asList(59) |
    | new ArrayList<>(Arrays.asList(1   | 2                 |
    | new ArrayList<>(Arrays.asList(3   | -1                |
    |___________________________________|__________________*/

    public static final List<Integer> square56(List<Integer> nums)
    {
        return new ArrayList<Integer>();
    }

    public static final void main(String[] args) {
        _Square56.Validate(true);  // pass 'false' to print failed tests only.
    }
}
