// https://codingbat.com/prob/p130788
package Logic2;
import Logic2.Testcases._LuckySum;

public class LuckySum
{
    /* Given 3 int values, a b c, return their sum. However, 
    if one of the values is 13 then it does not count towards the sum and values to its right do not count. 
    So for example, if b is 13, then both b and c do not count. */

    /*________________________
    |       Testcases        |
    __________________________
    | luckySum(1, 2, 3)  → 6 |
    | luckySum(1, 2, 13) → 3 |
    | luckySum(1, 13, 3) → 1 |
    ________________________*/

    public static int luckySum(int a, int b, int c)
    {
        
    }

    public static void main(String[] args) {
        _LuckySum.Validate(true);  // pass 'false' to print failed tests only.
    }
}
