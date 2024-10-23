package Recursion1.Testcases;
import Recursion1.Count7;

public class _Count7
{
    static String[] testcaseStrings = {
        "count7(717)",
        "count7(7)",
        "count7(123)",
    };

    static int[] expectedResults = {
        2,
        1,
        0,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            Count7.count7(717),
            Count7.count7(7),
            Count7.count7(123),
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
