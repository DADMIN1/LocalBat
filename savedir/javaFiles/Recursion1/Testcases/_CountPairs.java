package Recursion1.Testcases;
import Recursion1.CountPairs;

public final class _CountPairs
{
    static final String[] testcaseStrings = {
        "countPairs(\"axa\")",
        "countPairs(\"axax\")",
        "countPairs(\"axbx\")",
        "countPairs(\"hi\")",
        "countPairs(\"hihih\")",
        "countPairs(\"ihihhh\")",
        "countPairs(\"ihjxhh\")",
        "countPairs(\"\")",
        "countPairs(\"a\")",
        "countPairs(\"aa\")",
        "countPairs(\"aaa\")",
    };

    static final int[] expectedResults = {
        1,
        2,
        1,
        0,
        3,
        3,
        0,
        0,
        0,
        0,
        1,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            CountPairs.countPairs("axa"),
            CountPairs.countPairs("axax"),
            CountPairs.countPairs("axbx"),
            CountPairs.countPairs("hi"),
            CountPairs.countPairs("hihih"),
            CountPairs.countPairs("ihihhh"),
            CountPairs.countPairs("ihjxhh"),
            CountPairs.countPairs(""),
            CountPairs.countPairs("a"),
            CountPairs.countPairs("aa"),
            CountPairs.countPairs("aaa"),
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
