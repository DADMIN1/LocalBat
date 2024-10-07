package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p158888

/* Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared). */

class TestCases_PowerN
{
    // powerN(3, 1) → 3
    // powerN(3, 2) → 9
    // powerN(3, 3) → 27

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "powerN(3, 1) → 3");
        testcaseMap.put(1, "powerN(3, 2) → 9");
        testcaseMap.put(2, "powerN(3, 3) → 27");
    }

    static int[] expectedResults = { 3, 9, 27, };
}

public class PowerN
{
    public static int powerN(int base, int n)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            powerN(3, 1),
            powerN(3, 2),
            powerN(3, 3),
        };


        TestCases_PowerN.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_PowerN.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_PowerN.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_PowerN.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
