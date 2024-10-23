package Warmup1.Testcases;
import Warmup1.Diff21;

public class _Diff21
{
    static String[] testcaseStrings = {
        "diff21(19)",
        "diff21(10)",
        "diff21(21)",
    };

    static int[] expectedResults = {
        2,
        11,
        0,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            Diff21.diff21(19),
            Diff21.diff21(10),
            Diff21.diff21(21),
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
