package String2;
import String2.Testcases._PrefixAgain;

// https://codingbat.com/prob/p136417
// Difficulty: 239.0

public final class PrefixAgain
{
    /* Given a string, consider the prefix string made of the first N chars of the string. 
    Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length(). */

    /*____________________________________________
    |                  Testcases                  |
    |_____________________________________________|
    | prefixAgain("abXYabc", 1)           → true  |
    | prefixAgain("abXYabc", 2)           → true  |
    | prefixAgain("abXYabc", 3)           → false |
    | prefixAgain("xyzxyxyxy", 2)         → true  |
    | prefixAgain("xyzxyxyxy", 3)         → false |
    | prefixAgain("Hi12345Hi6789Hi10", 1) → true  |
    | prefixAgain("Hi12345Hi6789Hi10", 2) → true  |
    | prefixAgain("Hi12345Hi6789Hi10", 3) → true  |
    | prefixAgain("Hi12345Hi6789Hi10", 4) → false |
    | prefixAgain("a", 1)                 → false |
    | prefixAgain("aa", 1)                → true  |
    | prefixAgain("ab", 1)                → false |
    |____________________________________________*/

    public static final boolean prefixAgain(String str, int n)
    {
        return false;
    }

    public static final void main(String[] args) {
        _PrefixAgain.Validate(true);  // pass 'false' to print failed tests only.
    }
}
