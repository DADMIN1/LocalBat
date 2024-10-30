package Logic1;
import Logic1.Testcases._FizzString;

// https://codingbat.com/prob/p137136
// Difficulty: 135

public final class FizzString
{
    /* Given a string str, if the string starts with "f" return "Fizz". 
    If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, 
    return "FizzBuzz". In all other cases, return the string unchanged. 
    (See also: FizzBuzz Code) */

    /*______________________
    |       Testcases       |
    |_______________________|
    | str      | expected   |
    | (String) | (String)   |
    |__________|____________|
    | "fig"    | "Fizz"     |
    | "dib"    | "Buzz"     |
    | "fib"    | "FizzBuzz" |
    | "abc"    | "abc"      |
    | "fooo"   | "Fizz"     |
    | "booo"   | "booo"     |
    | "ooob"   | "Buzz"     |
    | "fooob"  | "FizzBuzz" |
    | "f"      | "Fizz"     |
    | "b"      | "Buzz"     |
    | "abcb"   | "Buzz"     |
    | "Hello"  | "Hello"    |
    | "Hellob" | "Buzz"     |
    | "af"     | "af"       |
    | "bf"     | "bf"       |
    | "fb"     | "FizzBuzz" |
    |__________|___________*/

    public static final String fizzString(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _FizzString.Validate(true);  // pass 'false' to print failed tests only.
    }
}
