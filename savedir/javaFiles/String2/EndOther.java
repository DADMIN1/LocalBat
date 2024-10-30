package String2;
import String2.Testcases._EndOther;

// https://codingbat.com/prob/p126880
// Difficulty: 215.0

public final class EndOther
{
    /* Given two strings, return true if either of the strings appears at the very end of the other string, 
    ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). 
    Note: str.toLowerCase() returns the lowercase version of a string. */

    /*________________________________
    |            Testcases            |
    |_________________________________|
    | a        | b        | expected  |
    | (String) | (String) | (boolean) |
    |__________|__________|___________|
    | "Hiabc"  | "abc"    | true      |
    | "AbC"    | "HiaBc"  | true      |
    | "abc"    | "abXabc" | true      |
    | "Hiabc"  | "abcd"   | false     |
    | "Hiabc"  | "bc"     | true      |
    | "Hiabcx" | "bc"     | false     |
    | "abc"    | "abc"    | true      |
    | "xyz"    | "12xyz"  | true      |
    | "yz"     | "12xz"   | false     |
    | "Z"      | "12xz"   | true      |
    | "12"     | "12"     | true      |
    | "abcXYZ" | "abcDEF" | false     |
    | "ab"     | "ab12"   | false     |
    | "ab"     | "12ab"   | true      |
    |__________|__________|__________*/

    public static final boolean endOther(String a, String b)
    {
        return false;
    }

    public static final void main(String[] args) {
        _EndOther.Validate(true);  // pass 'false' to print failed tests only.
    }
}
