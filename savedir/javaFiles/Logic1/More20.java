package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p118290

/* Return true if the given non-negative number is 1 or 2 more than a multiple of 20. 
See also: Introduction to Mod */

class TestCases_More20
{
    // more20(20) → false
    // more20(21) → true
    // more20(22) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "more20(20)");
        testcaseMap.put(1, "more20(21)");
        testcaseMap.put(2, "more20(22)");
    }

    static boolean[] expectedResults = { false, true, true, };
}

public class More20
{
    public static boolean more20(int n)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            more20(20),
            more20(21),
            more20(22),
        };


        TestCases_More20.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_More20.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_More20.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_More20.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
