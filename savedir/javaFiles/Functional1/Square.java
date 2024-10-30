package Functional1;
import Functional1.Testcases._Square;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p139586
// Difficulty: 203

public final class Square
{
    /* Given a list of integers, return a list where each integer is multiplied with itself. */

    /*________________________________________________________
    |                        Testcases                        |
    |_________________________________________________________|
    | nums (List<Integer>)               | expected           |
    |                                    | (List<Integer>)    |
    |____________________________________|____________________|
    | new ArrayList<>(Arrays.asList(1    | 2                  |
    | new ArrayList<>(Arrays.asList(6    | 8                  |
    | new ArrayList<>(Arrays.asList())   | Arrays.asList()    |
    | new ArrayList<>(Arrays.asList(12)) | Arrays.asList(144) |
    | new ArrayList<>(Arrays.asList(5    | 10))               |
    | new ArrayList<>(Arrays.asList(6    | -3                 |
    |____________________________________|___________________*/

    public static final List<Integer> square(List<Integer> nums)
    {
        return new ArrayList<Integer>();
    }

    public static final void main(String[] args) {
        _Square.Validate(true);  // pass 'false' to print failed tests only.
    }
}
