// https://codingbat.com/prob/p182879
package Logic2;
import Logic2.Testcases._NoTeenSum;

public class NoTeenSum
{
    /* Given 3 int values, a b c, return their sum. However, 
    if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, 
    except 15 and 16 do not count as a teens. 
    Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule. 
    In this way, you avoid repeating the teen code 3 times (i.e. 
    "decomposition"). Define the helper below and at the same indent level as the main noTeenSum(). */

    /*________________________
    |        Testcases        |
    |_________________________|
    | noTeenSum(1, 2, 3)  → 6 |
    | noTeenSum(2, 13, 1) → 3 |
    | noTeenSum(2, 1, 14) → 3 |
    |________________________*/

    public static int noTeenSum(int a, int b, int c)
    {
        
    }

    public static void main(String[] args) {
        _NoTeenSum.Validate(true);  // pass 'false' to print failed tests only.
    }
}
