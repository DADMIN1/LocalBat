package Warmup1.Testcases;
import Warmup1.EveryNth;

public class _EveryNth
{
    static String[] testcaseStrings = {
        "everyNth(\"Miracle\", 2)",
        "everyNth(\"abcdefg\", 2)",
        "everyNth(\"abcdefg\", 3)",
    };

    static String[] expectedResults = {
        "Mrce",
        "aceg",
        "adg",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            EveryNth.everyNth("Miracle", 2),
            EveryNth.everyNth("abcdefg", 2),
            EveryNth.everyNth("abcdefg", 3),
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
