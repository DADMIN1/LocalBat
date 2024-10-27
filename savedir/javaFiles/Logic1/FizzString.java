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

    /*__________________________________
    |             Testcases             |
    |___________________________________|
    | fizzString("fig")    → "Fizz"     |
    | fizzString("dib")    → "Buzz"     |
    | fizzString("fib")    → "FizzBuzz" |
    | fizzString("abc")    → "abc"      |
    | fizzString("fooo")   → "Fizz"     |
    | fizzString("booo")   → "booo"     |
    | fizzString("ooob")   → "Buzz"     |
    | fizzString("fooob")  → "FizzBuzz" |
    | fizzString("f")      → "Fizz"     |
    | fizzString("b")      → "Buzz"     |
    | fizzString("abcb")   → "Buzz"     |
    | fizzString("Hello")  → "Hello"    |
    | fizzString("Hellob") → "Buzz"     |
    | fizzString("af")     → "af"       |
    | fizzString("bf")     → "bf"       |
    | fizzString("fb")     → "FizzBuzz" |
    |__________________________________*/

    public static final String fizzString(String str)
    {
        return "";
    }

    public static final void main(String[] args) {
        _FizzString.Validate(true);  // pass 'false' to print failed tests only.
    }
}
