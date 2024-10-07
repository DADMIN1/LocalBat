package String2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p147448

/* Return the number of times that the string "hi" appears anywhere in the given string. */

class TestCases_CountHi
{
    // countHi("abc hi ho") → 1
    // countHi("ABChi hi") → 2
    // countHi("hihi") → 2

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "countHi(\"abc hi ho\") → 1");
        testcaseMap.put(1, "countHi(\"ABChi hi\") → 2");
        testcaseMap.put(2, "countHi(\"hihi\") → 2");
    }

    static int[] expectedResults = { 1, 2, 2, };
}

public class CountHi
{
    public static int countHi(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            countHi("abc hi ho"),
            countHi("ABChi hi"),
            countHi("hihi"),
        };


        TestCases_CountHi.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_CountHi.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_CountHi.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_CountHi.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
