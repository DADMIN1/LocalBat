package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p142539

/* Given start and end numbers, return a new array containing the sequence of integers from start up to but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}.
The end number will be greater or equal to the start number.
Note that a length-0 array is valid.
(See also: FizzBuzz Code) */

class TestCases_FizzArray3
{
    // fizzArray3(5, 10) → [5, 6, 7, 8, 9]
    // fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
    // fizzArray3(1, 3) → [1, 2]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "fizzArray3(5, 10) → [5, 6, 7, 8, 9]");
        testcaseMap.put(1, "fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]");
        testcaseMap.put(2, "fizzArray3(1, 3) → [1, 2]");
    }

    static int[][] expectedResults = { [5, 6, 7, 8, 9], [11, 12, 13, 14, 15, 16, 17], [1, 2], };
}

public class FizzArray3
{
    public static int[] fizzArray3(int start, int end)
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
            fizzArray3(5, 10),
            fizzArray3(11, 18),
            fizzArray3(1, 3),
        };


        TestCases_FizzArray3.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_FizzArray3.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_FizzArray3.testcaseMap.get(i));
                System.out.println("    expected: "+printArray(TestCases_FizzArray3.expectedResults[i]));
                System.out.println("      result: "+printArray(resultsArray[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
