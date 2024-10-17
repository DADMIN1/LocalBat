package AP1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p179487

/* Given an array of scores, 
return true if there are scores of 100 next to each other in the array. 
The array length will be at least 2. */

class TestCases_Scores100
{
    // scores100([1, 100, 100]) → true
    // scores100([1, 100, 99, 100]) → false
    // scores100([100, 1, 100, 100]) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "scores100([1, 100, 100])");
        testcaseMap.put(1, "scores100([1, 100, 99, 100])");
        testcaseMap.put(2, "scores100([100, 1, 100, 100])");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class Scores100
{
    public static boolean scores100(int[] scores)
    {
        
    }


    public static void main(String[] args)
    {
        int[] scores0 = { 1, 100, 100 }; 
        int[] scores1 = { 1, 100, 99, 100 }; 
        int[] scores2 = { 100, 1, 100, 100 }; 

        boolean[] resultsArray = {
            scores100(scores0),
            scores100(scores1),
            scores100(scores2),
        };


        TestCases_Scores100.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Scores100.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_Scores100.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_Scores100.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
