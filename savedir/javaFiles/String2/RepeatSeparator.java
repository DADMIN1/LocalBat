package String2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p109637

/* Given two strings, word and a separator sep, return a big string made of count occurrences of the word, 
separated by the separator string. */

class TestCases_RepeatSeparator
{
    // repeatSeparator("Word", "X", 3) → "WordXWordXWord"
    // repeatSeparator("This", "And", 2) → "ThisAndThis"
    // repeatSeparator("This", "And", 1) → "This"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "repeatSeparator(\"Word\", \"X\", 3)");
        testcaseMap.put(1, "repeatSeparator(\"This\", \"And\", 2)");
        testcaseMap.put(2, "repeatSeparator(\"This\", \"And\", 1)");
    }

    static String[] expectedResults = { "WordXWordXWord", "ThisAndThis", "This", };
}

public class RepeatSeparator
{
    public static String repeatSeparator(String word, String sep, int count)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            repeatSeparator("Word", "X", 3),
            repeatSeparator("This", "And", 2),
            repeatSeparator("This", "And", 1),
        };


        TestCases_RepeatSeparator.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_RepeatSeparator.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_RepeatSeparator.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_RepeatSeparator.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
