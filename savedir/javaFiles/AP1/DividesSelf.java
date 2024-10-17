// https://codingbat.com/prob/p165941
package AP1;
import AP1.Testcases._DividesSelf;

public class DividesSelf
{
    /* We'll say that a positive int divides itself if every digit in the number divides into the number evenly. 
    So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. 
    We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself. 
    Note: use % to get the rightmost digit, and / to discard the rightmost digit. */

    /*__________________________
    |        Testcases         |
    ____________________________
    | dividesSelf(128) → true  |
    | dividesSelf(12)  → true  |
    | dividesSelf(120) → false |
    __________________________*/

    public static boolean dividesSelf(int n)
    {
        
    }

    public static void main(String[] args) {
        _DividesSelf.Validate(true);  // pass 'false' to print failed tests only.
    }
}
