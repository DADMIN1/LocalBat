package Warmup1;
import Warmup1.Testcases._StartHi;

// https://codingbat.com/prob/p191022
// Difficulty: 145.0

public final class StartHi
{
    /* Given a string, return true if the string starts with "hi" and false otherwise. */

    /*_______________________
    |       Testcases        |
    |________________________|
    | str        | expected  |
    | (String)   | (boolean) |
    |____________|___________|
    | "hi there" | true      |
    | "hi"       | true      |
    | "hello hi" | false     |
    | "he"       | false     |
    | "h"        | false     |
    | ""         | false     |
    | "ho hi"    | false     |
    | "hi ho"    | true      |
    |____________|__________*/

    public static final boolean startHi(String str)
    {
        return false;
    }

    public static final void main(String[] args) {
        _StartHi.Validate(true);  // pass 'false' to print failed tests only.
    }
}
