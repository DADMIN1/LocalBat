package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p133158

/* Return true if the given non-negative number is 1 or 2 less than a multiple of 20.
So for example 38 and 39 return true, but 40 returns false.
See also: Introduction to Mod */

class TestCases_Less20
{
    // less20(18) → true
    // less20(19) → true
    // less20(20) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "less20(18) → true");
        testcaseMap.put(1, "less20(19) → true");
        testcaseMap.put(2, "less20(20) → false");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class Less20
{
    public static boolean less20(int n)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            less20(18),
            less20(19),
            less20(20),
        };


        TestCases_Less20.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Less20.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Less20.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_Less20.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
