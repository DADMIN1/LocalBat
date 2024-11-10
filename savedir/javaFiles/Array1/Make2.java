package Array1;
import Array1.Testcases._Make2;

// https://codingbat.com/prob/p143461
// Difficulty: 178.0

public final class Make2
{
    /* Given 2 int arrays, a and b, return a new array length 2 containing, 
    as much as will fit, the elements from a followed by the elements from b. 
    The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays. */

    /*________________________________
    |            Testcases            |
    |_________________________________|
    | a (int[]) | b (int[]) | returns |
    |           |           | (int[]) |
    |___________|___________|_________|
    | {4, 5}    | {1, 2, 3} | {4, 5}  |
    | {4}       | {1, 2, 3} | {4, 1}  |
    | {}        | {1, 2}    | {1, 2}  |
    | {1, 2}    | {}        | {1, 2}  |
    | {3}       | {1, 2, 3} | {3, 1}  |
    | {3}       | {1}       | {3, 1}  |
    | {3, 1, 4} | {}        | {3, 1}  |
    | {1}       | {1}       | {1, 1}  |
    | {1, 2, 3} | {7, 8}    | {1, 2}  |
    | {7, 8}    | {1, 2, 3} | {7, 8}  |
    | {7}       | {1, 2, 3} | {7, 1}  |
    | {5, 4}    | {2, 3, 7} | {5, 4}  |
    |___________|___________|________*/

    public static final int[] make2(int[] a, int[] b)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        //_Make2.printSuccesses = false;  // set 'false' to print failing tests only.
        //_Make2.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _Make2.Validate();
    }
}
