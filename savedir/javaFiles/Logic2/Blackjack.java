package Logic2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p117019

/* Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
Return 0 if they both go over. */

class TestCases_Blackjack
{
    // blackjack(19, 21) → 21
    // blackjack(21, 19) → 21
    // blackjack(19, 22) → 19

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "blackjack(19, 21) → 21");
        testcaseMap.put(1, "blackjack(21, 19) → 21");
        testcaseMap.put(2, "blackjack(19, 22) → 19");
    }

    static int[] expectedResults = { 21, 21, 19, };
}

public class Blackjack
{
    public static int blackjack(int a, int b)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            blackjack(19, 21),
            blackjack(21, 19),
            blackjack(19, 22),
        };


        TestCases_Blackjack.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Blackjack.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Blackjack.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_Blackjack.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
