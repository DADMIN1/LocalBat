package AP1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p180365

/* The "key" array is an array containing the correct answers to an exam, 
like {"a", "a", "b", "b"}. the "answers" array contains a student's answers, 
with "?" representing a question left blank. The two arrays are not empty and are the same length. 
Return the score for this array of answers, giving +4 for each correct answer, 
-1 for each incorrect answer, and +0 for each blank answer. */

class TestCases_ScoreUp
{
    // scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) → 6
    // scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"]) → 11
    // scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) → 16

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"a\", \"c\", \"b\", \"c\"])");
        testcaseMap.put(1, "scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"a\", \"a\", \"b\", \"c\"])");
        testcaseMap.put(2, "scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"a\", \"a\", \"b\", \"b\"])");
    }

    static int[] expectedResults = { 6, 11, 16, };
}

public class ScoreUp
{
    public static int scoreUp(String[] key, String[] answers)
    {
        
    }


    public static void main(String[] args)
    {
        String[] key0 = { "a", "a", "b", "b" }; String[] answers0 = { "a", "c", "b", "c" }; 
        String[] key1 = { "a", "a", "b", "b" }; String[] answers1 = { "a", "a", "b", "c" }; 
        String[] key2 = { "a", "a", "b", "b" }; String[] answers2 = { "a", "a", "b", "b" }; 

        int[] resultsArray = {
            scoreUp(key0, answers0),
            scoreUp(key1, answers1),
            scoreUp(key2, answers2),
        };


        TestCases_ScoreUp.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_ScoreUp.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_ScoreUp.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_ScoreUp.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
