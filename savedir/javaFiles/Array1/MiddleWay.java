package Array1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p146449

/* Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements. */

class TestCases_MiddleWay
{
    // middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
    // middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
    // middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]");
        testcaseMap.put(1, "middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]");
        testcaseMap.put(2, "middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]");
    }

    static int[][] expectedResults = { {2, 5}, {7, 8}, {2, 4}, };
}

public class MiddleWay
{
    public static int[] middleWay(int[] a, int[] b)
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
        int[] a0 = { 1, 2, 3 }; int[] b0 = { 4, 5, 6 }; 
        int[] a1 = { 7, 7, 7 }; int[] b1 = { 3, 8, 0 }; 
        int[] a2 = { 5, 2, 9 }; int[] b2 = { 1, 4, 5 }; 

        int[][] resultsArray = {
            middleWay(a0, b0),
            middleWay(a1, b1),
            middleWay(a2, b2),
        };


        TestCases_MiddleWay.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_MiddleWay.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_MiddleWay.testcaseMap.get(i));
                System.out.println("    expected: "+printArray(TestCases_MiddleWay.expectedResults[i]));
                System.out.println("      result: "+printArray(resultsArray[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
