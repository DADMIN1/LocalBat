package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p115384

/* Given two int values, return whichever value is larger.
However if the two values have the same remainder when divided by 5, then the return the smaller value.
However, in all cases, if the two values are the same, return 0.
Note: the % "mod" operator computes the remainder, e.g.
7 % 5 is 2. */

class TestCases_MaxMod5
{
    // maxMod5(2, 3) → 3
    // maxMod5(6, 2) → 6
    // maxMod5(3, 2) → 3

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "maxMod5(2, 3) → 3");
        testcaseMap.put(1, "maxMod5(6, 2) → 6");
        testcaseMap.put(2, "maxMod5(3, 2) → 3");
    }

    static int[] expectedResults = { 3, 6, 3, };
}

public class MaxMod5
{
    public static int maxMod5(int a, int b)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            maxMod5(2, 3),
            maxMod5(6, 2),
            maxMod5(3, 2),
        };


        TestCases_MaxMod5.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_MaxMod5.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_MaxMod5.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_MaxMod5.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
