package Array1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p109660

/* Start with 2 int arrays, a and b, of any length.
Return how many of the arrays have 1 as their first element. */

class TestCases_Start1
{
    // start1([1, 2, 3], [1, 3]) → 2
    // start1([7, 2, 3], [1]) → 1
    // start1([1, 2], []) → 1

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "start1([1, 2, 3], [1, 3]) → 2");
        testcaseMap.put(1, "start1([7, 2, 3], [1]) → 1");
        testcaseMap.put(2, "start1([1, 2], []) → 1");
    }

    static int[] expectedResults = { 2, 1, 1, };
}

public class Start1
{
    public static int start1(int[] a, int[] b)
    {
        
    }


    public static void main(String[] args)
    {
        int[] a0 = { 1, 2, 3 }; int[] b0 = { 1, 3 }; 
        int[] a1 = { 7, 2, 3 }; int[] b1 = { 1 }; 
        int[] a2 = { 1, 2 }; int[] b2 = {  }; 

        int[] resultsArray = {
            start1(a0, b0),
            start1(a1, b1),
            start1(a2, b2),
        };


        TestCases_Start1.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Start1.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Start1.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_Start1.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
