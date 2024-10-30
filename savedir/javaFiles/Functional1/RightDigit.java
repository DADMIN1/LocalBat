package Functional1;
import Functional1.Testcases._RightDigit;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://codingbat.com/prob/p152194
// Difficulty: 220

public final class RightDigit
{
    /* Given a list of non-negative integers, return an integer list of the rightmost digits. 
    (Note: use %) */

    /*___________________________________________________
    |                     Testcases                      |
    |____________________________________________________|
    | nums (List<Integer>)             | expected        |
    |                                  | (List<Integer>) |
    |__________________________________|_________________|
    | new ArrayList<>(Arrays.asList(1  | 22              |
    | new ArrayList<>(Arrays.asList(16 | 8               |
    | new ArrayList<>(Arrays.asList(10 | 0))             |
    | new ArrayList<>(Arrays.asList()) | Arrays.asList() |
    | new ArrayList<>(Arrays.asList(5  | 10))            |
    | new ArrayList<>(Arrays.asList(5  | 50              |
    | new ArrayList<>(Arrays.asList(6  | 23              |
    |__________________________________|________________*/

    public static final List<Integer> rightDigit(List<Integer> nums)
    {
        return new ArrayList<Integer>();
    }

    public static final void main(String[] args) {
        _RightDigit.Validate(true);  // pass 'false' to print failed tests only.
    }
}
