package String1;
import String1.Testcases._DeFront;

// https://codingbat.com/prob/p110141
// Difficulty: 190.0

public final class DeFront
{
    /* Given a string, return a version without the first 2 chars. 
    Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
    The string may be any length. Harder than it looks. */

    /*___________________________
    |         Testcases          |
    |____________________________|
    | deFront("Hello") → "llo"   |
    | deFront("java")  → "va"    |
    | deFront("away")  → "aay"   |
    | deFront("axy")   → "ay"    |
    | deFront("abc")   → "abc"   |
    | deFront("xby")   → "by"    |
    | deFront("ab")    → "ab"    |
    | deFront("ax")    → "a"     |
    | deFront("axb")   → "ab"    |
    | deFront("aaa")   → "aa"    |
    | deFront("xbc")   → "bc"    |
    | deFront("bbb")   → "bb"    |
    | deFront("bazz")  → "zz"    |
    | deFront("ba")    → ""      |
    | deFront("abxyz") → "abxyz" |
    | deFront("hi")    → ""      |
    | deFront("his")   → "s"     |
    | deFront("xz")    → ""      |
    | deFront("zzz")   → "z"     |
    |___________________________*/

    public static final String deFront(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _DeFront.Validate(true);  // pass 'false' to print failed tests only.
    }
}
