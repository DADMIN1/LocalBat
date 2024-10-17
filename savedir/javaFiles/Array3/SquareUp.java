package Array3;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p155405

/* Given n>=0, create an array length n*n with the following pattern, 
shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups). */

class TestCases_SquareUp
{
    // squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
    // squareUp(2) → [0, 1, 2, 1]
    // squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "squareUp(3)");
        testcaseMap.put(1, "squareUp(2)");
        testcaseMap.put(2, "squareUp(4)");
    }

    static int[][] expectedResults = { [0, 0, 1, 0, 2, 1, 3, 2, 1], [0, 1, 2, 1], [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1], };
}

public class SquareUp
{
    public static int[] squareUp(int n)
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
            squareUp(3),
            squareUp(2),
            squareUp(4),
        };


        TestCases_SquareUp.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(TestCases_SquareUp.expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_SquareUp.testcaseMap.get(i));
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(TestCases_SquareUp.expectedResults[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
