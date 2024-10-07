package Array1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p143461

/* Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b.
The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays. */

class TestCases_Make2
{
    // make2([4, 5], [1, 2, 3]) → [4, 5]
    // make2([4], [1, 2, 3]) → [4, 1]
    // make2([], [1, 2]) → [1, 2]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "make2([4, 5], [1, 2, 3]) → [4, 5]");
        testcaseMap.put(1, "make2([4], [1, 2, 3]) → [4, 1]");
        testcaseMap.put(2, "make2([], [1, 2]) → [1, 2]");
    }

    static int[][] expectedResults = { {4, 5}, {4, 1}, {1, 2}, };
}

public class Make2
{
    public static int[] make2(int[] a, int[] b)
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
        int[] a0 = { 4, 5 }; int[] b0 = { 1, 2, 3 }; 
        int[] a1 = { 4 }; int[] b1 = { 1, 2, 3 }; 
        int[] a2 = {  }; int[] b2 = { 1, 2 }; 

        int[][] resultsArray = {
            make2(a0, b0),
            make2(a1, b1),
            make2(a2, b2),
        };


        TestCases_Make2.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Make2.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Make2.testcaseMap.get(i));
                System.out.println("    expected: "+printArray(TestCases_Make2.expectedResults[i]));
                System.out.println("      result: "+printArray(resultsArray[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
