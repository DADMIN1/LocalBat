package String2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p170829

/* Given a string and a non-empty word string, 
return a version of the original String where all chars have been replaced by pluses ("+"), 
except for appearances of the word string which are preserved unchanged. */

class TestCases_PlusOut
{
    // plusOut("12xy34", "xy") → "++xy++"
    // plusOut("12xy34", "1") → "1+++++"
    // plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "plusOut(\"12xy34\", \"xy\")");
        testcaseMap.put(1, "plusOut(\"12xy34\", \"1\")");
        testcaseMap.put(2, "plusOut(\"12xy34xyabcxy\", \"xy\")");
    }

    static String[] expectedResults = { "++xy++", "1+++++", "++xy++xy+++xy", };
}

public class PlusOut
{
    public static String plusOut(String str, String word)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            plusOut("12xy34", "xy"),
            plusOut("12xy34", "1"),
            plusOut("12xy34xyabcxy", "xy"),
        };


        TestCases_PlusOut.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_PlusOut.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_PlusOut.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_PlusOut.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
