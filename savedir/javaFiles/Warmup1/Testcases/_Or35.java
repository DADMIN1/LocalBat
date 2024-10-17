package Warmup1.Testcases;
import Warmup1.Or35;

public class _Or35
{
    static String[] testcaseStrings = {
        "or35(3)",
        "or35(10)",
        "or35(8)",
    };

    static boolean[] expectedResults = { true, true, false, };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            Or35.or35(3),
            Or35.or35(10),
            Or35.or35(8),
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
