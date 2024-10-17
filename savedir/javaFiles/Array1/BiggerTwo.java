package Array1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p109537

/* Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. 
Return the array which has the largest sum. In event of a tie, 
return a. */

class TestCases_BiggerTwo
{
    // biggerTwo([1, 2], [3, 4]) → [3, 4]
    // biggerTwo([3, 4], [1, 2]) → [3, 4]
    // biggerTwo([1, 1], [1, 2]) → [1, 2]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "biggerTwo([1, 2], [3, 4])");
        testcaseMap.put(1, "biggerTwo([3, 4], [1, 2])");
        testcaseMap.put(2, "biggerTwo([1, 1], [1, 2])");
    }

    static int[][] expectedResults = { {3, 4}, {3, 4}, {1, 2}, };
}

public class BiggerTwo
{
    public static int[] biggerTwo(int[] a, int[] b)
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
        int[] a1 = { 3, 4 }; int[] b1 = { 1, 2 }; 
        int[] a2 = { 1, 1 }; int[] b2 = { 1, 2 }; 

        int[][] resultsArray = {
            biggerTwo(a0, b0),
            biggerTwo(a1, b1),
            biggerTwo(a2, b2),
        };


        TestCases_BiggerTwo.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(TestCases_BiggerTwo.expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_BiggerTwo.testcaseMap.get(i));
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(TestCases_BiggerTwo.expectedResults[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
