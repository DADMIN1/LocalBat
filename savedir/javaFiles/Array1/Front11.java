package Array1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p128270

/* Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. 
If either array is length 0, ignore that array. */

class TestCases_Front11
{
    // front11([1, 2, 3], [7, 9, 8]) → [1, 7]
    // front11([1], [2]) → [1, 2]
    // front11([1, 7], []) → [1]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "front11([1, 2, 3], [7, 9, 8])");
        testcaseMap.put(1, "front11([1], [2])");
        testcaseMap.put(2, "front11([1, 7], [])");
    }

    static int[][] expectedResults = { {1, 7}, {1, 2}, {1}, };
}

public class Front11
{
    public static int[] front11(int[] a, int[] b)
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
        int[] a0 = { 1, 2, 3 }; int[] b0 = { 7, 9, 8 }; 
        int[] a1 = { 1 }; int[] b1 = { 2 }; 
        int[] a2 = { 1, 7 }; int[] b2 = {  }; 

        int[][] resultsArray = {
            front11(a0, b0),
            front11(a1, b1),
            front11(a2, b2),
        };


        TestCases_Front11.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(TestCases_Front11.expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_Front11.testcaseMap.get(i));
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(TestCases_Front11.expectedResults[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
