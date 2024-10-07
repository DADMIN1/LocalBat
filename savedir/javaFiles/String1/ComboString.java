package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p168564

/* Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.
The strings will not be the same length, but they may be empty (length 0). */

class TestCases_ComboString
{
    // comboString("Hello", "hi") → "hiHellohi"
    // comboString("hi", "Hello") → "hiHellohi"
    // comboString("aaa", "b") → "baaab"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "comboString(\"Hello\", \"hi\") → \"hiHellohi\"");
        testcaseMap.put(1, "comboString(\"hi\", \"Hello\") → \"hiHellohi\"");
        testcaseMap.put(2, "comboString(\"aaa\", \"b\") → \"baaab\"");
    }

    static String[] expectedResults = { "hiHellohi", "hiHellohi", "baaab", };
}

public class ComboString
{
    public static String comboString(String a, String b)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            comboString("Hello", "hi"),
            comboString("hi", "Hello"),
            comboString("aaa", "b"),
        };


        TestCases_ComboString.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_ComboString.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_ComboString.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_ComboString.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
