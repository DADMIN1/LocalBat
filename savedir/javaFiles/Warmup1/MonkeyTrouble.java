package Warmup1;
import Warmup1.Testcases._MonkeyTrouble;

// https://codingbat.com/prob/p181646
// Difficulty: 106.0

public class MonkeyTrouble
{
    /* We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. 
    We are in trouble if they are both smiling or if neither of them is smiling. 
    Return true if we are in trouble. */

    /*____________________________________
    |              Testcases              |
    |_____________________________________|
    | monkeyTrouble(true, true)   → true  |
    | monkeyTrouble(false, false) → true  |
    | monkeyTrouble(true, false)  → false |
    | monkeyTrouble(false, true)  → false |
    |____________________________________*/

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile)
    {
        return false;
    }

    public static void main(String[] args) {
        _MonkeyTrouble.Validate(true);  // pass 'false' to print failed tests only.
    }
}
