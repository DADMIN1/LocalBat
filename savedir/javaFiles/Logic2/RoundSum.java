package Logic2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p186753

/* For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, 
so 15 rounds up to 20. Alternately, 
round down to the previous multiple of 10 if its rightmost digit is less than 5, 
so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. 
To avoid code repetition, 
write a separate helper "public int round10(int num) {" and call it 3 times. 
Write the helper entirely below and at the same indent level as roundSum(). */

class TestCases_RoundSum
{
    // roundSum(16, 17, 18) → 60
    // roundSum(12, 13, 14) → 30
    // roundSum(6, 4, 4) → 10

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "roundSum(16, 17, 18)");
        testcaseMap.put(1, "roundSum(12, 13, 14)");
        testcaseMap.put(2, "roundSum(6, 4, 4)");
    }

    static int[] expectedResults = { 60, 30, 10, };
}

public class RoundSum
{
    public static int roundSum(int a, int b, int c)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            roundSum(16, 17, 18),
            roundSum(12, 13, 14),
            roundSum(6, 4, 4),
        };


        TestCases_RoundSum.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_RoundSum.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_RoundSum.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_RoundSum.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
