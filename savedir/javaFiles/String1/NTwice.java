package String1;
import String1.Testcases._NTwice;

// https://codingbat.com/prob/p174148
// Difficulty: 151.0

public final class NTwice
{
    /* Given a string and an int n, return a string made of the first and last n chars from the string. 
    The string length will be at least n. */

    /*_________________________________
    |            Testcases             |
    |__________________________________|
    | str         | n     | expected   |
    | (String)    | (int) | (String)   |
    |_____________|_______|____________|
    | "Hello"     | 2     | "Helo"     |
    | "Chocolate" | 3     | "Choate"   |
    | "Chocolate" | 1     | "Ce"       |
    | "Chocolate" | 0     | ""         |
    | "Hello"     | 4     | "Hellello" |
    | "Code"      | 4     | "CodeCode" |
    | "Code"      | 2     | "Code"     |
    |_____________|_______|___________*/

    public static final String nTwice(String str, int n)
    {
        return "";
    }

    public static final void main(String[] args) {
        _NTwice.Validate(true);  // pass 'false' to print failed tests only.
    }
}
