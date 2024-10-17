package Logic2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p148972

/* Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, 
it does not count towards the sum. */

class TestCases_LoneSum
{
    // loneSum(1, 2, 3) → 6
    // loneSum(3, 2, 3) → 2
    // loneSum(3, 3, 3) → 0

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "loneSum(1, 2, 3)");
        testcaseMap.put(1, "loneSum(3, 2, 3)");
        testcaseMap.put(2, "loneSum(3, 3, 3)");
    }

    static int[] expectedResults = { 6, 2, 0, };
}

public class LoneSum
{
    public static int loneSum(int a, int b, int c)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            loneSum(1, 2, 3),
            loneSum(3, 2, 3),
            loneSum(3, 3, 3),
        };


        TestCases_LoneSum.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_LoneSum.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_LoneSum.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_LoneSum.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
