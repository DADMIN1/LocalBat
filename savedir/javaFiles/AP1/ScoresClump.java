package AP1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p194530

/* Given an array of scores sorted in increasing order, 
return true if the array contains 3 adjacent scores that differ from each other by at most 2, 
such as with {3, 4, 5} or {3, 5, 5}. */

class TestCases_ScoresClump
{
    // scoresClump([3, 4, 5]) → true
    // scoresClump([3, 4, 6]) → false
    // scoresClump([1, 3, 5, 5]) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "scoresClump([3, 4, 5])");
        testcaseMap.put(1, "scoresClump([3, 4, 6])");
        testcaseMap.put(2, "scoresClump([1, 3, 5, 5])");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class ScoresClump
{
    public static boolean scoresClump(int[] scores)
    {
        
    }


    public static void main(String[] args)
    {
        int[] scores0 = { 3, 4, 5 }; 
        int[] scores1 = { 3, 4, 6 }; 
        int[] scores2 = { 1, 3, 5, 5 }; 

        boolean[] resultsArray = {
            scoresClump(scores0),
            scoresClump(scores1),
            scoresClump(scores2),
        };


        TestCases_ScoresClump.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_ScoresClump.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_ScoresClump.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_ScoresClump.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
