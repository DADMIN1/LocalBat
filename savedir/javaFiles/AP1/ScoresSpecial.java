package AP1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p140485

/* Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a multiple of 10, 
such as 40 or 90. Return the sum of largest special score in A and the largest special score in B. 
To practice decomposition, 
write a separate helper method which finds the largest special score in an array. 
Write your helper method after your scoresSpecial() method in the JavaBat text area. */

class TestCases_ScoresSpecial
{
    // scoresSpecial([12, 10, 4], [2, 20, 30]) → 40
    // scoresSpecial([20, 10, 4], [2, 20, 10]) → 40
    // scoresSpecial([12, 11, 4], [2, 20, 31]) → 20

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "scoresSpecial([12, 10, 4], [2, 20, 30])");
        testcaseMap.put(1, "scoresSpecial([20, 10, 4], [2, 20, 10])");
        testcaseMap.put(2, "scoresSpecial([12, 11, 4], [2, 20, 31])");
    }

    static int[] expectedResults = { 40, 40, 20, };
}

public class ScoresSpecial
{
    public static int scoresSpecial(int[] a, int[] b)
    {
        
    }


    public static void main(String[] args)
    {
        int[] a0 = { 12, 10, 4 }; int[] b0 = { 2, 20, 30 }; 
        int[] a1 = { 20, 10, 4 }; int[] b1 = { 2, 20, 10 }; 
        int[] a2 = { 12, 11, 4 }; int[] b2 = { 2, 20, 31 }; 

        int[] resultsArray = {
            scoresSpecial(a0, b0),
            scoresSpecial(a1, b1),
            scoresSpecial(a2, b2),
        };


        TestCases_ScoresSpecial.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_ScoresSpecial.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_ScoresSpecial.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_ScoresSpecial.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
