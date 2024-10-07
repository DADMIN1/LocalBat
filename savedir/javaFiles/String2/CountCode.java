package String2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p123614

/* Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count. */

class TestCases_CountCode
{
    // countCode("aaacodebbb") → 1
    // countCode("codexxcode") → 2
    // countCode("cozexxcope") → 2

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "countCode(\"aaacodebbb\") → 1");
        testcaseMap.put(1, "countCode(\"codexxcode\") → 2");
        testcaseMap.put(2, "countCode(\"cozexxcope\") → 2");
    }

    static int[] expectedResults = { 1, 2, 2, };
}

public class CountCode
{
    public static int countCode(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            countCode("aaacodebbb"),
            countCode("codexxcode"),
            countCode("cozexxcope"),
        };


        TestCases_CountCode.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_CountCode.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_CountCode.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_CountCode.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
