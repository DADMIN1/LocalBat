package String3;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p199171

/* Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it.
(Note: Character.isLetter(char) tests if a char is an alphabetic letter.) */

class TestCases_CountYZ
{
    // countYZ("fez day") → 2
    // countYZ("day fez") → 2
    // countYZ("day fyyyz") → 2

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "countYZ(\"fez day\") → 2");
        testcaseMap.put(1, "countYZ(\"day fez\") → 2");
        testcaseMap.put(2, "countYZ(\"day fyyyz\") → 2");
    }

    static int[] expectedResults = { 2, 2, 2, };
}

public class CountYZ
{
    public static int countYZ(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            countYZ("fez day"),
            countYZ("day fez"),
            countYZ("day fyyyz"),
        };


        TestCases_CountYZ.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_CountYZ.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_CountYZ.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_CountYZ.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
