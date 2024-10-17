package AP1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p146974

/* Given an array of scores, return true if each score is equal or greater than the one before. 
The array will be length 2 or more. */

class TestCases_ScoresIncreasing
{
    // scoresIncreasing([1, 3, 4]) → true
    // scoresIncreasing([1, 3, 2]) → false
    // scoresIncreasing([1, 1, 4]) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "scoresIncreasing([1, 3, 4])");
        testcaseMap.put(1, "scoresIncreasing([1, 3, 2])");
        testcaseMap.put(2, "scoresIncreasing([1, 1, 4])");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class ScoresIncreasing
{
    public static boolean scoresIncreasing(int[] scores)
    {
        
    }


    public static void main(String[] args)
    {
        int[] scores0 = { 1, 3, 4 }; 
        int[] scores1 = { 1, 3, 2 }; 
        int[] scores2 = { 1, 1, 4 }; 

        boolean[] resultsArray = {
            scoresIncreasing(scores0),
            scoresIncreasing(scores1),
            scoresIncreasing(scores2),
        };


        TestCases_ScoresIncreasing.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_ScoresIncreasing.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_ScoresIncreasing.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_ScoresIncreasing.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
