package String3;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p121193

/* Given a string, return the sum of the numbers appearing in the string, 
ignoring all other characters. A number is a series of 1 or more digit chars in a row. 
(Note: Character.isDigit(char) tests if a char is one of the chars '0', 
'1', .. '9'. Integer.parseInt(string) converts a string to an int.) */

class TestCases_SumNumbers
{
    // sumNumbers("abc123xyz") → 123
    // sumNumbers("aa11b33") → 44
    // sumNumbers("7 11") → 18

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "sumNumbers(\"abc123xyz\")");
        testcaseMap.put(1, "sumNumbers(\"aa11b33\")");
        testcaseMap.put(2, "sumNumbers(\"7 11\")");
    }

    static int[] expectedResults = { 123, 44, 18, };
}

public class SumNumbers
{
    public static int sumNumbers(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            sumNumbers("abc123xyz"),
            sumNumbers("aa11b33"),
            sumNumbers("7 11"),
        };


        TestCases_SumNumbers.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_SumNumbers.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_SumNumbers.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_SumNumbers.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
