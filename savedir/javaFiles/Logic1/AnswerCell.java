// https://codingbat.com/prob/p110973
package Logic1;
import Logic1.Testcases._AnswerCell;

public class AnswerCell
{
    /* Your cell phone rings. Return true if you should answer it. 
    Normally you answer, except in the morning you only answer if it is your mom calling. 
    In all cases, if you are asleep, you do not answer. */

    /*_________________________________________
    |                Testcases                |
    ___________________________________________
    | answerCell(false, false, false) → true  |
    | answerCell(false, false, true)  → false |
    | answerCell(true, false, false)  → false |
    _________________________________________*/

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep)
    {
        
    }

    public static void main(String[] args) {
        _AnswerCell.Validate(true);  // pass 'false' to print failed tests only.
    }
}
