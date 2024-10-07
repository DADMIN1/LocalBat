package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p105745

/* Given two strings, append them together (known as "concatenation") and return the result.
However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string.
So "Hello" and "Hi" yield "loHi".
The strings may be any length. */

class TestCases_MinCat
{
    // minCat("Hello", "Hi") → "loHi"
    // minCat("Hello", "java") → "ellojava"
    // minCat("java", "Hello") → "javaello"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "minCat(\"Hello\", \"Hi\") → \"loHi\"");
        testcaseMap.put(1, "minCat(\"Hello\", \"java\") → \"ellojava\"");
        testcaseMap.put(2, "minCat(\"java\", \"Hello\") → \"javaello\"");
    }

    static String[] expectedResults = { "loHi", "ellojava", "javaello", };
}

public class MinCat
{
    public static String minCat(String a, String b)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            minCat("Hello", "Hi"),
            minCat("Hello", "java"),
            minCat("java", "Hello"),
        };


        TestCases_MinCat.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_MinCat.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_MinCat.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_MinCat.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
