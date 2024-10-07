package String2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p122943

/* Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca".
Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd".
Ignore any group of fewer than 3 chars at the end. */

class TestCases_OneTwo
{
    // oneTwo("abc") → "bca"
    // oneTwo("tca") → "cat"
    // oneTwo("tcagdo") → "catdog"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "oneTwo(\"abc\") → \"bca\"");
        testcaseMap.put(1, "oneTwo(\"tca\") → \"cat\"");
        testcaseMap.put(2, "oneTwo(\"tcagdo\") → \"catdog\"");
    }

    static String[] expectedResults = { "bca", "cat", "catdog", };
}

public class OneTwo
{
    public static String oneTwo(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            oneTwo("abc"),
            oneTwo("tca"),
            oneTwo("tcagdo"),
        };


        TestCases_OneTwo.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_OneTwo.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_OneTwo.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_OneTwo.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
