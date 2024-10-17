package String3;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p197890

/* Given a string, return the sum of the digits 0-9 that appear in the string, 
ignoring all other characters. Return 0 if there are no digits in the string. 
(Note: Character.isDigit(char) tests if a char is one of the chars '0', 
'1', .. '9'. Integer.parseInt(string) converts a string to an int.) */

class TestCases_SumDigits
{
    // sumDigits("aa1bc2d3") → 6
    // sumDigits("aa11b33") → 8
    // sumDigits("Chocolate") → 0

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "sumDigits(\"aa1bc2d3\")");
        testcaseMap.put(1, "sumDigits(\"aa11b33\")");
        testcaseMap.put(2, "sumDigits(\"Chocolate\")");
    }

    static int[] expectedResults = { 6, 8, 0, };
}

public class SumDigits
{
    public static int sumDigits(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            sumDigits("aa1bc2d3"),
            sumDigits("aa11b33"),
            sumDigits("Chocolate"),
        };


        TestCases_SumDigits.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_SumDigits.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_SumDigits.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_SumDigits.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
