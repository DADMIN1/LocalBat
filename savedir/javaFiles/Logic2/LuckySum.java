package Logic2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p130788

/* Given 3 int values, a b c, return their sum. However, 
if one of the values is 13 then it does not count towards the sum and values to its right do not count. 
So for example, if b is 13, then both b and c do not count. */

class TestCases_LuckySum
{
    // luckySum(1, 2, 3) → 6
    // luckySum(1, 2, 13) → 3
    // luckySum(1, 13, 3) → 1

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "luckySum(1, 2, 3)");
        testcaseMap.put(1, "luckySum(1, 2, 13)");
        testcaseMap.put(2, "luckySum(1, 13, 3)");
    }

    static int[] expectedResults = { 6, 3, 1, };
}

public class LuckySum
{
    public static int luckySum(int a, int b, int c)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            luckySum(1, 2, 3),
            luckySum(1, 2, 13),
            luckySum(1, 13, 3),
        };


        TestCases_LuckySum.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_LuckySum.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_LuckySum.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_LuckySum.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
