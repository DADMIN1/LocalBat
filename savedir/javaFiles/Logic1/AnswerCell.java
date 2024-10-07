package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p110973

/* Your cell phone rings.
Return true if you should answer it.
Normally you answer, except in the morning you only answer if it is your mom calling.
In all cases, if you are asleep, you do not answer. */

class TestCases_AnswerCell
{
    // answerCell(false, false, false) → true
    // answerCell(false, false, true) → false
    // answerCell(true, false, false) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "answerCell(false, false, false) → true");
        testcaseMap.put(1, "answerCell(false, false, true) → false");
        testcaseMap.put(2, "answerCell(true, false, false) → false");
    }

    static boolean[] expectedResults = { true, false, false, };
}

public class AnswerCell
{
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            answerCell(false, false, false),
            answerCell(false, false, true),
            answerCell(true, false, false),
        };


        TestCases_AnswerCell.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_AnswerCell.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_AnswerCell.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_AnswerCell.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
