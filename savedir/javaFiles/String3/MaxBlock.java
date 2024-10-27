package String3;
import String3.Testcases._MaxBlock;

// https://codingbat.com/prob/p179479
// Difficulty: 327.0

public final class MaxBlock
{
    /* Given a string, return the length of the largest "block" in the string. 
    A block is a run of adjacent chars that are the same. */

    /*__________________________________
    |             Testcases             |
    |___________________________________|
    | maxBlock("hoopla")            → 2 |
    | maxBlock("abbCCCddBBBxx")     → 3 |
    | maxBlock("")                  → 0 |
    | maxBlock("xyz")               → 1 |
    | maxBlock("xxyz")              → 2 |
    | maxBlock("xyzz")              → 2 |
    | maxBlock("abbbcbbbxbbbx")     → 3 |
    | maxBlock("XXBBBbbxx")         → 3 |
    | maxBlock("XXBBBBbbxx")        → 4 |
    | maxBlock("XXBBBbbxxXXXX")     → 4 |
    | maxBlock("XX2222BBBbbXX2222") → 4 |
    |__________________________________*/

    public static final int maxBlock(String str)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _MaxBlock.Validate(true);  // pass 'false' to print failed tests only.
    }
}
