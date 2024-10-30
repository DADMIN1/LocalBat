package Warmup2;
import Warmup2.Testcases._FrontTimes;

// https://codingbat.com/prob/p101475
// Difficulty: 206.0

public final class FrontTimes
{
    /* Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, 
    or whatever is there if the string is less than length 3. 
    Return n copies of the front; */

    /*__________________________________
    |             Testcases             |
    |___________________________________|
    | str         | n     | expected    |
    | (String)    | (int) | (String)    |
    |_____________|_______|_____________|
    | "Chocolate" | 2     | "ChoCho"    |
    | "Chocolate" | 3     | "ChoChoCho" |
    | "Abc"       | 3     | "AbcAbcAbc" |
    | "Ab"        | 4     | "AbAbAbAb"  |
    | "A"         | 4     | "AAAA"      |
    | ""          | 4     | ""          |
    | "Abc"       | 0     | ""          |
    |_____________|_______|____________*/

    public static final String frontTimes(String str, int n)
    {
        return "";
    }

    public static final void main(String[] args) {
        _FrontTimes.Validate(true);  // pass 'false' to print failed tests only.
    }
}
