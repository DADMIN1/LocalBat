package String3;
import String3.Testcases._MaxBlock;

// https://codingbat.com/prob/p179479
// Difficulty: 327.0

public final class MaxBlock
{
    /* Given a string, return the length of the largest "block" in the string. 
    A block is a run of adjacent chars that are the same. */

    /*_______________________________
    |           Testcases            |
    |________________________________|
    | str (String)        | expected |
    |                     | (int)    |
    |_____________________|__________|
    | "hoopla"            | 2        |
    | "abbCCCddBBBxx"     | 3        |
    | ""                  | 0        |
    | "xyz"               | 1        |
    | "xxyz"              | 2        |
    | "xyzz"              | 2        |
    | "abbbcbbbxbbbx"     | 3        |
    | "XXBBBbbxx"         | 3        |
    | "XXBBBBbbxx"        | 4        |
    | "XXBBBbbxxXXXX"     | 4        |
    | "XX2222BBBbbXX2222" | 4        |
    |_____________________|_________*/

    public static final int maxBlock(String str)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _MaxBlock.Validate(true);  // pass 'false' to print failed tests only.
    }
}
