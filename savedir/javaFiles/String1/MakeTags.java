package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p147483

/* The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
Given tag and word strings, create the HTML string with tags around the word, e.g.
"<i>Yay</i>". */

class TestCases_MakeTags
{
    // makeTags("i", "Yay") → "<i>Yay</i>"
    // makeTags("i", "Hello") → "<i>Hello</i>"
    // makeTags("cite", "Yay") → "<cite>Yay</cite>"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "makeTags(\"i\", \"Yay\") → \"<i>Yay</i>\"");
        testcaseMap.put(1, "makeTags(\"i\", \"Hello\") → \"<i>Hello</i>\"");
        testcaseMap.put(2, "makeTags(\"cite\", \"Yay\") → \"<cite>Yay</cite>\"");
    }

    static String[] expectedResults = { "<i>Yay</i>", "<i>Hello</i>", "<cite>Yay</cite>", };
}

public class MakeTags
{
    public static String makeTags(String tag, String word)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            makeTags("i", "Yay"),
            makeTags("i", "Hello"),
            makeTags("cite", "Yay"),
        };


        TestCases_MakeTags.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_MakeTags.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_MakeTags.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_MakeTags.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
