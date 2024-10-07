package Warmup2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p121596

/* Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ...
so "kittens" yields "kien". */

class TestCases_AltPairs
{
    // altPairs("kitten") → "kien"
    // altPairs("Chocolate") → "Chole"
    // altPairs("CodingHorror") → "Congrr"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "altPairs(\"kitten\") → \"kien\"");
        testcaseMap.put(1, "altPairs(\"Chocolate\") → \"Chole\"");
        testcaseMap.put(2, "altPairs(\"CodingHorror\") → \"Congrr\"");
    }

    static String[] expectedResults = { "kien", "Chole", "Congrr", };
}

public class AltPairs
{
    public static String altPairs(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            altPairs("kitten"),
            altPairs("Chocolate"),
            altPairs("CodingHorror"),
        };


        TestCases_AltPairs.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_AltPairs.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_AltPairs.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_AltPairs.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
