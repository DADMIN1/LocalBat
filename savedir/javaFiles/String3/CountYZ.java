package String3;
import String3.Testcases._CountYZ;

// https://codingbat.com/prob/p199171
// Difficulty: 303.0

public final class CountYZ
{
    /* Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, 
    but not the 'y' in "yellow" (not case sensitive). 
    We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. 
    (Note: Character.isLetter(char) tests if a char is an alphabetic letter.) */

    /*_________________________
    |        Testcases         |
    |__________________________|
    |  str (String)  | returns |
    |                |  (int)  |
    |________________|_________|
    |   "fez day"    |    2    |
    |   "day fez"    |    2    |
    |  "day fyyyz"   |    2    |
    |   "day yak"    |    1    |
    |   "day:yak"    |    1    |
    | "!!day--yaz!!" |    2    |
    |   "yak zak"    |    0    |
    | "DAY abc XYZ"  |    2    |
    |  "aaz yyz my"  |    3    |
    |     "y2bz"     |    2    |
    |     "zxyx"     |    0    |
    |________________|________*/

    public static final int countYZ(String str)
    {
        return 0;
    }

    public static final void main(String[] args) {
        //_CountYZ.printSuccesses = false;  // set 'false' to print failing tests only.
        //_CountYZ.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _CountYZ.Validate();
    }
}
