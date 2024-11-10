package Warmup1;
import Warmup1.Testcases._EveryNth;

// https://codingbat.com/prob/p196441
// Difficulty: 190.0

public final class EveryNth
{
    /* Given a non-empty string and an int N, return the string made starting with char 0, 
    and then every Nth char of the string. So if N is 3, use char 0, 
    3, 6, ... and so on. N is 1 or more. */

    /*__________________________________
    |             Testcases             |
    |___________________________________|
    | str (String) | n (int) | returns  |
    |              |         | (String) |
    |______________|_________|__________|
    |  "Miracle"   |    2    |  "Mrce"  |
    |  "abcdefg"   |    2    |  "aceg"  |
    |  "abcdefg"   |    3    |  "adg"   |
    | "Chocolate"  |    3    |  "Cca"   |
    | "Chocolates" |    3    |  "Ccas"  |
    | "Chocolates" |    4    |  "Coe"   |
    | "Chocolates" |   100   |   "C"    |
    |______________|_________|_________*/

    public static final String everyNth(String str, int n)
    {
        return "";
    }

    public static final void main(String[] args) {
        //_EveryNth.printSuccesses = false;  // set 'false' to print failing tests only.
        //_EveryNth.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _EveryNth.Validate();
    }
}
