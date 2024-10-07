package Array1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p180840

/* Given 2 int arrays, each length 2, return a new array length 4 containing all their elements. */

class TestCases_PlusTwo
{
    // plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
    // plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
    // plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]");
        testcaseMap.put(1, "plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]");
        testcaseMap.put(2, "plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]");
    }

    static int[][] expectedResults = { {1, 2, 3, 4}, {4, 4, 2, 2}, {9, 2, 3, 4}, };
}

public class PlusTwo
{
    public static int[] plusTwo(int[] a, int[] b)
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
        int[] a0 = { 1, 2 }; int[] b0 = { 3, 4 }; 
        int[] a1 = { 4, 4 }; int[] b1 = { 2, 2 }; 
        int[] a2 = { 9, 2 }; int[] b2 = { 3, 4 }; 

        int[][] resultsArray = {
            plusTwo(a0, b0),
            plusTwo(a1, b1),
            plusTwo(a2, b2),
        };


        TestCases_PlusTwo.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_PlusTwo.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_PlusTwo.testcaseMap.get(i));
                System.out.println("    expected: "+printArray(TestCases_PlusTwo.expectedResults[i]));
                System.out.println("      result: "+printArray(resultsArray[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
