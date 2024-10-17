package Logic2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p138990

/* Given three ints, a b c, 
return true if one of b or c is "close" (differing from a by at most 1), 
while the other is "far", differing from both other values by 2 or more. 
Note: Math.abs(num) computes the absolute value of a number. */

class TestCases_CloseFar
{
    // closeFar(1, 2, 10) → true
    // closeFar(1, 2, 3) → false
    // closeFar(4, 1, 3) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "closeFar(1, 2, 10)");
        testcaseMap.put(1, "closeFar(1, 2, 3)");
        testcaseMap.put(2, "closeFar(4, 1, 3)");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class CloseFar
{
    public static boolean closeFar(int a, int b, int c)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            closeFar(1, 2, 10),
            closeFar(1, 2, 3),
            closeFar(4, 1, 3),
        };


        TestCases_CloseFar.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_CloseFar.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_CloseFar.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_CloseFar.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
