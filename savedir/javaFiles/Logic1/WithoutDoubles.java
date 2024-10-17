package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p115233

/* Return the sum of two 6-sided dice rolls, each in the range 1..6. 
However, if noDoubles is true, if the two dice show the same value, 
increment one die to the next value, wrapping around to 1 if its value was 6. */

class TestCases_WithoutDoubles
{
    // withoutDoubles(2, 3, true) → 5
    // withoutDoubles(3, 3, true) → 7
    // withoutDoubles(3, 3, false) → 6

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "withoutDoubles(2, 3, true)");
        testcaseMap.put(1, "withoutDoubles(3, 3, true)");
        testcaseMap.put(2, "withoutDoubles(3, 3, false)");
    }

    static int[] expectedResults = { 5, 7, 6, };
}

public class WithoutDoubles
{
    public static int withoutDoubles(int die1, int die2, boolean noDoubles)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            withoutDoubles(2, 3, true),
            withoutDoubles(3, 3, true),
            withoutDoubles(3, 3, false),
        };


        TestCases_WithoutDoubles.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_WithoutDoubles.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_WithoutDoubles.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_WithoutDoubles.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
