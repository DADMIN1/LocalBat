package Array2;
import Array2.Testcases._FizzArray;

// https://codingbat.com/prob/p180920
// Difficulty: 230

public final class FizzArray
{
    /* Given a number n, create and return a new int array of length n, 
    containing the numbers 0, 1, 2, ... n-1. The given n may be 0, 
    in which case just return a length 0 array. 
    You do not need a separate if-statement for the length-0 case; the for-loop should naturally execute 0 times in that case, 
    so it just works. The syntax to make a new int array is: 
    new int[desired_length]   (See also: FizzBuzz Code) */

    /*_________________________________________
    |                Testcases                 |
    |__________________________________________|
    | n (int) |        returns (int[])         |
    |_________|________________________________|
    |    4    | {0, 1, 2, 3}                   |
    |    1    | {0}                            |
    |    10   | {0, 1, 2, 3, 4, 5, 6, 7, 8, 9} |
    |    0    | {}                             |
    |    2    | {0, 1}                         |
    |    7    | {0, 1, 2, 3, 4, 5, 6}          |
    |_________|_______________________________*/

    public static final int[] fizzArray(int n)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        //_FizzArray.printSuccesses = false;  // set 'false' to print failing tests only.
        //_FizzArray.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _FizzArray.Validate();
    }
}
