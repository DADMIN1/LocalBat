package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p100905

/* Given a string, if the string "del" appears starting at index 1, 
return a string where that "del" has been deleted. Otherwise, 
return the string unchanged. */

class TestCases_DelDel
{
    // delDel("adelbc") → "abc"
    // delDel("adelHello") → "aHello"
    // delDel("adedbc") → "adedbc"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "delDel(\"adelbc\")");
        testcaseMap.put(1, "delDel(\"adelHello\")");
        testcaseMap.put(2, "delDel(\"adedbc\")");
    }

    static String[] expectedResults = { "abc", "aHello", "adedbc", };
}

public class DelDel
{
    public static String delDel(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            delDel("adelbc"),
            delDel("adelHello"),
            delDel("adedbc"),
        };


        TestCases_DelDel.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_DelDel.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_DelDel.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_DelDel.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
