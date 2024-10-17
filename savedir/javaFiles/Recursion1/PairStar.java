package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p158175

/* Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*". */

class TestCases_PairStar
{
    // pairStar("hello") → "hel*lo"
    // pairStar("xxyy") → "x*xy*y"
    // pairStar("aaaa") → "a*a*a*a"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "pairStar(\"hello\")");
        testcaseMap.put(1, "pairStar(\"xxyy\")");
        testcaseMap.put(2, "pairStar(\"aaaa\")");
    }

    static String[] expectedResults = { "hel*lo", "x*xy*y", "a*a*a*a", };
}

public class PairStar
{
    public static String pairStar(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            pairStar("hello"),
            pairStar("xxyy"),
            pairStar("aaaa"),
        };


        TestCases_PairStar.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_PairStar.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_PairStar.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_PairStar.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
