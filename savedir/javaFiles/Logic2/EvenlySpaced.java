package Logic2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p198700

/* Given three ints, a b c, one of them is small, one is medium and one is large. 
Return true if the three values are evenly spaced, 
so the difference between small and medium is the same as the difference between medium and large. */

class TestCases_EvenlySpaced
{
    // evenlySpaced(2, 4, 6) → true
    // evenlySpaced(4, 6, 2) → true
    // evenlySpaced(4, 6, 3) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "evenlySpaced(2, 4, 6)");
        testcaseMap.put(1, "evenlySpaced(4, 6, 2)");
        testcaseMap.put(2, "evenlySpaced(4, 6, 3)");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class EvenlySpaced
{
    public static boolean evenlySpaced(int a, int b, int c)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            evenlySpaced(2, 4, 6),
            evenlySpaced(4, 6, 2),
            evenlySpaced(4, 6, 3),
        };


        TestCases_EvenlySpaced.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_EvenlySpaced.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_EvenlySpaced.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_EvenlySpaced.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
