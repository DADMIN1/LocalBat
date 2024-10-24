package String2;
import String2.Testcases._RepeatFront;

// https://codingbat.com/prob/p128796
// Difficulty: 233.0

public class RepeatFront
{
    /* Given a string and an int n, return a string made of the first n characters of the string, 
    followed by the first n-1 characters of the string, and so on. 
    You may assume that n is between 0 and the length of the string, 
    inclusive (i.e. n >= 0 and n <= str.length()). */

    /*___________________________________________
    |                 Testcases                  |
    |____________________________________________|
    | repeatFront("Chocolate", 4) → "ChocChoChC" |
    | repeatFront("Chocolate", 3) → "ChoChC"     |
    | repeatFront("Ice Cream", 2) → "IcI"        |
    | repeatFront("Ice Cream", 1) → "I"          |
    | repeatFront("Ice Cream", 0) → ""           |
    | repeatFront("xyz", 3)       → "xyzxyx"     |
    | repeatFront("", 0)          → ""           |
    | repeatFront("Java", 4)      → "JavaJavJaJ" |
    | repeatFront("Java", 1)      → "J"          |
    |___________________________________________*/

    public static String repeatFront(String str, int n)
    {
        return "";
    }

    public static void main(String[] args) {
        _RepeatFront.Validate(true);  // pass 'false' to print failed tests only.
    }
}
