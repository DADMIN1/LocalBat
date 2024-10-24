package Logic1;
import Logic1.Testcases._FizzString2;

// https://codingbat.com/prob/p115243
// Difficulty: 135.1

public class FizzString2
{
    /* Given an int n, return the string form of the number followed by "!". 
    So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" instead of the number, 
    and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, 
    use "FizzBuzz". Note: the % "mod" operator computes the remainder after division, 
    so 23 % 10 yields 3. What will the remainder be when one number divides evenly into another? (See also: 
    FizzBuzz Code and Introduction to Mod) */

    /*_______________________________
    |           Testcases            |
    |________________________________|
    | fizzString2(1)   → "1!"        |
    | fizzString2(2)   → "2!"        |
    | fizzString2(3)   → "Fizz!"     |
    | fizzString2(4)   → "4!"        |
    | fizzString2(5)   → "Buzz!"     |
    | fizzString2(6)   → "Fizz!"     |
    | fizzString2(7)   → "7!"        |
    | fizzString2(8)   → "8!"        |
    | fizzString2(9)   → "Fizz!"     |
    | fizzString2(15)  → "FizzBuzz!" |
    | fizzString2(16)  → "16!"       |
    | fizzString2(18)  → "Fizz!"     |
    | fizzString2(19)  → "19!"       |
    | fizzString2(21)  → "Fizz!"     |
    | fizzString2(44)  → "44!"       |
    | fizzString2(45)  → "FizzBuzz!" |
    | fizzString2(100) → "Buzz!"     |
    |_______________________________*/

    public static String fizzString2(int n)
    {
        return "";
    }

    public static void main(String[] args) {
        _FizzString2.Validate(true);  // pass 'false' to print failed tests only.
    }
}
