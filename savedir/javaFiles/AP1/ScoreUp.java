// https://codingbat.com/prob/p180365
package AP1;
import AP1.Testcases._ScoreUp;

public class ScoreUp
{
    /* The "key" array is an array containing the correct answers to an exam, 
    like {"a", "a", "b", "b"}. the "answers" array contains a student's answers, 
    with "?" representing a question left blank. The two arrays are not empty and are the same length. 
    Return the score for this array of answers, giving +4 for each correct answer, 
    -1 for each incorrect answer, and +0 for each blank answer. */

    /*__________________________________________________________
    |                        Testcases                         |
    ____________________________________________________________
    | scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) → 6  |
    | scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"]) → 11 |
    | scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) → 16 |
    __________________________________________________________*/

    public static int scoreUp(String[] key, String[] answers)
    {
        
    }

    public static void main(String[] args) {
        _ScoreUp.Validate(true);  // pass 'false' to print failed tests only.
    }
}
