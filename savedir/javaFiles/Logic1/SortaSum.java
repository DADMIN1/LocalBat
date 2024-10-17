package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p183071

/* Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, 
are forbidden, so in that case just return 20. */

class TestCases_SortaSum
{
    // sortaSum(3, 4) → 7
    // sortaSum(9, 4) → 20
    // sortaSum(10, 11) → 21

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "sortaSum(3, 4)");
        testcaseMap.put(1, "sortaSum(9, 4)");
        testcaseMap.put(2, "sortaSum(10, 11)");
    }

    static int[] expectedResults = { 7, 20, 21, };
}

public class SortaSum
{
    public static int sortaSum(int a, int b)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            sortaSum(3, 4),
            sortaSum(9, 4),
            sortaSum(10, 11),
        };


        TestCases_SortaSum.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_SortaSum.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_SortaSum.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_SortaSum.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
