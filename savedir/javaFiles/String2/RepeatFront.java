package String2;
import String2.Testcases._RepeatFront;

// https://codingbat.com/prob/p128796
// Difficulty: 233.0

public final class RepeatFront
{
    /* Given a string and an int n, return a string made of the first n characters of the string, 
    followed by the first n-1 characters of the string, and so on. 
    You may assume that n is between 0 and the length of the string, 
    inclusive (i.e. n >= 0 and n <= str.length()). */

    /*___________________________________
    |             Testcases              |
    |____________________________________|
    | str         | n     | expected     |
    | (String)    | (int) | (String)     |
    |_____________|_______|______________|
    | "Chocolate" | 4     | "ChocChoChC" |
    | "Chocolate" | 3     | "ChoChC"     |
    | "Ice Cream" | 2     | "IcI"        |
    | "Ice Cream" | 1     | "I"          |
    | "Ice Cream" | 0     | ""           |
    | "xyz"       | 3     | "xyzxyx"     |
    | ""          | 0     | ""           |
    | "Java"      | 4     | "JavaJavJaJ" |
    | "Java"      | 1     | "J"          |
    |_____________|_______|_____________*/

    public static final String repeatFront(String str, int n)
    {
        return "";
    }

    public static final void main(String[] args) {
        _RepeatFront.Validate(true);  // pass 'false' to print failed tests only.
    }
}
