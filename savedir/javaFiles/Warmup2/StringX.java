package Warmup2;
import Warmup2.Testcases._StringX;

// https://codingbat.com/prob/p171260
// Difficulty: 230.0

public final class StringX
{
    /* Given a string, return a version where all the "x" have been removed. 
    Except an "x" at the very start or end should not be removed. */

    /*_________________________
    |        Testcases         |
    |__________________________|
    | str         | expected   |
    | (String)    | (String)   |
    |_____________|____________|
    | "xxHxix"    | "xHix"     |
    | "abxxxcd"   | "abcd"     |
    | "xabxxxcdx" | "xabcdx"   |
    | "xKittenx"  | "xKittenx" |
    | "Hello"     | "Hello"    |
    | "xx"        | "xx"       |
    | "x"         | "x"        |
    | ""          | ""         |
    |_____________|___________*/

    public static final String stringX(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _StringX.Validate(true);  // pass 'false' to print failed tests only.
    }
}
