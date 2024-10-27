package String2;
import String2.Testcases._ZipZap;

// https://codingbat.com/prob/p180759
// Difficulty: 251.0

public final class ZipZap
{
    /* Look for patterns like "zip" and "zap" in the string -- length-3, 
    starting with 'z' and ending with 'p'. Return a string where for all such words, 
    the middle letter is gone, so "zipXzap" yields "zpXzp". */

    /*_______________________________
    |           Testcases            |
    |________________________________|
    | zipZap("zipXzap")  → "zpXzp"   |
    | zipZap("zopzop")   → "zpzp"    |
    | zipZap("zzzopzop") → "zzzpzp"  |
    | zipZap("zibzap")   → "zibzp"   |
    | zipZap("zip")      → "zp"      |
    | zipZap("zi")       → "zi"      |
    | zipZap("z")        → "z"       |
    | zipZap("")         → ""        |
    | zipZap("zzp")      → "zp"      |
    | zipZap("abcppp")   → "abcppp"  |
    | zipZap("azbcppp")  → "azbcppp" |
    | zipZap("azbcpzpp") → "azbcpzp" |
    |_______________________________*/

    public static final String zipZap(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _ZipZap.Validate(true);  // pass 'false' to print failed tests only.
    }
}
