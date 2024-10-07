package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p181646

/* We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
We are in trouble if they are both smiling or if neither of them is smiling.
Return true if we are in trouble. */

class TestCases_MonkeyTrouble
{
    // monkeyTrouble(true, true) → true
    // monkeyTrouble(false, false) → true
    // monkeyTrouble(true, false) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "monkeyTrouble(true, true) → true");
        testcaseMap.put(1, "monkeyTrouble(false, false) → true");
        testcaseMap.put(2, "monkeyTrouble(true, false) → false");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class MonkeyTrouble
{
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            monkeyTrouble(true, true),
            monkeyTrouble(false, false),
            monkeyTrouble(true, false),
        };


        TestCases_MonkeyTrouble.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_MonkeyTrouble.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_MonkeyTrouble.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_MonkeyTrouble.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
