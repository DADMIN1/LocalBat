package Logic2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p191363

/* We want make a package of goal kilos of chocolate.
We have small bars (1 kilo each) and big bars (5 kilos each).
Return the number of small bars to use, assuming we always use big bars before small bars.
Return -1 if it can't be done. */

class TestCases_MakeChocolate
{
    // makeChocolate(4, 1, 9) → 4
    // makeChocolate(4, 1, 10) → -1
    // makeChocolate(4, 1, 7) → 2

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "makeChocolate(4, 1, 9) → 4");
        testcaseMap.put(1, "makeChocolate(4, 1, 10) → -1");
        testcaseMap.put(2, "makeChocolate(4, 1, 7) → 2");
    }

    static int[] expectedResults = { 4, -1, 2, };
}

public class MakeChocolate
{
    public static int makeChocolate(int small, int big, int goal)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            makeChocolate(4, 1, 9),
            makeChocolate(4, 1, 10),
            makeChocolate(4, 1, 7),
        };


        TestCases_MakeChocolate.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_MakeChocolate.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_MakeChocolate.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_MakeChocolate.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
