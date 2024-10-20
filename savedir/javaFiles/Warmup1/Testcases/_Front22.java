package Warmup1.Testcases;
import Warmup1.Front22;

public class _Front22
{
    static String[] testcaseStrings = {
        "front22(\"kitten\")",
        "front22(\"Ha\")",
        "front22(\"abc\")",
    };

    static String[] expectedResults = { "kikittenki", "HaHaHa", "ababcab", };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            Front22.front22("kitten"),
            Front22.front22("Ha"),
            Front22.front22("abc"),
        };

        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("\n[-] #"+(i+1)+" failed!");
                System.out.println(testcaseStrings[i]+";");
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+expectedResults[i]);
                System.out.println("\n");
            } else if (printSuccess) { 
                System.out.println("[✔] #"+(i+1)+" - "+testcaseStrings[i]);
            }
        }
        if (allTestsPassed) System.out.println("\n ✔✔✔  ~ All tests passed. ~  ✔✔✔");
        System.out.println();
        return;
    }
}
