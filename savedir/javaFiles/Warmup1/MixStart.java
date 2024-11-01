package Warmup1;
import Warmup1.Testcases._MixStart;

// https://codingbat.com/prob/p151713
// Difficulty: 163.0

public final class MixStart
{
    /* Return true if the given string begins with "mix", except the 'm' can be anything, 
    so "pix", "9ix" .. all count. */

    /*_________________________
    |        Testcases         |
    |__________________________|
    | str (String) |  returns  |
    |              | (boolean) |
    |______________|___________|
    | "mix snacks" |    true   |
    | "pix snacks" |    true   |
    | "piz snacks" |   false   |
    |    "nix"     |    true   |
    |     "ni"     |   false   |
    |     "n"      |   false   |
    |      ""      |   false   |
    |______________|__________*/

    public static final boolean mixStart(String str)
    {
        return false;
    }

    public static final void main(String[] args) {
        _MixStart.Validate(true);  // pass 'false' to print failed tests only.
    }
}
