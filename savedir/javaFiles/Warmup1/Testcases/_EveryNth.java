package Warmup1.Testcases;
import Warmup1.EveryNth;

public final class _EveryNth
{
    static final String[] testcaseStrings = {
        "everyNth(\"Miracle\", 2)",
        "everyNth(\"abcdefg\", 2)",
        "everyNth(\"abcdefg\", 3)",
        "everyNth(\"Chocolate\", 3)",
        "everyNth(\"Chocolates\", 3)",
        "everyNth(\"Chocolates\", 4)",
        "everyNth(\"Chocolates\", 100)",
    };

    static final String[] expectedResults = {
        "Mrce",
        "aceg",
        "adg",
        "Cca",
        "Ccas",
        "Coe",
        "C",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            EveryNth.everyNth("Miracle", 2),
            EveryNth.everyNth("abcdefg", 2),
            EveryNth.everyNth("abcdefg", 3),
            EveryNth.everyNth("Chocolate", 3),
            EveryNth.everyNth("Chocolates", 3),
            EveryNth.everyNth("Chocolates", 4),
            EveryNth.everyNth("Chocolates", 100),
        };

        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(expectedResults[i]))
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
