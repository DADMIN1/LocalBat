// https://codingbat.com/prob/p199484
package Array2;
import Array2.Testcases._TenRun;

public class TenRun
{
    /* For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, 
    until encountering another multiple of 10. So {2, 10, 3, 
    4, 20, 5} yields {2, 10, 10, 10, 20, 20}. */

    /*________________________________________________________
    |                       Testcases                        |
    __________________________________________________________
    | tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20] |
    | tenRun([10, 1, 20, 2])       → [10, 10, 20, 20]        |
    | tenRun([10, 1, 9, 20])       → [10, 10, 10, 20]        |
    ________________________________________________________*/

    public static int[] tenRun(int[] nums)
    {
        
    }

    public static void main(String[] args) {
        _TenRun.Validate(true);  // pass 'false' to print failed tests only.
    }
}
