package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p120633

/* You have a green lottery ticket, with ints a, b, and c on it. 
If the numbers are all different from each other, the result is 0. 
If all of the numbers are the same, the result is 20. If two of the numbers are the same, 
the result is 10. */

class TestCases_GreenTicket
{
    // greenTicket(1, 2, 3) → 0
    // greenTicket(2, 2, 2) → 20
    // greenTicket(1, 1, 2) → 10

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "greenTicket(1, 2, 3)");
        testcaseMap.put(1, "greenTicket(2, 2, 2)");
        testcaseMap.put(2, "greenTicket(1, 1, 2)");
    }

    static int[] expectedResults = { 0, 20, 10, };
}

public class GreenTicket
{
    public static int greenTicket(int a, int b, int c)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            greenTicket(1, 2, 3),
            greenTicket(2, 2, 2),
            greenTicket(1, 1, 2),
        };


        TestCases_GreenTicket.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_GreenTicket.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_GreenTicket.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_GreenTicket.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
