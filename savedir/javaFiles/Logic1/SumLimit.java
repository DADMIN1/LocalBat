package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p118077

/* Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. 
If the sum has more digits than a, just return a without b. 
(Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.) */

class TestCases_SumLimit
{
    // sumLimit(2, 3) → 5
    // sumLimit(8, 3) → 8
    // sumLimit(8, 1) → 9

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "sumLimit(2, 3)");
        testcaseMap.put(1, "sumLimit(8, 3)");
        testcaseMap.put(2, "sumLimit(8, 1)");
    }

    static int[] expectedResults = { 5, 8, 9, };
}

public class SumLimit
{
    public static int sumLimit(int a, int b)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            sumLimit(2, 3),
            sumLimit(8, 3),
            sumLimit(8, 1),
        };


        TestCases_SumLimit.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_SumLimit.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_SumLimit.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_SumLimit.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
