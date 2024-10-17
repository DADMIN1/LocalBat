package Recursion1.Testcases;
import Recursion1.CountPairs;

public class _CountPairs
{
    static String[] testcaseStrings = {
        "countPairs(\"axa\")",
        "countPairs(\"axax\")",
        "countPairs(\"axbx\")",
    };

    static int[] expectedResults = { 1, 2, 1, };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            CountPairs.countPairs("axa"),
            CountPairs.countPairs("axax"),
            CountPairs.countPairs("axbx"),
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
