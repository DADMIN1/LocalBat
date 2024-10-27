package Logic1;
import Logic1.Testcases._AnswerCell;

// https://codingbat.com/prob/p110973
// Difficulty: 130.0

public final class AnswerCell
{
    /* Your cell phone rings. Return true if you should answer it. 
    Normally you answer, except in the morning you only answer if it is your mom calling. 
    In all cases, if you are asleep, you do not answer. */

    /*________________________________________
    |                Testcases                |
    |_________________________________________|
    | answerCell(false, false, false) → true  |
    | answerCell(false, false, true)  → false |
    | answerCell(true, false, false)  → false |
    | answerCell(true, true, false)   → true  |
    | answerCell(false, true, false)  → true  |
    | answerCell(true, true, true)    → false |
    |________________________________________*/

    public static final boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep)
    {
        return false;
    }

    public static final void main(String[] args) {
        _AnswerCell.Validate(true);  // pass 'false' to print failed tests only.
    }
}
