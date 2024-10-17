package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p170924

/* Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14". */

class TestCases_ChangePi
{
    // changePi("xpix") → "x3.14x"
    // changePi("pipi") → "3.143.14"
    // changePi("pip") → "3.14p"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "changePi(\"xpix\")");
        testcaseMap.put(1, "changePi(\"pipi\")");
        testcaseMap.put(2, "changePi(\"pip\")");
    }

    static String[] expectedResults = { "x3.14x", "3.143.14", "3.14p", };
}

public class ChangePi
{
    public static String changePi(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            changePi("xpix"),
            changePi("pipi"),
            changePi("pip"),
        };


        TestCases_ChangePi.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_ChangePi.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_ChangePi.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_ChangePi.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
