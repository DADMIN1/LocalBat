package Recursion1.Testcases;
import Recursion1.Count8;

public class _Count8
{
    static String[] testcaseStrings = {
        "count8(8)",
        "count8(818)",
        "count8(8818)",
    };

    static int[] expectedResults = {
        1,
        2,
        4,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            Count8.count8(8),
            Count8.count8(818),
            Count8.count8(8818),
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
