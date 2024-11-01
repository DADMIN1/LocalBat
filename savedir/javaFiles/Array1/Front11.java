package Array1;
import Array1.Testcases._Front11;

// https://codingbat.com/prob/p128270
// Difficulty: 181.0

public final class Front11
{
    /* Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. 
    If either array is length 0, ignore that array. */

    /*______________________________________
    |               Testcases               |
    |_______________________________________|
    |  a (int[])   |  b (int[])   | returns |
    |              |              | (int[]) |
    |______________|______________|_________|
    | {1, 2, 3}    | {7, 9, 8}    | {1, 7}  |
    | {1}          | {2}          | {1, 2}  |
    | {1, 7}       | {}           | {1}     |
    | {}           | {2, 8}       | {2}     |
    | {}           | {}           | {}      |
    | {3}          | {1, 4, 1, 9} | {3, 1}  |
    | {1, 4, 1, 9} | {}           | {1}     |
    |______________|______________|________*/

    public static final int[] front11(int[] a, int[] b)
    {
        return new int[]{0};
    }

    public static final void main(String[] args) {
        _Front11.Validate(true);  // pass 'false' to print failed tests only.
    }
}
