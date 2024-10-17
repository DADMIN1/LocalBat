package Array1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p167011

/* Return an int array length 3 containing the first 3 digits of pi, 
{3, 1, 4}. */

class TestCases_MakePi
{
    // makePi() → [3, 1, 4]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "makePi()");
    }

    static int[][] expectedResults = { [3, 1, 4], };
}

public class MakePi
{
    public static int[] makePi()
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
            makePi(),
        };


        TestCases_MakePi.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(TestCases_MakePi.expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_MakePi.testcaseMap.get(i));
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(TestCases_MakePi.expectedResults[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
