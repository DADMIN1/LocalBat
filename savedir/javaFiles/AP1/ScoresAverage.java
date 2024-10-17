package AP1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p123837

/* Given an array of scores, compute the int average of the first half and the second half, 
and return whichever is larger. We'll say that the second half begins at index length/2. 
The array length will be at least 2. To practice decomposition, 
write a separate helper methodint average(int[] scores, 
int start, int end) { which computes the average of the elements between indexes start..end. 
Call your helper method twice to implement scoresAverage(). 
Write your helper method after your scoresAverage() method in the JavaBat text area. 
Normally you would compute averages with doubles, but here we use ints so the expected results are exact. */

class TestCases_ScoresAverage
{
    // scoresAverage([2, 2, 4, 4]) → 4
    // scoresAverage([4, 4, 4, 2, 2, 2]) → 4
    // scoresAverage([3, 4, 5, 1, 2, 3]) → 4

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "scoresAverage([2, 2, 4, 4])");
        testcaseMap.put(1, "scoresAverage([4, 4, 4, 2, 2, 2])");
        testcaseMap.put(2, "scoresAverage([3, 4, 5, 1, 2, 3])");
    }

    static int[] expectedResults = { 4, 4, 4, };
}

public class ScoresAverage
{
    public static int scoresAverage(int[] scores)
    {
        
    }


    public static void main(String[] args)
    {
        int[] scores0 = { 2, 2, 4, 4 }; 
        int[] scores1 = { 4, 4, 4, 2, 2, 2 }; 
        int[] scores2 = { 3, 4, 5, 1, 2, 3 }; 

        int[] resultsArray = {
            scoresAverage(scores0),
            scoresAverage(scores1),
            scoresAverage(scores2),
        };


        TestCases_ScoresAverage.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_ScoresAverage.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_ScoresAverage.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_ScoresAverage.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
