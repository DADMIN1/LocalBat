package Logic2;
import Logic2.Testcases._Blackjack;

// https://codingbat.com/prob/p117019
// Difficulty: 218.0

public final class Blackjack
{
    /* Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. 
    Return 0 if they both go over. */

    /*_______________________
    |       Testcases        |
    |________________________|
    | blackjack(19, 21) → 21 |
    | blackjack(21, 19) → 21 |
    | blackjack(19, 22) → 19 |
    | blackjack(22, 19) → 19 |
    | blackjack(22, 50) → 0  |
    | blackjack(22, 22) → 0  |
    | blackjack(33, 1)  → 1  |
    | blackjack(1, 2)   → 2  |
    | blackjack(34, 33) → 0  |
    | blackjack(17, 19) → 19 |
    | blackjack(18, 17) → 18 |
    | blackjack(16, 23) → 16 |
    | blackjack(3, 4)   → 4  |
    | blackjack(3, 2)   → 3  |
    | blackjack(21, 20) → 21 |
    |_______________________*/

    public static final int blackjack(int a, int b)
    {
        return 0;
    }

    public static final void main(String[] args) {
        _Blackjack.Validate(true);  // pass 'false' to print failed tests only.
    }
}
