package Logic1;
import Logic1.Testcases._FizzString2;

// https://codingbat.com/prob/p115243
// Difficulty: 135.1

public final class FizzString2
{
    /* Given an int n, return the string form of the number followed by "!". 
    So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" instead of the number, 
    and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, 
    use "FizzBuzz". Note: the % "mod" operator computes the remainder after division, 
    so 23 % 10 yields 3. What will the remainder be when one number divides evenly into another? (See also: 
    FizzBuzz Code and Introduction to Mod) */

    /*______________________
    |       Testcases       |
    |_______________________|
    | n (int) |   returns   |
    |         |   (String)  |
    |_________|_____________|
    |    1    |     "1!"    |
    |    2    |     "2!"    |
    |    3    |   "Fizz!"   |
    |    4    |     "4!"    |
    |    5    |   "Buzz!"   |
    |    6    |   "Fizz!"   |
    |    7    |     "7!"    |
    |    8    |     "8!"    |
    |    9    |   "Fizz!"   |
    |    15   | "FizzBuzz!" |
    |    16   |    "16!"    |
    |    18   |   "Fizz!"   |
    |    19   |    "19!"    |
    |    21   |   "Fizz!"   |
    |    44   |    "44!"    |
    |    45   | "FizzBuzz!" |
    |   100   |   "Buzz!"   |
    |_________|____________*/

    public static final String fizzString2(int n)
    {
        return "";
    }

    public static final void main(String[] args) {
        //_FizzString2.printSuccesses = false;  // set 'false' to print failing tests only.
        //_FizzString2.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _FizzString2.Validate();
    }
}
