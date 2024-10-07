package Array3;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p104090

/* Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ...
1, 2, 3 ..
n} (spaces added to show the grouping).
Note that the length of the array will be 1 + 2 + 3 ...
+ n, which is known to sum to exactly n*(n + 1)/2. */

class TestCases_SeriesUp
{
    // seriesUp(3) → [1, 1, 2, 1, 2, 3]
    // seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
    // seriesUp(2) → [1, 1, 2]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "seriesUp(3) → [1, 1, 2, 1, 2, 3]");
        testcaseMap.put(1, "seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]");
        testcaseMap.put(2, "seriesUp(2) → [1, 1, 2]");
    }

    static int[][] expectedResults = { [1, 1, 2, 1, 2, 3], [1, 1, 2, 1, 2, 3, 1, 2, 3, 4], [1, 1, 2], };
}

public class SeriesUp
{
    public static int[] seriesUp(int n)
    {
        
    }


    public static String printArray(int[] array)
    {
        String result = "[";
        for (int a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static void main(String[] args)
    {
                        
        int[][] resultsArray = {
            seriesUp(3),
            seriesUp(4),
            seriesUp(2),
        };


        TestCases_SeriesUp.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_SeriesUp.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_SeriesUp.testcaseMap.get(i));
                System.out.println("    expected: "+printArray(TestCases_SeriesUp.expectedResults[i]));
                System.out.println("      result: "+printArray(resultsArray[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
