package Array2;
import Array2.Testcases._FizzArray2;

// https://codingbat.com/prob/p178353
// Difficulty: 230.1

public final class FizzArray2
{
    /* Given a number n, create and return a new string array of length n, 
    containing the strings "0", "1" "2" .. through n-1. N may be 0, 
    in which case just return a length 0 array. Note: String.valueOf(xxx) will make the String form of most types. 
    The syntax to make a new string array is: new String[desired_length]  (See also: 
    FizzBuzz Code) */

    /*__________________________________________________________________________
    |                                 Testcases                                 |
    |___________________________________________________________________________|
    | fizzArray2(4)  → ["0", "1", "2", "3"]                                     |
    | fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]       |
    | fizzArray2(2)  → ["0", "1"]                                               |
    | fizzArray2(1)  → ["0"]                                                    |
    | fizzArray2(0)  → []                                                       |
    | fizzArray2(7)  → ["0", "1", "2", "3", "4", "5", "6"]                      |
    | fizzArray2(9)  → ["0", "1", "2", "3", "4", "5", "6", "7", "8"]            |
    | fizzArray2(11) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"] |
    |__________________________________________________________________________*/

    public static final String[] fizzArray2(int n)
    {
        return new String[]{""};
    }

    public static final void main(String[] args) {
        _FizzArray2.Validate(true);  // pass 'false' to print failed tests only.
    }
}
