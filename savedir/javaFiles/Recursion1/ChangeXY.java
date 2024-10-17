package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p101372

/* Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars. */

class TestCases_ChangeXY
{
    // changeXY("codex") → "codey"
    // changeXY("xxhixx") → "yyhiyy"
    // changeXY("xhixhix") → "yhiyhiy"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "changeXY(\"codex\")");
        testcaseMap.put(1, "changeXY(\"xxhixx\")");
        testcaseMap.put(2, "changeXY(\"xhixhix\")");
    }

    static String[] expectedResults = { "codey", "yyhiyy", "yhiyhiy", };
}

public class ChangeXY
{
    public static String changeXY(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            changeXY("codex"),
            changeXY("xxhixx"),
            changeXY("xhixhix"),
        };


        TestCases_ChangeXY.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_ChangeXY.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_ChangeXY.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_ChangeXY.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
