package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p159612

/* Return true if the given non-negative number is a multiple of 3 or 5, but not both.
Use the % "mod" operator -- see Introduction to Mod */

class TestCases_Old35
{
    // old35(3) → true
    // old35(10) → true
    // old35(15) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "old35(3) → true");
        testcaseMap.put(1, "old35(10) → true");
        testcaseMap.put(2, "old35(15) → false");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class Old35
{
    public static boolean old35(int n)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            old35(3),
            old35(10),
            old35(15),
        };


        TestCases_Old35.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Old35.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Old35.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_Old35.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
