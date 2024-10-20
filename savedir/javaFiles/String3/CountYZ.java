// https://codingbat.com/prob/p199171
package String3;
import String3.Testcases._CountYZ;

public class CountYZ
{
    /* Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, 
    but not the 'y' in "yellow" (not case sensitive). 
    We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. 
    (Note: Character.isLetter(char) tests if a char is an alphabetic letter.) */

    /*__________________________
    |        Testcases         |
    |__________________________|
    | countYZ("fez day")   → 2 |
    | countYZ("day fez")   → 2 |
    | countYZ("day fyyyz") → 2 |
    |_________________________*/

    public static int countYZ(String str)
    {
        
    }

    public static void main(String[] args) {
        _CountYZ.Validate(true);  // pass 'false' to print failed tests only.
    }
}
