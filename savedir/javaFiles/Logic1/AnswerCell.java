package Logic1;
import Logic1.Testcases._AnswerCell;

// https://codingbat.com/prob/p110973
// Difficulty: 130.0

public final class AnswerCell
{
    /* Your cell phone rings. Return true if you should answer it. 
    Normally you answer, except in the morning you only answer if it is your mom calling. 
    In all cases, if you are asleep, you do not answer. */

    /*______________________________________________
    |                   Testcases                   |
    |_______________________________________________|
    | isMorning |   isMom   |  isAsleep |  returns  |
    | (boolean) | (boolean) | (boolean) | (boolean) |
    |___________|___________|___________|___________|
    |   false   |   false   |   false   |    true   |
    |   false   |   false   |    true   |   false   |
    |    true   |   false   |   false   |   false   |
    |    true   |    true   |   false   |    true   |
    |   false   |    true   |   false   |    true   |
    |    true   |    true   |    true   |   false   |
    |___________|___________|___________|__________*/

    public static final boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep)
    {
        return false;
    }

    public static final void main(String[] args) {
        _AnswerCell.Validate(true);  // pass 'false' to print failed tests only.
    }
}
