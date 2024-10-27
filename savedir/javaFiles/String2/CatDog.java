package String2;
import String2.Testcases._CatDog;

// https://codingbat.com/prob/p111624
// Difficulty: 209.0

public final class CatDog
{
    /* Return true if the string "cat" and "dog" appear the same number of times in the given string. */

    /*__________________________________
    |             Testcases             |
    |___________________________________|
    | catDog("catdog")          → true  |
    | catDog("catcat")          → false |
    | catDog("1cat1cadodog")    → true  |
    | catDog("catxxdogxxxdog")  → false |
    | catDog("catxdogxdogxcat") → true  |
    | catDog("catxdogxdogxca")  → false |
    | catDog("dogdogcat")       → false |
    | catDog("dogogcat")        → true  |
    | catDog("dog")             → false |
    | catDog("cat")             → false |
    | catDog("ca")              → true  |
    | catDog("c")               → true  |
    | catDog("")                → true  |
    |__________________________________*/

    public static final boolean catDog(String str)
    {
        return false;
    }

    public static final void main(String[] args) {
        _CatDog.Validate(true);  // pass 'false' to print failed tests only.
    }
}
