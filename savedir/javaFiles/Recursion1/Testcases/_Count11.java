package Recursion1.Testcases;
import Recursion1.Count11;

public class _Count11
{
    static String[] testcaseStrings = {
        "count11(\"11abc11\")",
        "count11(\"abc11x11x11\")",
        "count11(\"111\")",
    };

    static int[] expectedResults = {
        2,
        3,
        1,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            Count11.count11("11abc11"),
            Count11.count11("abc11x11x11"),
            Count11.count11("111"),
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
