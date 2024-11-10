package Warmup1;
import Warmup1.Testcases._MonkeyTrouble;

// https://codingbat.com/prob/p181646
// Difficulty: 106.0

public final class MonkeyTrouble
{
    /* We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. 
    We are in trouble if they are both smiling or if neither of them is smiling. 
    Return true if we are in trouble. */

    /*__________________________________
    |             Testcases             |
    |___________________________________|
    |   aSmile  |   bSmile  |  returns  |
    | (boolean) | (boolean) | (boolean) |
    |___________|___________|___________|
    |    true   |    true   |    true   |
    |   false   |   false   |    true   |
    |    true   |   false   |   false   |
    |   false   |    true   |   false   |
    |___________|___________|__________*/

    public static final boolean monkeyTrouble(boolean aSmile, boolean bSmile)
    {
        return false;
    }

    public static final void main(String[] args) {
        //_MonkeyTrouble.printSuccesses = false;  // set 'false' to print failing tests only.
        //_MonkeyTrouble.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _MonkeyTrouble.Validate();
    }
}
