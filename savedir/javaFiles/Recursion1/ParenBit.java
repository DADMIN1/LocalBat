package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p137918

/* Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)". */

class TestCases_ParenBit
{
    // parenBit("xyz(abc)123") → "(abc)"
    // parenBit("x(hello)") → "(hello)"
    // parenBit("(xy)1") → "(xy)"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "parenBit(\"xyz(abc)123\") → \"(abc)\"");
        testcaseMap.put(1, "parenBit(\"x(hello)\") → \"(hello)\"");
        testcaseMap.put(2, "parenBit(\"(xy)1\") → \"(xy)\"");
    }

    static String[] expectedResults = { "(abc)", "(hello)", "(xy)", };
}

public class ParenBit
{
    public static String parenBit(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            parenBit("xyz(abc)123"),
            parenBit("x(hello)"),
            parenBit("(xy)1"),
        };


        TestCases_ParenBit.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_ParenBit.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_ParenBit.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_ParenBit.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
