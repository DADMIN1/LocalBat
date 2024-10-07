package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p103360

/* You and your date are trying to get a table at a restaurant.
The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes.
The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes.
If either of you is very stylish, 8 or more, then the result is 2 (yes).
With the exception that if either of you has style of 2 or less, then the result is 0 (no).
Otherwise the result is 1 (maybe). */

class TestCases_DateFashion
{
    // dateFashion(5, 10) → 2
    // dateFashion(5, 2) → 0
    // dateFashion(5, 5) → 1

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "dateFashion(5, 10) → 2");
        testcaseMap.put(1, "dateFashion(5, 2) → 0");
        testcaseMap.put(2, "dateFashion(5, 5) → 1");
    }

    static int[] expectedResults = { 2, 0, 1, };
}

public class DateFashion
{
    public static int dateFashion(int you, int date)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            dateFashion(5, 10),
            dateFashion(5, 2),
            dateFashion(5, 5),
        };


        TestCases_DateFashion.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_DateFashion.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_DateFashion.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_DateFashion.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
