package Warmup1;
import Warmup1.Testcases._MixStart;

// https://codingbat.com/prob/p151713
// Difficulty: 163.0

public class MixStart
{
    /* Return true if the given string begins with "mix", except the 'm' can be anything, 
    so "pix", "9ix" .. all count. */

    /*_______________________________
    |           Testcases            |
    |________________________________|
    | mixStart("mix snacks") → true  |
    | mixStart("pix snacks") → true  |
    | mixStart("piz snacks") → false |
    | mixStart("nix")        → true  |
    | mixStart("ni")         → false |
    | mixStart("n")          → false |
    | mixStart("")           → false |
    |_______________________________*/

    public static boolean mixStart(String str)
    {
        return false;
    }

    public static void main(String[] args) {
        _MixStart.Validate(true);  // pass 'false' to print failed tests only.
    }
}
