package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p112564

/* Return true if the given non-negative number is a multiple of 3 or a multiple of 5. 
Use the % "mod" operator -- see Introduction to Mod */

class TestCases_Or35
{
    // or35(3) → true
    // or35(10) → true
    // or35(8) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "or35(3)");
        testcaseMap.put(1, "or35(10)");
        testcaseMap.put(2, "or35(8)");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class Or35
{
    public static boolean or35(int n)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            or35(3),
            or35(10),
            or35(8),
        };


        TestCases_Or35.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Or35.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_Or35.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_Or35.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
