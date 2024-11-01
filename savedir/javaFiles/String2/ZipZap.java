package String2;
import String2.Testcases._ZipZap;

// https://codingbat.com/prob/p180759
// Difficulty: 251.0

public final class ZipZap
{
    /* Look for patterns like "zip" and "zap" in the string -- length-3, 
    starting with 'z' and ending with 'p'. Return a string where for all such words, 
    the middle letter is gone, so "zipXzap" yields "zpXzp". */

    /*_______________________
    |       Testcases        |
    |________________________|
    |    str     |  returns  |
    |  (String)  |  (String) |
    |____________|___________|
    | "zipXzap"  |  "zpXzp"  |
    |  "zopzop"  |   "zpzp"  |
    | "zzzopzop" |  "zzzpzp" |
    |  "zibzap"  |  "zibzp"  |
    |   "zip"    |    "zp"   |
    |    "zi"    |    "zi"   |
    |    "z"     |    "z"    |
    |     ""     |     ""    |
    |   "zzp"    |    "zp"   |
    |  "abcppp"  |  "abcppp" |
    | "azbcppp"  | "azbcppp" |
    | "azbcpzpp" | "azbcpzp" |
    |____________|__________*/

    public static final String zipZap(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _ZipZap.Validate(true);  // pass 'false' to print failed tests only.
    }
}
