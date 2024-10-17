package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p192267

/* You have a blue lottery ticket, with ints a, b, and c on it. 
This makes three pairs, which we'll call ab, bc, and ac. 
Consider the sum of the numbers in each pair. If any pair sums to exactly 10, 
the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums, 
the result is 5. Otherwise the result is 0. */

class TestCases_BlueTicket
{
    // blueTicket(9, 1, 0) → 10
    // blueTicket(9, 2, 0) → 0
    // blueTicket(6, 1, 4) → 10

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "blueTicket(9, 1, 0)");
        testcaseMap.put(1, "blueTicket(9, 2, 0)");
        testcaseMap.put(2, "blueTicket(6, 1, 4)");
    }

    static int[] expectedResults = { 10, 0, 10, };
}

public class BlueTicket
{
    public static int blueTicket(int a, int b, int c)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            blueTicket(9, 1, 0),
            blueTicket(9, 2, 0),
            blueTicket(6, 1, 4),
        };


        TestCases_BlueTicket.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_BlueTicket.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_BlueTicket.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_BlueTicket.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
