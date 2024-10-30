package Functional1;
import Functional1.Testcases._Math1;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p103869
// Difficulty: 215

public final class Math1
{
    /* Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10. */

    /*________________________________________________________
    |                        Testcases                        |
    |_________________________________________________________|
    | nums (List<Integer>)               | expected           |
    |                                    | (List<Integer>)    |
    |____________________________________|____________________|
    | new ArrayList<>(Arrays.asList(1    | 2                  |
    | new ArrayList<>(Arrays.asList(6    | 8                  |
    | new ArrayList<>(Arrays.asList(10)) | Arrays.asList(110) |
    | new ArrayList<>(Arrays.asList())   | Arrays.asList()    |
    | new ArrayList<>(Arrays.asList(5    | 10))               |
    | new ArrayList<>(Arrays.asList(-1   | -2                 |
    | new ArrayList<>(Arrays.asList(6    | -3                 |
    |____________________________________|___________________*/

    public static final List<Integer> math1(List<Integer> nums)
    {
        return new ArrayList<Integer>();
    }

    public static final void main(String[] args) {
        _Math1.Validate(true);  // pass 'false' to print failed tests only.
    }
}
