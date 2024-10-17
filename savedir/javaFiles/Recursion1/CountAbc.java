package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p161124

/* Count recursively the total number of "abc" and "aba" substrings that appear in the given string. */

class TestCases_CountAbc
{
    // countAbc("abc") → 1
    // countAbc("abcxxabc") → 2
    // countAbc("abaxxaba") → 2

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "countAbc(\"abc\")");
        testcaseMap.put(1, "countAbc(\"abcxxabc\")");
        testcaseMap.put(2, "countAbc(\"abaxxaba\")");
    }

    static int[] expectedResults = { 1, 2, 2, };
}

public class CountAbc
{
    public static int countAbc(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            countAbc("abc"),
            countAbc("abcxxabc"),
            countAbc("abaxxaba"),
        };


        TestCases_CountAbc.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_CountAbc.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_CountAbc.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_CountAbc.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
