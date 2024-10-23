// https://codingbat.com/prob/p134022
package Array3;
import Array3.Testcases._LinearIn;

public class LinearIn
{
    /* Given two arrays of ints sorted in increasing order, outer and inner, 
    return true if all of the numbers in inner appear in outer. 
    The best solution makes only a single "linear" pass of both arrays, 
    taking advantage of the fact that both arrays are already in sorted order. */

    /*__________________________________________
    |                 Testcases                 |
    |___________________________________________|
    | linearIn([1, 2, 4, 6], [2, 4])    → true  |
    | linearIn([1, 2, 4, 6], [2, 3, 4]) → false |
    | linearIn([1, 2, 4, 4, 6], [2, 4]) → true  |
    |__________________________________________*/

    public static boolean linearIn(int[] outer, int[] inner)
    {
        
    }

    public static void main(String[] args) {
        _LinearIn.Validate(true);  // pass 'false' to print failed tests only.
    }
}
