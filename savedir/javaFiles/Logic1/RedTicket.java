package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p170833

/* You have a red lottery ticket showing ints a, b, and c, 
each of which is 0, 1, or 2. If they are all the value 2, 
the result is 10. Otherwise if they are all the same, the result is 5. 
Otherwise so long as both b and c are different from a, 
the result is 1. Otherwise the result is 0. */

class TestCases_RedTicket
{
    // redTicket(2, 2, 2) → 10
    // redTicket(2, 2, 1) → 0
    // redTicket(0, 0, 0) → 5

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "redTicket(2, 2, 2)");
        testcaseMap.put(1, "redTicket(2, 2, 1)");
        testcaseMap.put(2, "redTicket(0, 0, 0)");
    }

    static int[] expectedResults = { 10, 0, 5, };
}

public class RedTicket
{
    public static int redTicket(int a, int b, int c)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            redTicket(2, 2, 2),
            redTicket(2, 2, 1),
            redTicket(0, 0, 0),
        };


        TestCases_RedTicket.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_RedTicket.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_RedTicket.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_RedTicket.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
