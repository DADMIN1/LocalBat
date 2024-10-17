package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p178728

/* Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, 
are extra lucky. So if either value is a teen, just return 19. */

class TestCases_TeenSum
{
    // teenSum(3, 4) → 7
    // teenSum(10, 13) → 19
    // teenSum(13, 2) → 19

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "teenSum(3, 4)");
        testcaseMap.put(1, "teenSum(10, 13)");
        testcaseMap.put(2, "teenSum(13, 2)");
    }

    static int[] expectedResults = { 7, 19, 19, };
}

public class TeenSum
{
    public static int teenSum(int a, int b)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            teenSum(3, 4),
            teenSum(10, 13),
            teenSum(13, 2),
        };


        TestCases_TeenSum.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_TeenSum.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_TeenSum.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_TeenSum.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
