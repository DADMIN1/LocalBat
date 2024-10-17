package String3;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p154137

/* Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". 
The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. 
(Note: Character.isLetter(char) tests if a char is a letter.) */

class TestCases_NotReplace
{
    // notReplace("is test") → "is not test"
    // notReplace("is-is") → "is not-is not"
    // notReplace("This is right") → "This is not right"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "notReplace(\"is test\")");
        testcaseMap.put(1, "notReplace(\"is-is\")");
        testcaseMap.put(2, "notReplace(\"This is right\")");
    }

    static String[] expectedResults = { "is not test", "is not-is not", "This is not right", };
}

public class NotReplace
{
    public static String notReplace(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            notReplace("is test"),
            notReplace("is-is"),
            notReplace("This is right"),
        };


        TestCases_NotReplace.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_NotReplace.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_NotReplace.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_NotReplace.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
