package Recursion1;
import Recursion1.Testcases._ChangeXY;

// https://codingbat.com/prob/p101372
// Difficulty: 336.0

public class ChangeXY
{
    /* Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars. */

    /*________________________________
    |            Testcases            |
    |_________________________________|
    | changeXY("codex")   → "codey"   |
    | changeXY("xxhixx")  → "yyhiyy"  |
    | changeXY("xhixhix") → "yhiyhiy" |
    | changeXY("hiy")     → "hiy"     |
    | changeXY("h")       → "h"       |
    | changeXY("x")       → "y"       |
    | changeXY("")        → ""        |
    | changeXY("xxx")     → "yyy"     |
    | changeXY("yyhxyi")  → "yyhyyi"  |
    | changeXY("hihi")    → "hihi"    |
    |________________________________*/

    public static String changeXY(String str)
    {
        return "";
    }

    public static void main(String[] args) {
        _ChangeXY.Validate(true);  // pass 'false' to print failed tests only.
    }
}
