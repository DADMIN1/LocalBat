package Warmup2;
import Warmup2.Testcases._CountXX;

// https://codingbat.com/prob/p194667
// Difficulty: 207.0

public final class CountXX
{
    /* Count the number of "xx" in the given string. We'll say that overlapping is allowed, 
    so "xxx" contains 2 "xx". */

    /*________________________
    |        Testcases        |
    |_________________________|
    |  str (String) | returns |
    |               |  (int)  |
    |_______________|_________|
    |    "abcxx"    |    1    |
    |     "xxx"     |    2    |
    |     "xxxx"    |    3    |
    |     "abc"     |    0    |
    | "Hello there" |    0    |
    | "Hexxo thxxe" |    2    |
    |       ""      |    0    |
    |   "Kittens"   |    0    |
    |  "Kittensxxx" |    2    |
    |_______________|________*/

    public static final int countXX(String str)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _CountXX.Validate(true);  // pass 'false' to print failed tests only.
    }
}
