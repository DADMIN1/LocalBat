package Array2;
import Array2.Testcases._FizzBuzz;

// https://codingbat.com/prob/p153059
// Difficulty: 299

public final class FizzBuzz
{
    /* This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first problem for job interviews. 
    (See also: FizzBuzz Code.) Consider the series of numbers beginning at start and running up to but not including end, 
    so for example start=1 and end=5 gives the series 1, 2, 
    3, 4. Return a new String[] array containing the string form of these numbers, 
    except for multiples of 3, use "Fizz" instead of the number, 
    for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz". 
    In Java, String.valueOf(xxx) will make the String form of an int or other type. 
    This version is a little more complicated than the usual version since you have to allocate and index into an array instead of just printing, 
    and we vary the start/end instead of just always doing 1..100. */

    /*________________________________________________________________________________________________________________________
    |                                                        Testcases                                                        |
    |_________________________________________________________________________________________________________________________|
    | start |  end  |                                            returns (String[])                                           |
    | (int) | (int) |                                                                                                         |
    |_______|_______|_________________________________________________________________________________________________________|
    |   1   |   6   | {"1", "2", "Fizz", "4", "Buzz"}                                                                         |
    |   1   |   8   | {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"}                                                            |
    |   1   |   11  | {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"}                                       |
    |   1   |   16  | {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"} |
    |   1   |   4   | {"1", "2", "Fizz"}                                                                                      |
    |   1   |   2   | {"1"}                                                                                                   |
    |   50  |   56  | {"Buzz", "Fizz", "52", "53", "Fizz", "Buzz"}                                                            |
    |   15  |   17  | {"FizzBuzz", "16"}                                                                                      |
    |   30  |   36  | {"FizzBuzz", "31", "32", "Fizz", "34", "Buzz"}                                                          |
    |  1000 |  1006 | {"Buzz", "1001", "Fizz", "1003", "1004", "FizzBuzz"}                                                    |
    |   99  |  102  | {"Fizz", "Buzz", "101"}                                                                                 |
    |   14  |   20  | {"14", "FizzBuzz", "16", "17", "Fizz", "19"}                                                            |
    |_______|_______|________________________________________________________________________________________________________*/

    public static final String[] fizzBuzz(int start, int end)
    {
        return new String[]{""};
    }

    public static final void main(String[] args) {
        //_FizzBuzz.printSuccesses = false;  // set 'false' to print failing tests only.
        //_FizzBuzz.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _FizzBuzz.Validate();
    }
}
