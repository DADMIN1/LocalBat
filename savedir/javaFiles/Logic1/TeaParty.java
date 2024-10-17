package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p177181

/* We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 
1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. 
However, if either tea or candy is at least double the amount of the other one, 
the party is great (2). However, in all cases, if either tea or candy is less than 5, 
the party is always bad (0). */

class TestCases_TeaParty
{
    // teaParty(6, 8) → 1
    // teaParty(3, 8) → 0
    // teaParty(20, 6) → 2

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "teaParty(6, 8)");
        testcaseMap.put(1, "teaParty(3, 8)");
        testcaseMap.put(2, "teaParty(20, 6)");
    }

    static int[] expectedResults = { 1, 0, 2, };
}

public class TeaParty
{
    public static int teaParty(int tea, int candy)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            teaParty(6, 8),
            teaParty(3, 8),
            teaParty(20, 6),
        };


        TestCases_TeaParty.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_TeaParty.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_TeaParty.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_TeaParty.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
