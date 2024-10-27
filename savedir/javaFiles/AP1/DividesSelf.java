package AP1;
import AP1.Testcases._DividesSelf;

// https://codingbat.com/prob/p165941
// Difficulty: 227.0

public final class DividesSelf
{
    /* We'll say that a positive int divides itself if every digit in the number divides into the number evenly. 
    So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. 
    We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself. 
    Note: use % to get the rightmost digit, and / to discard the rightmost digit. */

    /*_________________________
    |        Testcases         |
    |__________________________|
    | dividesSelf(128) → true  |
    | dividesSelf(12)  → true  |
    | dividesSelf(120) → false |
    | dividesSelf(122) → true  |
    | dividesSelf(13)  → false |
    | dividesSelf(32)  → false |
    | dividesSelf(22)  → true  |
    | dividesSelf(42)  → false |
    | dividesSelf(212) → true  |
    | dividesSelf(213) → false |
    | dividesSelf(162) → true  |
    |_________________________*/

    public static final boolean dividesSelf(int n)
    {
        return false;
    }

    public static final void main(String[] args) {
        _DividesSelf.Validate(true);  // pass 'false' to print failed tests only.
    }
}
